package com.wanyiErp.crm.service.impl;

import java.util.List;
import com.wanyiErp.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wanyiErp.crm.mapper.CuntomerMapper;
import com.wanyiErp.crm.domain.Cuntomer;
import com.wanyiErp.crm.service.ICuntomerService;
import com.wanyiErp.common.core.text.Convert;

/**
 * 客户信息Service业务层处理
 * 
 * @author wanyi
 * @date 2021-10-17
 */
@Service
public class CuntomerServiceImpl implements ICuntomerService 
{
    @Autowired
    private CuntomerMapper cuntomerMapper;

    /**
     * 查询客户信息
     * 
     * @param id 客户信息主键
     * @return 客户信息
     */
    @Override
    public Cuntomer selectCuntomerById(Long id)
    {
        return cuntomerMapper.selectCuntomerById(id);
    }

    /**
     * 查询客户信息列表
     * 
     * @param cuntomer 客户信息
     * @return 客户信息
     */
    @Override
    public List<Cuntomer> selectCuntomerList(Cuntomer cuntomer)
    {
        return cuntomerMapper.selectCuntomerList(cuntomer);
    }

    /**
     * 新增客户信息
     * 
     * @param cuntomer 客户信息
     * @return 结果
     */
    @Override
    public int insertCuntomer(Cuntomer cuntomer)
    {
        cuntomer.setCreateTime(DateUtils.getNowDate());
        cuntomer.setUpdateTime(DateUtils.getNowDate());
        cuntomer.setUpdateBy(cuntomer.getCreateBy());
        return cuntomerMapper.insertCuntomer(cuntomer);
    }

    /**
     * 修改客户信息
     * 
     * @param cuntomer 客户信息
     * @return 结果
     */
    @Override
    public int updateCuntomer(Cuntomer cuntomer)
    {
        cuntomer.setUpdateTime(DateUtils.getNowDate());
        return cuntomerMapper.updateCuntomer(cuntomer);
    }

    /**
     * 批量删除客户信息
     * 
     * @param ids 需要删除的客户信息主键
     * @return 结果
     */
    @Override
    public int deleteCuntomerByIds(String ids)
    {
        return cuntomerMapper.deleteCuntomerByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除客户信息信息
     * 
     * @param id 客户信息主键
     * @return 结果
     */
    @Override
    public int deleteCuntomerById(Long id)
    {
        return cuntomerMapper.deleteCuntomerById(id);
    }
}
