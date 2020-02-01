package com.boob.sw.mapper;

import com.boob.sw.model.OrganMidSuper;
import com.boob.sw.model.OrganMidSuperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OrganMidSuperMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organ_mid_super
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    long countByExample(OrganMidSuperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organ_mid_super
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    int deleteByExample(OrganMidSuperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organ_mid_super
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organ_mid_super
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    int insert(OrganMidSuper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organ_mid_super
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    int insertSelective(OrganMidSuper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organ_mid_super
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    List<OrganMidSuper> selectByExampleWithRowbounds(OrganMidSuperExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organ_mid_super
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    List<OrganMidSuper> selectByExample(OrganMidSuperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organ_mid_super
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    OrganMidSuper selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organ_mid_super
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    int updateByExampleSelective(@Param("record") OrganMidSuper record, @Param("example") OrganMidSuperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organ_mid_super
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    int updateByExample(@Param("record") OrganMidSuper record, @Param("example") OrganMidSuperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organ_mid_super
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    int updateByPrimaryKeySelective(OrganMidSuper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organ_mid_super
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    int updateByPrimaryKey(OrganMidSuper record);
}