package com.wanyiErp.crm.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.wanyiErp.common.annotation.Log;
import com.wanyiErp.common.enums.BusinessType;
import com.wanyiErp.crm.domain.Cuntomer;
import com.wanyiErp.crm.service.ICuntomerService;
import com.wanyiErp.common.core.controller.BaseController;
import com.wanyiErp.common.core.domain.AjaxResult;
import com.wanyiErp.common.utils.poi.ExcelUtil;
import com.wanyiErp.common.core.page.TableDataInfo;

/**
 * 客户信息Controller
 * 
 * @author wanyi
 * @date 2021-10-17
 */
@Controller
@RequestMapping("/crm/cuntomer")
public class CuntomerController extends BaseController
{
    private String prefix = "crm/cuntomer";

    @Autowired
    private ICuntomerService cuntomerService;

    @RequiresPermissions("crm:cuntomer:view")
    @GetMapping()
    public String cuntomer()
    {
        return prefix + "/cuntomer";
    }

    /**
     * 查询客户信息列表
     */
    @RequiresPermissions("crm:cuntomer:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Cuntomer cuntomer)
    {
        startPage();
        List<Cuntomer> list = cuntomerService.selectCuntomerList(cuntomer);
        return getDataTable(list);
    }

    /**
     * 导出客户信息列表
     */
    @RequiresPermissions("crm:cuntomer:export")
    @Log(title = "客户信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Cuntomer cuntomer)
    {
        List<Cuntomer> list = cuntomerService.selectCuntomerList(cuntomer);
        ExcelUtil<Cuntomer> util = new ExcelUtil<Cuntomer>(Cuntomer.class);
        return util.exportExcel(list, "客户信息数据");
    }

    /**
     * 新增客户信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存客户信息
     */
    @RequiresPermissions("crm:cuntomer:add")
    @Log(title = "客户信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Cuntomer cuntomer)
    {
        return toAjax(cuntomerService.insertCuntomer(cuntomer));
    }

    /**
     * 修改客户信息
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Cuntomer cuntomer = cuntomerService.selectCuntomerById(id);
        mmap.put("cuntomer", cuntomer);
        return prefix + "/edit";
    }

    /**
     * 修改保存客户信息
     */
    @RequiresPermissions("crm:cuntomer:edit")
    @Log(title = "客户信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Cuntomer cuntomer)
    {
        return toAjax(cuntomerService.updateCuntomer(cuntomer));
    }

    /**
     * 删除客户信息
     */
    @RequiresPermissions("crm:cuntomer:remove")
    @Log(title = "客户信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(cuntomerService.deleteCuntomerByIds(ids));
    }
}
