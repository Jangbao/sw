package com.boob.sw.mapper;

import com.boob.sw.model.Organization;
import com.boob.sw.model.OrganizationExample;
import com.boob.sw.model.OrganizationWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OrganizationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    long countByExample(OrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    int deleteByExample(OrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    int insert(OrganizationWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    int insertSelective(OrganizationWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    List<OrganizationWithBLOBs> selectByExampleWithBLOBsWithRowbounds(OrganizationExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    List<OrganizationWithBLOBs> selectByExampleWithBLOBs(OrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    List<Organization> selectByExampleWithRowbounds(OrganizationExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    List<Organization> selectByExample(OrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    OrganizationWithBLOBs selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    int updateByExampleSelective(@Param("record") OrganizationWithBLOBs record, @Param("example") OrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") OrganizationWithBLOBs record, @Param("example") OrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    int updateByExample(@Param("record") Organization record, @Param("example") OrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    int updateByPrimaryKeySelective(OrganizationWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(OrganizationWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    int updateByPrimaryKey(Organization record);
}