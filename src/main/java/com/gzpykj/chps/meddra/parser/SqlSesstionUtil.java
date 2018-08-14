package com.gzpykj.chps.meddra.parser;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.defaults.DefaultSqlSession;

import java.io.IOException;
import java.io.Reader;

public class SqlSesstionUtil {
    public static SqlSession getSession () {
        try {
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(reader);
            return factory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
