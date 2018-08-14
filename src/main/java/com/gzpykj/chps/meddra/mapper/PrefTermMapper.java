package com.gzpykj.chps.meddra.mapper;

import com.gzpykj.chps.meddra.entity.PrefTerm;

public interface PrefTermMapper {
    int deleteByPrimaryKey(Long ptCode);

    int insert(PrefTerm record);

    int insertSelective(PrefTerm record);

    PrefTerm selectByPrimaryKey(Long ptCode);

    int updateByPrimaryKeySelective(PrefTerm record);

    int updateByPrimaryKey(PrefTerm record);
}