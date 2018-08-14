package com.gzpykj.chps.meddra.mapper;

import com.gzpykj.chps.meddra.entity.SmqContent;

public interface SmqContentMapper {
    int insert(SmqContent record);

    int insertSelective(SmqContent record);
}