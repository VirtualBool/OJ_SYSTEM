package com.yupi.yuoj.judge.codesandbox.model;

import com.yupi.yuoj.model.dto.questionsubmit.JudgeInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExecuteCodeResponse {

    /**
     * 输出
     */
    private List<String> output;
    /**
     * 执行状态
     */
    private Integer status;
    /**
     * 接口信息
     */
    private String message ;
    /**
     * 判题信息
     */
    private JudgeInfo judgeInfo;
}
