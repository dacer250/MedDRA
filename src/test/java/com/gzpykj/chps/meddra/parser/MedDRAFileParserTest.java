package com.gzpykj.chps.meddra.parser;

import com.gzpykj.chps.meddra.entity.SocTerm;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.junit.Test;

import java.io.*;
import java.sql.Connection;
import java.util.List;


public class MedDRAFileParserTest {

    @Test
    public void parseTerm() throws FileNotFoundException {
        MedDRAFileParser parser = new MedDRAFileParser();
        FileReader fileReader = new FileReader("D:\\ProgramData\\IdeaProjects\\MedDRA\\doc\\medfiles\\ascii-210\\soc.asc");

        List<SocTerm> list = parser.parseTerm(fileReader, SocTerm.class);
        System.out.println("大小："+list.size());
        list.stream().forEach(System.out::println);

    }

    @Test
    public void test2 () throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(reader);
        System.out.println(factory.openSession());

    }
}