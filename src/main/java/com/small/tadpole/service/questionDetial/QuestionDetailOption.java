package com.small.tadpole.service.questionDetial;/*
 * @Author xu.chenyang
 * @Email chenyang.xu@linkkids.cn
 * @Description
 * @Date 11:47 2020/3/13
 **/

import com.small.tadpole.domain.Question;
import com.small.tadpole.domain.QuestionDetail;
import com.small.tadpole.domain.QuestionDetailExample;

import java.util.List;

public interface QuestionDetailOption {
    /**
     * 增加
     * @param questionDetail
     * @return
     */
    public int addQuestionDetail(QuestionDetail questionDetail);

    /**
     * 删除
     * @param question
     * @return
     */
    public int delQuestionDetail(Question question);

    /**
     * 更新
     * @param questionDetail
     * @return
     */
    public int updateQuestionDetail(QuestionDetail questionDetail,Question question);

    /**
     * 列表查看
     * @param questionDetailExample
     * @return
     */
    public List<QuestionDetail> listQuestionDetail(QuestionDetailExample questionDetailExample);

    /**
     * 单条查看
     * @param question
     * @return
     */
    public QuestionDetail getOneQuestionDetail(Question question);
}
