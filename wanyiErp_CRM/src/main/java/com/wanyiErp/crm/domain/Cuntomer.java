package com.wanyiErp.crm.domain;

import com.wanyiErp.common.annotation.Excel;
import com.wanyiErp.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 客户信息对象 crm_cuntomer
 * 
 * @author wanyi
 * @date 2021-10-17
 */
public class Cuntomer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String name;

    /** 客户类型 */
    @Excel(name = "客户类型", readConverterExp = "1=普通客户,2=难缠客户")
    private String type;

    /** 来源 */
    @Excel(name = "来源")
    private String source;

    /** 地址 */
    @Excel(name = "地址")
    private String location;

    /** 联系人 */
    @Excel(name = "联系人")
    private String contacts;

    /** 联系人岗位 */
    @Excel(name = "联系人岗位")
    private String contactsPost;

    /** 性别 */
    @Excel(name = "性别", readConverterExp = "0=男,1=女,2=未知")
    private String contactsSex;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String contactsPhone;

    /** 邮箱地址 */
    @Excel(name = "邮箱地址")
    private String contactsEmail;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setSource(String source) 
    {
        this.source = source;
    }

    public String getSource() 
    {
        return source;
    }
    public void setLocation(String location) 
    {
        this.location = location;
    }

    public String getLocation() 
    {
        return location;
    }
    public void setContacts(String contacts) 
    {
        this.contacts = contacts;
    }

    public String getContacts() 
    {
        return contacts;
    }
    public void setContactsPost(String contactsPost) 
    {
        this.contactsPost = contactsPost;
    }

    public String getContactsPost() 
    {
        return contactsPost;
    }
    public void setContactsSex(String contactsSex) 
    {
        this.contactsSex = contactsSex;
    }

    public String getContactsSex() 
    {
        return contactsSex;
    }
    public void setContactsPhone(String contactsPhone) 
    {
        this.contactsPhone = contactsPhone;
    }

    public String getContactsPhone() 
    {
        return contactsPhone;
    }
    public void setContactsEmail(String contactsEmail) 
    {
        this.contactsEmail = contactsEmail;
    }

    public String getContactsEmail() 
    {
        return contactsEmail;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("type", getType())
            .append("source", getSource())
            .append("location", getLocation())
            .append("contacts", getContacts())
            .append("contactsPost", getContactsPost())
            .append("contactsSex", getContactsSex())
            .append("contactsPhone", getContactsPhone())
            .append("contactsEmail", getContactsEmail())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
