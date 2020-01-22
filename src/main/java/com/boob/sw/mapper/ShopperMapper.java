package com.boob.sw.mapper;

import com.boob.sw.model.Shopper;
import com.boob.sw.model.ShopperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ShopperMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopper
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    long countByExample(ShopperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopper
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    int deleteByExample(ShopperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopper
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopper
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    int insert(Shopper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopper
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    int insertSelective(Shopper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopper
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    List<Shopper> selectByExampleWithRowbounds(ShopperExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopper
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    List<Shopper> selectByExample(ShopperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopper
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    Shopper selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopper
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    int updateByExampleSelective(@Param("record") Shopper record, @Param("example") ShopperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopper
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    int updateByExample(@Param("record") Shopper record, @Param("example") ShopperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopper
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    int updateByPrimaryKeySelective(Shopper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopper
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    int updateByPrimaryKey(Shopper record);
}