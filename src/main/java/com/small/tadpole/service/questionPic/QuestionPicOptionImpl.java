package com.small.tadpole.service.questionPic;

import com.small.tadpole.domain.Question;
import com.small.tadpole.domain.QuestionPic;
import com.small.tadpole.domain.QuestionPicExample;
import com.small.tadpole.mapper.QuestionPicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * @Author xu.chenyang
 * @Email xu.chenyang24@gmail.com
 * @Description
 * @Date 14:38 2020/3/16
 **/
@Service("questionPicOptionImpl")
public class QuestionPicOptionImpl implements QuestionPicOption {

    @Autowired
    private QuestionPicMapper questionPicMapper;

    /**
     * 增加
     *
     * @param questionPicList
     * @return
     */
    @Override
    public int addQuestionPic(List<QuestionPic> questionPicList) {
        int i = 0;
        if(null!=questionPicList&&!questionPicList.isEmpty()){
            questionPicList.forEach(item->{
                questionPicMapper.insert(item);
            });
        }
        return 0;
    }

    /**
     * 删除
     *
     * @param question
     * @return
     */
    @Override
    public int delQuestionPic(Question question) {
        QuestionPicExample questionPicExample = new QuestionPicExample();
        questionPicExample.createCriteria().andIdEqualTo(question.getId());
        return questionPicMapper.logicalDeleteByExample(questionPicExample);
    }

    /**
     * 获取
     *
     * @param question
     * @return
     */
    @Override
    public List<QuestionPic> getQuestionPics(Question question) {
        QuestionPicExample questionPicExample = new QuestionPicExample();
        questionPicExample.createCriteria().andIdEqualTo(question.getId());
        return questionPicMapper.selectByExample(questionPicExample);
    }
}
