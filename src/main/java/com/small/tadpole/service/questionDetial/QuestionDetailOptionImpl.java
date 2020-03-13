package com.small.tadpole.service.questionDetial;

import com.small.tadpole.domain.Question;
import com.small.tadpole.domain.QuestionDetail;
import com.small.tadpole.domain.QuestionDetailExample;
import com.small.tadpole.mapper.QuestionDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * @Author xu.chenyang
 * @Email chenyang.xu@linkkids.cn
 * @Description
 * @Date 11:52 2020/3/13
 **/
@Service("questionDetailOptionImpl")
public class QuestionDetailOptionImpl implements QuestionDetailOption {

    @Autowired
    private QuestionDetailMapper questionDetailMapper;
    /**
     * 增加
     *
     * @param questionDetail
     * @return
     */
    @Override
    public int addQuestionDetail(QuestionDetail questionDetail) {
        return questionDetailMapper.insert(questionDetail);
    }

    /**
     * 删除
     *
     * @param question
     * @return
     */
    @Override
    public int delQuestionDetail(Question question) {
        QuestionDetailExample questionDetailExample = new QuestionDetailExample();
        questionDetailExample.createCriteria().andIdEqualTo(question.getId());
        return questionDetailMapper.logicalDeleteByExample(questionDetailExample);
    }

    /**
     * 更新
     *
     * @param questionDetail
     * @return
     */
    @Override
    public int updateQuestionDetail(QuestionDetail questionDetail,Question question) {
        QuestionDetailExample questionDetailExample = new QuestionDetailExample();
        questionDetailExample.createCriteria().andIdEqualTo(question.getId());
        return questionDetailMapper.updateByExampleSelective(questionDetail,questionDetailExample);
    }

    /**
     * 列表查看
     *
     * @param questionDetailExample
     * @return
     */
    @Override
    public List<QuestionDetail> listQuestionDetail(QuestionDetailExample questionDetailExample) {
        return null;
    }

    /**
     * 单条查看
     *
     * @param question
     * @return
     */
    @Override
    public QuestionDetail getOneQuestionDetail(Question question) {
        QuestionDetailExample questionDetailExample = new QuestionDetailExample();
        questionDetailExample.createCriteria().andIdEqualTo(question.getId());
        return questionDetailMapper.selectOneByExample(questionDetailExample);
    }
}
