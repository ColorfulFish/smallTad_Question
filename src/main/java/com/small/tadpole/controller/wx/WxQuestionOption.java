package com.small.tadpole.controller.wx;
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

import com.small.tadpole.domain.pack.QuestionPackage;
import com.small.tadpole.service.question.QuestionOptionImpl;
import com.small.tadpole.service.questionPack.QuestionPackOptionImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wx/question")
@Api(value="微信端调用处理问题接口")
public class WxQuestionOption {
    @Autowired
    private QuestionOptionImpl questionOption;

    @Autowired
    private QuestionPackOptionImpl questionPackOption;
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


    @ApiOperation(value="查询明细",notes="", httpMethod = "GET")
    @GetMapping("/detail")
    public QuestionPackage detail(@RequestBody Question question){
        return questionPackOption.getQuestionPackage(question);
    }


    @ApiOperation(value="创建问题",notes="", httpMethod = "POST")
    @PostMapping("/add")
    public int add(@RequestBody QuestionPackage question){
        return questionPackOption.addQuestionPackage(question);
    }

}
