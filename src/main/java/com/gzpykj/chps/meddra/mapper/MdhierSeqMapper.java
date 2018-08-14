package com.gzpykj.chps.meddra.mapper;

import com.gzpykj.chps.meddra.entity.MdhierSeq;

public interface MdhierSeqMapper {
    int insert(MdhierSeq record);

    int insertSelective(MdhierSeq record);
}