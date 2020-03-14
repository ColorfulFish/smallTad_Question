package com.small.tadpole.mapper;

import com.small.tadpole.domain.QuestionDealLog;
import com.small.tadpole.domain.QuestionDealLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionDealLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_deal_log
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    long countByExample(QuestionDealLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_deal_log
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    int deleteByExample(QuestionDealLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_deal_log
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    int deleteByPrimaryKey(Integer dealId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_deal_log
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    int insert(QuestionDealLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_deal_log
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    int insertSelective(QuestionDealLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_deal_log
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    QuestionDealLog selectOneByExample(QuestionDealLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_deal_log
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    QuestionDealLog selectOneByExampleSelective(@Param("example") QuestionDealLogExample example, @Param("selective") QuestionDealLog.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_deal_log
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    List<QuestionDealLog> selectByExampleSelective(@Param("example") QuestionDealLogExample example, @Param("selective") QuestionDealLog.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_deal_log
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    List<QuestionDealLog> selectByExample(QuestionDealLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_deal_log
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    QuestionDealLog selectByPrimaryKeySelective(@Param("dealId") Integer dealId, @Param("selective") QuestionDealLog.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_deal_log
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    QuestionDealLog selectByPrimaryKey(Integer dealId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_deal_log
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    int updateByExampleSelective(@Param("record") QuestionDealLog record, @Param("example") QuestionDealLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_deal_log
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    int updateByExample(@Param("record") QuestionDealLog record, @Param("example") QuestionDealLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_deal_log
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    int updateByPrimaryKeySelective(QuestionDealLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_deal_log
     *
     * @mbg.generated Sat Mar 14 16:08:31 CST 2020
     */
    int updateByPrimaryKey(QuestionDealLog record);
}