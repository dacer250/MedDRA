package com.gzpykj.chps.meddra.mapper;

import com.gzpykj.chps.meddra.entity.SocSeq;

public interface SocSeqMapper {
    int insert(SocSeq record);

    int insertSelective(SocSeq record);
}