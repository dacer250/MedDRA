package com.gzpykj.chps.meddra.mapper;

import com.gzpykj.chps.meddra.entity.LowLevelTerm;

public interface LowLevelTermMapper {
    int deleteByPrimaryKey(Long lltCode);

    int insert(LowLevelTerm record);

    int insertSelective(LowLevelTerm record);

    LowLevelTerm selectByPrimaryKey(Long lltCode);

    int updateByPrimaryKeySelective(LowLevelTerm record);

    int updateByPrimaryKey(LowLevelTerm record);
}