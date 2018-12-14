package com.wx.assigntask.dao;

import com.wx.assigntask.entity.Usertask;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UsertaskMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usertask
     *
     * @mbg.generated
     */
    int insert(Usertask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usertask
     *
     * @mbg.generated
     */
    List<Usertask> selectAll();
}