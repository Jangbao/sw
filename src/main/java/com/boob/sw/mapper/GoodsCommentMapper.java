package com.boob.sw.mapper;

import com.boob.sw.model.GoodsComment;
import com.boob.sw.model.GoodsCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GoodsCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_comment
     *
     * @mbg.generated Wed Jan 22 14:09:58 CST 2020
     */
    long countByExample(GoodsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_comment
     *
     * @mbg.generated Wed Jan 22 14:09:58 CST 2020
     */
    int deleteByExample(GoodsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_comment
     *
     * @mbg.generated Wed Jan 22 14:09:58 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_comment
     *
     * @mbg.generated Wed Jan 22 14:09:58 CST 2020
     */
    int insert(GoodsComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_comment
     *
     * @mbg.generated Wed Jan 22 14:09:58 CST 2020
     */
    int insertSelective(GoodsComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_comment
     *
     * @mbg.generated Wed Jan 22 14:09:58 CST 2020
     */
    List<GoodsComment> selectByExampleWithRowbounds(GoodsCommentExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_comment
     *
     * @mbg.generated Wed Jan 22 14:09:58 CST 2020
     */
    List<GoodsComment> selectByExample(GoodsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_comment
     *
     * @mbg.generated Wed Jan 22 14:09:58 CST 2020
     */
    GoodsComment selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_comment
     *
     * @mbg.generated Wed Jan 22 14:09:58 CST 2020
     */
    int updateByExampleSelective(@Param("record") GoodsComment record, @Param("example") GoodsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_comment
     *
     * @mbg.generated Wed Jan 22 14:09:58 CST 2020
     */
    int updateByExample(@Param("record") GoodsComment record, @Param("example") GoodsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_comment
     *
     * @mbg.generated Wed Jan 22 14:09:58 CST 2020
     */
    int updateByPrimaryKeySelective(GoodsComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_comment
     *
     * @mbg.generated Wed Jan 22 14:09:58 CST 2020
     */
    int updateByPrimaryKey(GoodsComment record);
}