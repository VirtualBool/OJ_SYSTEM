package com.yupi.yuoj.judge.codesandbox.impl;
import com.yupi.yuoj.model.dto.questionsubmit.JudgeInfo;

import com.yupi.yuoj.judge.codesandbox.CodeSandbox;
import com.yupi.yuoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.yupi.yuoj.judge.codesandbox.model.ExecuteCodeResponse;
import com.yupi.yuoj.model.enums.JudgeInfoMessageEnum;

import java.util.List;

public class ExampleCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("示例代码沙箱");
        List<String> output = executeCodeRequest.getInputList();
        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutput(output);
        executeCodeResponse.setStatus(0);
        executeCodeResponse.setMessage("运行成功");
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getValue());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(19L);
        executeCodeResponse.setJudgeInfo(judgeInfo);

        return executeCodeResponse;

    }
}
