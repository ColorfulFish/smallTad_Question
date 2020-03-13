package com.small.tadpole.mapper;

import com.small.tadpole.domain.User;
import com.small.tadpole.domain.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Fri Mar 13 12:42:22 CST 2020
     */
    long countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Fri Mar 13 12:42:22 CST 2020
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Fri Mar 13 12:42:22 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Fri Mar 13 12:42:22 CST 2020
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Fri Mar 13 12:42:22 CST 2020
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Fri Mar 13 12:42:22 CST 2020
     */
    User selectOneByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Fri Mar 13 12:42:22 CST 2020
     */
    User selectOneByExampleSelective(@Param("example") UserExample example, @Param("selective") User.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Fri Mar 13 12:42:22 CST 2020
     */
    List<User> selectByExampleSelective(@Param("example") UserExample example, @Param("selective") User.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Fri Mar 13 12:42:22 CST 2020
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Fri Mar 13 12:42:22 CST 2020
     */
    User selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") User.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Fri Mar 13 12:42:22 CST 2020
     */
    User selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Fri Mar 13 12:42:22 CST 2020
     */
    User selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Fri Mar 13 12:42:22 CST 2020
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Fri Mar 13 12:42:22 CST 2020
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Fri Mar 13 12:42:22 CST 2020
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Fri Mar 13 12:42:22 CST 2020
     */
    int updateByPrimaryKey(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Fri Mar 13 12:42:22 CST 2020
     */
    int logicalDeleteByExample(@Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Fri Mar 13 12:42:22 CST 2020
     */
    int logicalDeleteByPrimaryKey(Integer id);
}