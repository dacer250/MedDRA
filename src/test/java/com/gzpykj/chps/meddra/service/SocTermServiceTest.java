package com.gzpykj.chps.meddra.service;

import com.gzpykj.chps.meddra.entity.SocTerm;
import com.gzpykj.chps.meddra.parser.MedDRAFileParser;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SocTermServiceTest {

    SocTermService service = new SocTermService();
    List<SocTerm> tokens;

    @Before
    public void init () throws FileNotFoundException {
        MedDRAFileParser parser = new MedDRAFileParser();
        FileReader fileReader = new FileReader("D:\\ProgramData\\IdeaProjects\\MedDRA\\doc\\medfiles\\ascii-210\\soc.asc");

        this.tokens = parser.parseTerm(fileReader, SocTerm.class);
        System.out.println("记录大小："+tokens.size()+"，打印5条信息。。。");
        tokens.stream().limit(5).forEach(System.out::println);
    }

    @Test
    public void insertTokens() {
        service.insertTokens(tokens);
    }
}