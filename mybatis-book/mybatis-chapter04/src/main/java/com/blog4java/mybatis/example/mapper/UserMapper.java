package com.blog4java.mybatis.example.mapper;

import com.blog4java.mybatis.example.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    List<UserEntity> listAllUser();

    @Select("select * from user where id=#{userId,jdbcType=INTEGER}")
    UserEntity getUserById(@Param("userId") String userId);

    @Select("select * from user where id=#{userId,jdbcType=INTEGER} and name = #{name}")
    UserEntity getUserByIdAndName(String userId,String name);

    List<UserEntity> getUserByEntity( UserEntity user);

    UserEntity getUserByPhone(@Param("phone") String phone);

}