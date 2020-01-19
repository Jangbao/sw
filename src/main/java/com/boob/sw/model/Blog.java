package com.boob.sw.model;

import java.util.Date;

public class Blog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.id
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.title
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.score
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    private Integer score;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.u_id
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    private Long uId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.o_id
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    private Long oId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.gmt_created
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    private Date gmtCreated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.gmt_modified
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.content
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.id
     *
     * @return the value of blog.id
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.id
     *
     * @param id the value for blog.id
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.title
     *
     * @return the value of blog.title
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.title
     *
     * @param title the value for blog.title
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.score
     *
     * @return the value of blog.score
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.score
     *
     * @param score the value for blog.score
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.u_id
     *
     * @return the value of blog.u_id
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    public Long getuId() {
        return uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.u_id
     *
     * @param uId the value for blog.u_id
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    public void setuId(Long uId) {
        this.uId = uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.o_id
     *
     * @return the value of blog.o_id
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    public Long getoId() {
        return oId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.o_id
     *
     * @param oId the value for blog.o_id
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    public void setoId(Long oId) {
        this.oId = oId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.gmt_created
     *
     * @return the value of blog.gmt_created
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.gmt_created
     *
     * @param gmtCreated the value for blog.gmt_created
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.gmt_modified
     *
     * @return the value of blog.gmt_modified
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.gmt_modified
     *
     * @param gmtModified the value for blog.gmt_modified
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.content
     *
     * @return the value of blog.content
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.content
     *
     * @param content the value for blog.content
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}