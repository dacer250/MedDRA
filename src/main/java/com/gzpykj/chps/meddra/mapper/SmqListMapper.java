package com.gzpykj.chps.meddra.mapper;

import com.gzpykj.chps.meddra.entity.SmqList;

public interface SmqListMapper {
    int deleteByPrimaryKey(Long smqCode);

    int insert(SmqList record);

    int insertSelective(SmqList record);

    SmqList selectByPrimaryKey(Long smqCode);

    int updateByPrimaryKeySelective(SmqList record);

    int updateByPrimaryKey(SmqList record);
}