package com.gzpykj.chps.meddra.service;

import com.gzpykj.chps.meddra.entity.SocTerm;
import com.gzpykj.chps.meddra.mapper.SocTermMapper;
import com.gzpykj.chps.meddra.parser.SqlSesstionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * soc
 */
public class SocTermService {

    SocTermMapper mapper;

    public void insertTokens (List<SocTerm> tokens) {
        SqlSession session = SqlSesstionUtil.getSession();

        mapper = session.getMapper(SocTermMapper.class);
        if(tokens != null && tokens.size() > 0) {
          tokens.stream().forEach(token -> {
                mapper.insert(token);
            });
            System.out.println("数据成功插入！");
        } else {
            System.err.println("数据为空！");
        }
        session.commit();
        session.close();

    }
}
