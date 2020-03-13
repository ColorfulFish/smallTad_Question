package com.small.tadpole.domain.pack;

import com.small.tadpole.domain.Question;
import com.small.tadpole.domain.QuestionDetail;
import com.small.tadpole.domain.QuestionPic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/*
 * @Author xu.chenyang
 * @Email chenyang.xu@linkkids.cn
 * @Description
 * @Date 11:34 2020/3/13
 **/
@ApiModel(value="com.small.tadpole.domain.pack.QuestionPackage")
public class QuestionPackage {
    @ApiModelProperty(value="question 基本信息")
    private Question question;
    @ApiModelProperty(value="questionDetail 详细信息")
    private QuestionDetail questionDetail;
    @ApiModelProperty(value="questionDetail 图片信息")
    private List<QuestionPic> questionPicList;

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public QuestionDetail getQuestionDetail() {
        return questionDetail;
    }

    public void setQuestionDetail(QuestionDetail questionDetail) {
        this.questionDetail = questionDetail;
    }

    public List<QuestionPic> getQuestionPicList() {
        return questionPicList;
    }

    public void setQuestionPicList(List<QuestionPic> questionPicList) {
        this.questionPicList = questionPicList;
    }
}
