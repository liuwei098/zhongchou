package com.yc.atcrowdfunding.bean;

import java.util.Date;

public class TUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.id
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.loginacct
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    private String loginacct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.userpswd
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    private String userpswd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.username
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.email
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.createtime
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    private Date createtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.id
     *
     * @return the value of t_user.id
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.id
     *
     * @param id the value for t_user.id
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.loginacct
     *
     * @return the value of t_user.loginacct
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public String getLoginacct() {
        return loginacct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.loginacct
     *
     * @param loginacct the value for t_user.loginacct
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public void setLoginacct(String loginacct) {
        this.loginacct = loginacct == null ? null : loginacct.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.userpswd
     *
     * @return the value of t_user.userpswd
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public String getUserpswd() {
        return userpswd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.userpswd
     *
     * @param userpswd the value for t_user.userpswd
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public void setUserpswd(String userpswd) {
        this.userpswd = userpswd == null ? null : userpswd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.username
     *
     * @return the value of t_user.username
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.username
     *
     * @param username the value for t_user.username
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.email
     *
     * @return the value of t_user.email
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.email
     *
     * @param email the value for t_user.email
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.createtime
     *
     * @return the value of t_user.createtime
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.createtime
     *
     * @param createtime the value for t_user.createtime
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}