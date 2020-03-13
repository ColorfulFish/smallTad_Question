package com.small.tadpole.service.questionPack;

import com.small.tadpole.domain.Question;
import com.small.tadpole.domain.QuestionDetailExample;
import com.small.tadpole.domain.QuestionExample;
import com.small.tadpole.domain.QuestionPicExample;
import com.small.tadpole.domain.pack.QuestionPackage;
import com.small.tadpole.service.question.QuestionOption;
import com.small.tadpole.service.question.QuestionOptionImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * @Author xu.chenyang
 * @Email chenyang.xu@linkkids.cn
 * @Description
 * @Date 12:57 2020/3/13
 **/
@Service("questionPackOptionImpl")
public class QuestionPackOptionImpl implements QuestionPackOption {
    @Autowired
    private QuestionOptionImpl questionOption;
    @Override
    public QuestionPackage getQuestionPackage(Question question) {
        //问题
        QuestionExample questionExample  = new QuestionExample();
        questionExample.createCriteria().andIdEqualTo(question.getId());
        Question questionValue = questionOption.getOneQuestion(question.getId());
        //详细
        QuestionDetailExample questionDetailExample = new QuestionDetailExample();
        questionDetailExample.createCriteria().andIdEqualTo(question.getId());
        //图片
        QuestionPicExample questionPicExample = new QuestionPicExample();
        questionPicExample.createCriteria().andIdEqualTo(question.getId());
        return null;
    }
}
