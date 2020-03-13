package com.small.tadpole.mapper;

import com.small.tadpole.domain.QuestionPic;
import com.small.tadpole.domain.QuestionPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionPicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_pic
     *
     * @mbg.generated Fri Mar 13 12:42:22 CST 2020
     */
    long countByExample(QuestionPicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_pic
     *
     * @mbg.generated Fri Mar 13 12:42:22 CST 2020
     */
    int deleteByExample(QuestionPicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_pic
     *
     * @mbg.generated Fri Mar 13 12:42:22 CST 2020
     */
    int insert(QuestionPic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_pic
     *
     * @mbg.generated Fri Mar 13 12:42:22 CST 2020
     */
    int insertSelective(QuestionPic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_pic
     *
     * @mbg.generated Fri Mar 13 12:42:22 CST 2020
     */
    QuestionPic selectOneByExample(QuestionPicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_pic
     *
     * @mbg.generated Fri Mar 13 12:42:22 CST 2020
     */
    QuestionPic selectOneByExampleSelective(@Param("example") QuestionPicExample example, @Param("selective") QuestionPic.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_pic
     *
     * @mbg.generated Fri Mar 13 12:42:22 CST 2020
     */
    List<QuestionPic> selectByExampleSelective(@Param("example") QuestionPicExample example, @Param("selective") QuestionPic.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_pic
     *
     * @mbg.generated Fri Mar 13 12:42:22 CST 2020
     */
    List<QuestionPic> selectByExample(QuestionPicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_pic
     *
     * @mbg.generated Fri Mar 13 12:42:22 CST 2020
     */
    int updateByExampleSelective(@Param("record") QuestionPic record, @Param("example") QuestionPicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_pic
     *
     * @mbg.generated Fri Mar 13 12:42:22 CST 2020
     */
    int updateByExample(@Param("record") QuestionPic record, @Param("example") QuestionPicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_pic
     *
     * @mbg.generated Fri Mar 13 12:42:22 CST 2020
     */
    int logicalDeleteByExample(@Param("example") QuestionPicExample example);
}