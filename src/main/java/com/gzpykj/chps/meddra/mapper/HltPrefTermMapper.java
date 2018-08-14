package com.gzpykj.chps.meddra.mapper;

import com.gzpykj.chps.meddra.entity.HltPrefTerm;

public interface HltPrefTermMapper {
    int deleteByPrimaryKey(Long hltCode);

    int insert(HltPrefTerm record);

    int insertSelective(HltPrefTerm record);

    HltPrefTerm selectByPrimaryKey(Long hltCode);

    int updateByPrimaryKeySelective(HltPrefTerm record);

    int updateByPrimaryKey(HltPrefTerm record);
}