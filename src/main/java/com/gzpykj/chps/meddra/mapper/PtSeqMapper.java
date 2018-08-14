package com.gzpykj.chps.meddra.mapper;

import com.gzpykj.chps.meddra.entity.PtSeq;

public interface PtSeqMapper {
    int insert(PtSeq record);

    int insertSelective(PtSeq record);
}