package com.boob.sw.model;

import java.util.Date;

public class BlogComment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_comment.id
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_comment.u_id
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    private Long uId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_comment.x_id
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    private Long xId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_comment.comment
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    private String comment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_comment.type
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_comment.gmt_created
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    private Date gmtCreated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_comment.gmt_modified
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    private Date gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_comment.id
     *
     * @return the value of blog_comment.id
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_comment.id
     *
     * @param id the value for blog_comment.id
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_comment.u_id
     *
     * @return the value of blog_comment.u_id
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    public Long getuId() {
        return uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_comment.u_id
     *
     * @param uId the value for blog_comment.u_id
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    public void setuId(Long uId) {
        this.uId = uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_comment.x_id
     *
     * @return the value of blog_comment.x_id
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    public Long getxId() {
        return xId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_comment.x_id
     *
     * @param xId the value for blog_comment.x_id
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    public void setxId(Long xId) {
        this.xId = xId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_comment.comment
     *
     * @return the value of blog_comment.comment
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_comment.comment
     *
     * @param comment the value for blog_comment.comment
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_comment.type
     *
     * @return the value of blog_comment.type
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_comment.type
     *
     * @param type the value for blog_comment.type
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_comment.gmt_created
     *
     * @return the value of blog_comment.gmt_created
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_comment.gmt_created
     *
     * @param gmtCreated the value for blog_comment.gmt_created
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_comment.gmt_modified
     *
     * @return the value of blog_comment.gmt_modified
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_comment.gmt_modified
     *
     * @param gmtModified the value for blog_comment.gmt_modified
     *
     * @mbg.generated Wed Jan 22 14:09:59 CST 2020
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}