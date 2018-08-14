package com.gzpykj.chps.meddra.mapper;

import com.gzpykj.chps.meddra.entity.SocIntlOrder;

public interface SocIntlOrderMapper {
    int deleteByPrimaryKey(Long intlOrdCode);

    int insert(SocIntlOrder record);

    int insertSelective(SocIntlOrder record);

    SocIntlOrder selectByPrimaryKey(Long intlOrdCode);

    int updateByPrimaryKeySelective(SocIntlOrder record);

    int updateByPrimaryKey(SocIntlOrder record);
}