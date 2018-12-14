package com.wx.assigntask.entity;

import java.io.Serializable;

public class Subtask implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subtask.subtaskId
     *
     * @mbg.generated
     */
    private Integer subtaskid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subtask.dividedId
     *
     * @mbg.generated
     */
    private Integer dividedid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subtask.itemName1
     *
     * @mbg.generated
     */
    private String itemname1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subtask.itemName2
     *
     * @mbg.generated
     */
    private String itemname2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subtask.score1
     *
     * @mbg.generated
     */
    private String score1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subtask.score2
     *
     * @mbg.generated
     */
    private String score2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subtask.randomNum
     *
     * @mbg.generated
     */
    private Integer randomnum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table subtask
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subtask.subtaskId
     *
     * @return the value of subtask.subtaskId
     *
     * @mbg.generated
     */
    public Integer getSubtaskid() {
        return subtaskid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subtask.subtaskId
     *
     * @param subtaskid the value for subtask.subtaskId
     *
     * @mbg.generated
     */
    public void setSubtaskid(Integer subtaskid) {
        this.subtaskid = subtaskid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subtask.dividedId
     *
     * @return the value of subtask.dividedId
     *
     * @mbg.generated
     */
    public Integer getDividedid() {
        return dividedid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subtask.dividedId
     *
     * @param dividedid the value for subtask.dividedId
     *
     * @mbg.generated
     */
    public void setDividedid(Integer dividedid) {
        this.dividedid = dividedid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subtask.itemName1
     *
     * @return the value of subtask.itemName1
     *
     * @mbg.generated
     */
    public String getItemname1() {
        return itemname1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subtask.itemName1
     *
     * @param itemname1 the value for subtask.itemName1
     *
     * @mbg.generated
     */
    public void setItemname1(String itemname1) {
        this.itemname1 = itemname1 == null ? null : itemname1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subtask.itemName2
     *
     * @return the value of subtask.itemName2
     *
     * @mbg.generated
     */
    public String getItemname2() {
        return itemname2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subtask.itemName2
     *
     * @param itemname2 the value for subtask.itemName2
     *
     * @mbg.generated
     */
    public void setItemname2(String itemname2) {
        this.itemname2 = itemname2 == null ? null : itemname2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subtask.score1
     *
     * @return the value of subtask.score1
     *
     * @mbg.generated
     */
    public String getScore1() {
        return score1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subtask.score1
     *
     * @param score1 the value for subtask.score1
     *
     * @mbg.generated
     */
    public void setScore1(String score1) {
        this.score1 = score1 == null ? null : score1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subtask.score2
     *
     * @return the value of subtask.score2
     *
     * @mbg.generated
     */
    public String getScore2() {
        return score2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subtask.score2
     *
     * @param score2 the value for subtask.score2
     *
     * @mbg.generated
     */
    public void setScore2(String score2) {
        this.score2 = score2 == null ? null : score2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subtask.randomNum
     *
     * @return the value of subtask.randomNum
     *
     * @mbg.generated
     */
    public Integer getRandomnum() {
        return randomnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subtask.randomNum
     *
     * @param randomnum the value for subtask.randomNum
     *
     * @mbg.generated
     */
    public void setRandomnum(Integer randomnum) {
        this.randomnum = randomnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subtask
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", subtaskid=").append(subtaskid);
        sb.append(", dividedid=").append(dividedid);
        sb.append(", itemname1=").append(itemname1);
        sb.append(", itemname2=").append(itemname2);
        sb.append(", score1=").append(score1);
        sb.append(", score2=").append(score2);
        sb.append(", randomnum=").append(randomnum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}