package com.boob.sw.mapper;

import com.boob.sw.model.Superior;
import com.boob.sw.model.SuperiorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SuperiorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table superior
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    long countByExample(SuperiorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table superior
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    int deleteByExample(SuperiorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table superior
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table superior
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    int insert(Superior record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table superior
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    int insertSelective(Superior record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table superior
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    List<Superior> selectByExampleWithRowbounds(SuperiorExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table superior
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    List<Superior> selectByExample(SuperiorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table superior
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    Superior selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table superior
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    int updateByExampleSelective(@Param("record") Superior record, @Param("example") SuperiorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table superior
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    int updateByExample(@Param("record") Superior record, @Param("example") SuperiorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table superior
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    int updateByPrimaryKeySelective(Superior record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table superior
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    int updateByPrimaryKey(Superior record);
}