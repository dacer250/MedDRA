package com.gzpykj.chps.meddra.parser;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TokenTargetTypeConvert {
    public Object convert (Class<?> targetType,String value) {
        Object result = null;
        if(targetType.equals(String.class)) {
            result =value;
        }
        if(targetType.equals(Long.class)) {
            result = Long.parseLong(value);
        }
        if(targetType.equals(Integer.class)) {
            result = Integer.parseInt(value);
        }
        if(targetType.equals(Date.class)) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            try {
                result = sdf.parse(value);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        return result;
    }
}
