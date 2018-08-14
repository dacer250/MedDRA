package com.gzpykj.chps.meddra.mapper;

import com.gzpykj.chps.meddra.entity.MdHierarchy;

public interface MdHierarchyMapper {
    int deleteByPrimaryKey(Long ptCode);

    int insert(MdHierarchy record);

    int insertSelective(MdHierarchy record);

    MdHierarchy selectByPrimaryKey(Long ptCode);

    int updateByPrimaryKeySelective(MdHierarchy record);

    int updateByPrimaryKey(MdHierarchy record);
}