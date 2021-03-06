package com.wx.assigntask.entity;

import java.io.Serializable;

public class User implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_id
     *
     * @mbg.generated
     */
    private Integer user_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.username
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.algo_id
     *
     * @mbg.generated
     */
    private Integer algo_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.frequency
     *
     * @mbg.generated
     */
    private Integer frequency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.received_id
     *
     * @mbg.generated
     */
    private Integer received_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.total
     *
     * @mbg.generated
     */
    private Integer total;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_id
     *
     * @return the value of user.user_id
     *
     * @mbg.generated
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_id
     *
     * @param user_id the value for user.user_id
     *
     * @mbg.generated
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.username
     *
     * @return the value of user.username
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.username
     *
     * @param username the value for user.username
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.algo_id
     *
     * @return the value of user.algo_id
     *
     * @mbg.generated
     */
    public Integer getAlgo_id() {
        return algo_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.algo_id
     *
     * @param algo_id the value for user.algo_id
     *
     * @mbg.generated
     */
    public void setAlgo_id(Integer algo_id) {
        this.algo_id = algo_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.frequency
     *
     * @return the value of user.frequency
     *
     * @mbg.generated
     */
    public Integer getFrequency() {
        return frequency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.frequency
     *
     * @param frequency the value for user.frequency
     *
     * @mbg.generated
     */
    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.received_id
     *
     * @return the value of user.received_id
     *
     * @mbg.generated
     */
    public Integer getReceived_id() {
        return received_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.received_id
     *
     * @param received_id the value for user.received_id
     *
     * @mbg.generated
     */
    public void setReceived_id(Integer received_id) {
        this.received_id = received_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.total
     *
     * @return the value of user.total
     *
     * @mbg.generated
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.total
     *
     * @param total the value for user.total
     *
     * @mbg.generated
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", user_id=").append(user_id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", algo_id=").append(algo_id);
        sb.append(", frequency=").append(frequency);
        sb.append(", received_id=").append(received_id);
        sb.append(", total=").append(total);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}