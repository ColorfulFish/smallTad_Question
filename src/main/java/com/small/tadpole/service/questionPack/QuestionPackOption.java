package com.small.tadpole.service.questionPack;/*
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
}
