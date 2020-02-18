package com.xxl.api.admin.dao;

import com.xxl.api.admin.core.model.XxlApiDataTypeField;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by ztc on 19/6/3.
 */
@Mapper
public interface IXxlApiDataTypeFieldDao {

    public int add(List<XxlApiDataTypeField> xxlApiDataTypeFieldList);

    public int deleteByParentDatatypeId(@Param("parentDatatypeId") int parentDatatypeId);

    public List<XxlApiDataTypeField> findByParentDatatypeId(@Param("parentDatatypeId") int parentDatatypeId);

    public List<XxlApiDataTypeField> findByFieldDatatypeId(@Param("fieldDatatypeId") int fieldDatatypeId);

}
