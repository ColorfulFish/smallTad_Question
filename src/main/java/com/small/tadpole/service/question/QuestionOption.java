package com.small.tadpole.service.question;
/*
 * @Author xu.chenyang
 * @Email chenyang.xu@linkkids.cn
 * @Description
 * @Date 22:31 2020/3/11
 **/


import com.small.tadpole.domain.Question;
import com.small.tadpole.domain.QuestionExample;

import java.util.List;

public interface QuestionOption {
    //增
    int addQuestion(Question question);
    //删
    int delQuestion(Integer id);
    //改
    int updateQestion(Question question);
    //查
    List<Question> listQuestion(QuestionExample questionExample);
    //查询单条
    Question getOneQuestion(Integer id);
}
