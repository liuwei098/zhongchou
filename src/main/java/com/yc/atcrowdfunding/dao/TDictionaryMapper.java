package com.yc.atcrowdfunding.dao;

import com.yc.atcrowdfunding.bean.TDictionary;
import com.yc.atcrowdfunding.bean.TDictionaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDictionaryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int countByExample(TDictionaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int deleteByExample(TDictionaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int insert(TDictionary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int insertSelective(TDictionary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    List<TDictionary> selectByExample(TDictionaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    TDictionary selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int updateByExampleSelective(@Param("record") TDictionary record, @Param("example") TDictionaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int updateByExample(@Param("record") TDictionary record, @Param("example") TDictionaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(TDictionary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    int updateByPrimaryKey(TDictionary record);
}