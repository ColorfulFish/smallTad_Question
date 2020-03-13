package com.small.tadpole.service.question;

import com.small.tadpole.domain.*;
import com.small.tadpole.domain.pack.QuestionPackage;
import com.small.tadpole.mapper.QuestionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * @Author xu.chenyang
 * @Email chenyang.xu@linkkids.cn
 * @Description
 * @Date 22:35 2020/3/11
 **/
@Service("questionOptionImpl")
public class QuestionOptionImpl implements QuestionOption {
    @Autowired
    private QuestionMapper questionMapper;

    @Override
    public int addQuestion(Question question) {
        return questionMapper.insert(question);
    }

    @Override
    public int delQuestion(Integer id) {
        return questionMapper.logicalDeleteByPrimaryKey(id);
    }

    @Override
    public int updateQestion(Question question) {
        return questionMapper.updateByPrimaryKey(question);
    }

    @Override
    public List<Question> listQuestion(QuestionExample questionExample) {
        return questionMapper.selectByExample(questionExample);
    }

    @Override
    public Question getOneQuestion(Integer id) {
        return questionMapper.selectByPrimaryKey(id);
    }
}
