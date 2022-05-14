package com.dowsure.erp.model.dao.dataSource;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.dowsure.erp.model.pojo.TFinancialEventGroup;


@DS("dataSource")
public interface TFinancialEventGroupMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TFinancialEventGroup record);

    int insertSelective(TFinancialEventGroup record);

    TFinancialEventGroup selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TFinancialEventGroup record);

    int updateByPrimaryKey(TFinancialEventGroup record);
}