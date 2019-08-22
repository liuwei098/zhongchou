package com.yc.atcrowdfunding.bean;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class TPermission implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -6084582542611441652L;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_permission.id
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_permission.pid
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    private Integer pid;
    private List<TPermission> childs;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_permission.name
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    private String name;

    @Override
	public String toString() {
		return "TPermission [id=" + id + ", pid=" + pid + ", childs=" + childs + ", name=" + name + ", icon=" + icon
				+ ", url=" + url + "]";
	}

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_permission.icon
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    private String icon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_permission.url
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    private String url;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_permission.id
     *
     * @return the value of t_permission.id
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_permission.id
     *
     * @param id the value for t_permission.id
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_permission.pid
     *
     * @return the value of t_permission.pid
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_permission.pid
     *
     * @param pid the value for t_permission.pid
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_permission.name
     *
     * @return the value of t_permission.name
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_permission.name
     *
     * @param name the value for t_permission.name
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public List<TPermission> getChilds() {
		return childs;
	}

	public void setChilds(List<TPermission> childs) {
		this.childs = childs;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_permission.icon
     *
     * @return the value of t_permission.icon
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_permission.icon
     *
     * @param icon the value for t_permission.icon
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_permission.url
     *
     * @return the value of t_permission.url
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_permission.url
     *
     * @param url the value for t_permission.url
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}