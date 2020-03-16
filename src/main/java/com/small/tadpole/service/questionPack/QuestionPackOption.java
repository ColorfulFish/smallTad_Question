package com.small.tadpole.service.questionPack;
/*
 * @Author xu.chenyang
 * @Email chenyang.xu@linkkids.cn
 * @Description
 * @Date 12:56 2020/3/13
 **/

import com.small.tadpole.domain.Question;
import com.small.tadpole.domain.pack.QuestionPackage;

public interface QuestionPackOption {
    //查询明细
    QuestionPackage getQuestionPackage(Question question);

    /**
     * 创建明细
     * @param questionPackage
     * @return
     */
    int addQuestionPackage(QuestionPackage questionPackage);

    /**
     * 删除所有信息
     * 逻辑删除
     * @param question
     * @return
     */
    int delQuestionPackage(Question question);
}
