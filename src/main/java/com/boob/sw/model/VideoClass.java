package com.boob.sw.model;

import java.util.Date;

public class VideoClass {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_class.id
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_class.name
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_class.description
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_class.gmt_created
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    private Date gmtCreated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_class.gmt_modified
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_class.show
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    private String show;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_class.id
     *
     * @return the value of video_class.id
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_class.id
     *
     * @param id the value for video_class.id
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_class.name
     *
     * @return the value of video_class.name
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_class.name
     *
     * @param name the value for video_class.name
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_class.description
     *
     * @return the value of video_class.description
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_class.description
     *
     * @param description the value for video_class.description
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_class.gmt_created
     *
     * @return the value of video_class.gmt_created
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_class.gmt_created
     *
     * @param gmtCreated the value for video_class.gmt_created
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_class.gmt_modified
     *
     * @return the value of video_class.gmt_modified
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_class.gmt_modified
     *
     * @param gmtModified the value for video_class.gmt_modified
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_class.show
     *
     * @return the value of video_class.show
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    public String getShow() {
        return show;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_class.show
     *
     * @param show the value for video_class.show
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    public void setShow(String show) {
        this.show = show == null ? null : show.trim();
    }
}