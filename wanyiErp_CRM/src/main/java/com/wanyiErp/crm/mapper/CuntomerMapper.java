package com.wanyiErp.crm.mapper;

import java.util.List;
import com.wanyiErp.crm.domain.Cuntomer;

/**
 * 客户信息Mapper接口
 * 
 * @author wanyi
 * @date 2021-10-17
 */
public interface CuntomerMapper 
{
    /**
     * 查询客户信息
     * 
     * @param id 客户信息主键
     * @return 客户信息
     */
    public Cuntomer selectCuntomerById(Long id);

    /**
     * 查询客户信息列表
     * 
     * @param cuntomer 客户信息
     * @return 客户信息集合
     */
    public List<Cuntomer> selectCuntomerList(Cuntomer cuntomer);

    /**
     * 新增客户信息
     * 
     * @param cuntomer 客户信息
     * @return 结果
     */
    public int insertCuntomer(Cuntomer cuntomer);

    /**
     * 修改客户信息
     * 
     * @param cuntomer 客户信息
     * @return 结果
     */
    public int updateCuntomer(Cuntomer cuntomer);

    /**
     * 删除客户信息
     * 
     * @param id 客户信息主键
     * @return 结果
     */
    public int deleteCuntomerById(Long id);

    /**
     * 批量删除客户信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCuntomerByIds(String[] ids);
}
