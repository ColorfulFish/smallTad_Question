package com.small.tadpole.controller.kit;
/*
 * @Author xu.chenyang
 * @Email xu.chenyang24@gmail.cn
 * @Description
 * @Date 9:03 2019/9/27
 **/

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.small.tadpole.domain.Question;
import com.small.tadpole.domain.QuestionExample;

import com.small.tadpole.service.question.QuestionOptionImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/wx/question")
@Api(value="微信端调用处理问题接口")
public class WxQuestionOption {
    @Autowired
    private QuestionOptionImpl questionOption;
    @ApiOperation(value="查询所有问题",notes="开始页数,页数大小", httpMethod = "GET")
    @GetMapping("/list")
    public PageInfo<Question> list(@ApiParam(value = "page 开始页数",required = true)int page,
                                   @ApiParam(value = "size 页数大小",required = true)int size){
        PageHelper.startPage(page,size);
        PageInfo<Question> questionPageInfo = new PageInfo<>();
        QuestionExample questionExample  = new QuestionExample();
        List<Question> questionList = questionOption.listQuestion(questionExample);
        questionPageInfo.setList(questionList);
        return questionPageInfo;
    }

    @ApiOperation(value="创建问题",notes="", httpMethod = "POST")
    @PostMapping("/add")
    public int add(@RequestBody Question question){
        question.setCreateTime(LocalDateTime.now());
        questionOption.addQuestion(question);
        return question.getId();
    }

}
