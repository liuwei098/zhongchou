package com.yc.atcrowdfunding.dao;

import com.yc.atcrowdfunding.bean.TMemberProjectFollow;
import com.yc.atcrowdfunding.bean.TMemberProjectFollowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMemberProjectFollowMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_project_follow
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int countByExample(TMemberProjectFollowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_project_follow
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int deleteByExample(TMemberProjectFollowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_project_follow
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_project_follow
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int insert(TMemberProjectFollow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_project_follow
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int insertSelective(TMemberProjectFollow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_project_follow
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    List<TMemberProjectFollow> selectByExample(TMemberProjectFollowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_project_follow
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    TMemberProjectFollow selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_project_follow
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int updateByExampleSelective(@Param("record") TMemberProjectFollow record, @Param("example") TMemberProjectFollowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_project_follow
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int updateByExample(@Param("record") TMemberProjectFollow record, @Param("example") TMemberProjectFollowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_project_follow
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(TMemberProjectFollow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_project_follow
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int updateByPrimaryKey(TMemberProjectFollow record);
}