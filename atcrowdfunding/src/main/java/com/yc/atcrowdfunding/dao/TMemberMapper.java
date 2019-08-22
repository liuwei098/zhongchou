package com.yc.atcrowdfunding.dao;

import com.yc.atcrowdfunding.bean.TMember;
import com.yc.atcrowdfunding.bean.TMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMemberMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    int countByExample(TMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    int deleteByExample(TMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    int insert(TMember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    int insertSelective(TMember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    List<TMember> selectByExample(TMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    TMember selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    int updateByExampleSelective(@Param("record") TMember record, @Param("example") TMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    int updateByExample(@Param("record") TMember record, @Param("example") TMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(TMember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    int updateByPrimaryKey(TMember record);
}