package com.gzpykj.chps.meddra.mapper;

import com.gzpykj.chps.meddra.entity.HlgtPrefTerm;

public interface HlgtPrefTermMapper {
    int deleteByPrimaryKey(Long hlgtCode);

    int insert(HlgtPrefTerm record);

    int insertSelective(HlgtPrefTerm record);

    HlgtPrefTerm selectByPrimaryKey(Long hlgtCode);

    int updateByPrimaryKeySelective(HlgtPrefTerm record);

    int updateByPrimaryKey(HlgtPrefTerm record);
}