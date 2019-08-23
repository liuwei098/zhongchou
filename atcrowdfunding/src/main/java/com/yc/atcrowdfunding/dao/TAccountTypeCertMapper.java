package com.yc.atcrowdfunding.dao;

import com.yc.atcrowdfunding.bean.TAccountTypeCert;
import com.yc.atcrowdfunding.bean.TAccountTypeCertExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAccountTypeCertMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_type_cert
     *
     * @mbg.generated Fri Aug 23 14:54:46 CST 2019
     */
    long countByExample(TAccountTypeCertExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_type_cert
     *
     * @mbg.generated Fri Aug 23 14:54:46 CST 2019
     */
    int deleteByExample(TAccountTypeCertExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_type_cert
     *
     * @mbg.generated Fri Aug 23 14:54:46 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_type_cert
     *
     * @mbg.generated Fri Aug 23 14:54:46 CST 2019
     */
    int insert(TAccountTypeCert record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_type_cert
     *
     * @mbg.generated Fri Aug 23 14:54:46 CST 2019
     */
    int insertSelective(TAccountTypeCert record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_type_cert
     *
     * @mbg.generated Fri Aug 23 14:54:46 CST 2019
     */
    List<TAccountTypeCert> selectByExample(TAccountTypeCertExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_type_cert
     *
     * @mbg.generated Fri Aug 23 14:54:46 CST 2019
     */
    TAccountTypeCert selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_type_cert
     *
     * @mbg.generated Fri Aug 23 14:54:46 CST 2019
     */
    int updateByExampleSelective(@Param("record") TAccountTypeCert record, @Param("example") TAccountTypeCertExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_type_cert
     *
     * @mbg.generated Fri Aug 23 14:54:46 CST 2019
     */
    int updateByExample(@Param("record") TAccountTypeCert record, @Param("example") TAccountTypeCertExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_type_cert
     *
     * @mbg.generated Fri Aug 23 14:54:46 CST 2019
     */
    int updateByPrimaryKeySelective(TAccountTypeCert record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_type_cert
     *
     * @mbg.generated Fri Aug 23 14:54:46 CST 2019
     */
    int updateByPrimaryKey(TAccountTypeCert record);
}