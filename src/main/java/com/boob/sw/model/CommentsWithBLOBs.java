package com.boob.sw.model;

public class CommentsWithBLOBs extends Comments {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.comment
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    private String comment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.after_comment
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    private String afterComment;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.comment
     *
     * @return the value of comments.comment
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.comment
     *
     * @param comment the value for comments.comment
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.after_comment
     *
     * @return the value of comments.after_comment
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    public String getAfterComment() {
        return afterComment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.after_comment
     *
     * @param afterComment the value for comments.after_comment
     *
     * @mbg.generated Sun Jan 19 19:51:01 CST 2020
     */
    public void setAfterComment(String afterComment) {
        this.afterComment = afterComment == null ? null : afterComment.trim();
    }
}