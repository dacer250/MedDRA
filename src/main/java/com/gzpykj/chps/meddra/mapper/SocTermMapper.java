package com.gzpykj.chps.meddra.mapper;

import com.gzpykj.chps.meddra.entity.SocTerm;

public interface SocTermMapper {
    int deleteByPrimaryKey(Long socCode);

    int insert(SocTerm record);

    int insertSelective(SocTerm record);

    SocTerm selectByPrimaryKey(Long socCode);

    int updateByPrimaryKeySelective(SocTerm record);

    int updateByPrimaryKey(SocTerm record);
}