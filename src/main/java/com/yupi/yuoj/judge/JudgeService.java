package com.yupi.yuoj.judge;


import com.yupi.yuoj.model.vo.QuestionSubmitVO;

public interface JudgeService {
    QuestionSubmitVO doJudge(long questionSubmitId);
}
