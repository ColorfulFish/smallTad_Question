package com.small.tadpole.service.questionPic;
/*
 * @Author xu.chenyang
 * @Email xu.chenyang24@gmail.com
 * @Description
 * @Date 14:35 2020/3/16
 **/

import com.small.tadpole.domain.Question;
import com.small.tadpole.domain.QuestionPic;

import java.util.List;

public interface QuestionPicOption {
    /**
     * 增加
     * @param questionPicList
     * @return
     */
    public int addQuestionPic(List<QuestionPic> questionPicList);

    /**
     * 删除
     * @param question
     * @return
     */
    public int delQuestionPic(Question question);

    /**
     * 获取
     * @param question
     * @return
     */
    public List<QuestionPic> getQuestionPics(Question question);
}
