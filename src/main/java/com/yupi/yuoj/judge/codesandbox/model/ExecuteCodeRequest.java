package com.yupi.yuoj.judge.codesandbox.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExecuteCodeRequest {

    /**
     * 输入案例
     */
    private List<String> inputList;
    /**
     * 提交代码
     */
    private String code;
    /**
     * 代码语言
     */
    private String language;
}
