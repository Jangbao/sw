package com.boob.sw.mapper;

import com.boob.sw.model.Music;
import com.boob.sw.model.MusicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MusicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table music
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    long countByExample(MusicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table music
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    int deleteByExample(MusicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table music
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table music
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    int insert(Music record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table music
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    int insertSelective(Music record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table music
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    List<Music> selectByExampleWithRowbounds(MusicExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table music
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    List<Music> selectByExample(MusicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table music
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    Music selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table music
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    int updateByExampleSelective(@Param("record") Music record, @Param("example") MusicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table music
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    int updateByExample(@Param("record") Music record, @Param("example") MusicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table music
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    int updateByPrimaryKeySelective(Music record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table music
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    int updateByPrimaryKey(Music record);
}