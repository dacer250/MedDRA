package com.gzpykj.chps.meddra.parser;

import com.gzpykj.chps.meddra.annotation.TokenIndex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MedDRAFileParser {

    private TokenTargetTypeConvert convert = new TokenTargetTypeConvert();

    public <T> List<T> parseTerm(Reader reader,Class<T> clazz) {
        if(reader == null) return null;
        BufferedReader buffReader =  new BufferedReader(reader);
        List<String []> termList = new ArrayList<>();
        String term;
        try {
            while (buffReader.ready()) {
                term = buffReader.readLine();
                termList.add(splitTerm(term));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
                buffReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return tokenHandle(termList,clazz);
    }

    private String[] splitTerm(String term){
        String [] terms = term.split("\\$",-1);
        String [] array = new String[terms.length - 1];
        System.arraycopy(terms,0,array,0,terms.length - 1);
        return array ;
    }

    private <T> List<T> tokenHandle(List<String[]> tokenList,Class<T> clazz) {
        List<T> result = new ArrayList<>(tokenList.size());
        Field[] fields = clazz.getDeclaredFields();
        AccessibleObject.setAccessible(fields, true);
        Map<Integer, Field> map = new HashMap<>();

        for (Field field : fields) {
            TokenIndex annotation = field.getDeclaredAnnotation(TokenIndex.class);
            if (annotation != null) {
                int index = annotation.index();
                map.put(index, field);
            }
        }

        for (String[] token : tokenList) {
            try {
                T term = null;
                for (int i = 0; i < token.length; i++) {
                    String t = token[i];
                    if (t.length() > 0 && map.containsKey(i)) {
                        if (term == null) {
                            term = clazz.newInstance();
                        }
                        String fieldName = map.get(i).getName();
                        Class<?> targetType = map.get(i).getType();
                        String methodName = "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
                        Object v = convert.convert(targetType, t);
                        clazz.getMethod(methodName, targetType).invoke(term, v);
                    }
                }
                result.add(term);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
