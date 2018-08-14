package com.gzpykj.chps.meddra.mapper;

import com.gzpykj.chps.meddra.entity.HltSeq;

public interface HltSeqMapper {
    int insert(HltSeq record);

    int insertSelective(HltSeq record);
}