package com.small.tadpole.service.questionPack;

import com.small.tadpole.domain.*;
import com.small.tadpole.domain.pack.QuestionPackage;
import com.small.tadpole.service.question.QuestionOption;
import com.small.tadpole.service.question.QuestionOptionImpl;
import com.small.tadpole.service.questionDetial.QuestionDetailOptionImpl;
import com.small.tadpole.service.questionPic.QuestionPicOptionImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    @Autowired
    private QuestionDetailOptionImpl questionDetailOption;
    @Autowired
    private QuestionPicOptionImpl questionPicOption;

    @Override
    public QuestionPackage getQuestionPackage(Question question) {
        //问题基本信息
        QuestionPackage questionPackage = new QuestionPackage();
        Question questionValue = questionOption.getOneQuestion(question.getId());
        questionPackage.setQuestion(questionValue);
        //详细
        QuestionDetail questionDetail = questionDetailOption.getOneQuestionDetail(questionValue);
        questionPackage.setQuestionDetail(questionDetail);
        //图片
        List<QuestionPic>  questionPicList = questionPicOption.getQuestionPics(questionValue);
        questionPackage.setQuestionPicList(questionPicList);
        return questionPackage;
    }

    /**
     * 创建明细
     *
     * @param questionPackage
     * @return
     */
    @Override
    public int addQuestionPackage(QuestionPackage questionPackage) {
        Question question = questionPackage.getQuestion();
        QuestionDetail questionDetail = questionPackage.getQuestionDetail();
        List<QuestionPic> questionPicList = questionPackage.getQuestionPicList();
        questionOption.addQuestion(question);
        questionDetailOption.addQuestionDetail(questionDetail);
        questionPicOption.addQuestionPic(questionPicList);
        return 1;
    }

    /**
     * 删除所有信息
     * 逻辑删除
     *
     * @param question
     * @return
     */
    @Override
    public int delQuestionPackage(Question question) {
        questionOption.delQuestion(question.getId());
        questionDetailOption.delQuestionDetail(question);
        questionPicOption.delQuestionPic(question);
        return 0;
    }
}
