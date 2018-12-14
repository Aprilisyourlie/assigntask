package com.wx.assigntask.dao;

import com.wx.assigntask.entity.Subdata;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SubdataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subdata
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer subdataid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subdata
     *
     * @mbg.generated
     */
    int insert(Subdata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subdata
     *
     * @mbg.generated
     */
    Subdata selectByPrimaryKey(Integer subdataid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subdata
     *
     * @mbg.generated
     */
    List<Subdata> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subdata
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Subdata record);
}