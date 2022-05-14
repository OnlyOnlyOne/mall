package com.dowsure.erp.model.dao.dataSource;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.dowsure.erp.model.pojo.TOrder;


@DS("dataSource")
public interface TOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TOrder record);

    int insertSelective(TOrder record);

    TOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TOrder record);

    int updateByPrimaryKey(TOrder record);
}