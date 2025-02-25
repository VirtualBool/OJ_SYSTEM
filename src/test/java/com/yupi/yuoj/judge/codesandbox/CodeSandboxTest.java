package com.yupi.yuoj.judge.codesandbox;

import com.yupi.yuoj.judge.codesandbox.impl.ExampleCodeSandbox;
import com.yupi.yuoj.judge.codesandbox.impl.RemoteCodeSandbox;
import com.yupi.yuoj.judge.codesandbox.impl.ThirdPartyCodeSandbox;
import com.yupi.yuoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.yupi.yuoj.judge.codesandbox.model.ExecuteCodeResponse;
import com.yupi.yuoj.model.entity.QuestionSubmit;
import com.yupi.yuoj.model.enums.QuestionSubmitLanguageEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;


@SpringBootTest
class CodeSandboxTest {

    @Value("${codesandbox.type}")
    private String type;
    @Test
    void executeCode() {
        CodeSandbox codeSandbox = CodeSandboxFactory.newInstance(type);
        String code = "int main";
        String language = QuestionSubmitLanguageEnum.JAVA.getValue();
        List<String> input = Arrays.asList("1 2", "2 3");
        ExecuteCodeRequest executeCodeRequest = ExecuteCodeRequest.builder()
                .code(code)
                .inputList(input)
                .language(language).build();
        ExecuteCodeResponse executeCodeResponse = codeSandbox.executeCode(executeCodeRequest);
        Assertions.assertNotNull(executeCodeResponse);
    }

    @Test
    void executeCodeProxy() {
        CodeSandbox codeSandbox = CodeSandboxFactory.newInstance(type);
        codeSandbox = new CodeSandboxProxy(codeSandbox);
        String code = "int main";
        String language = QuestionSubmitLanguageEnum.JAVA.getValue();
        List<String> input = Arrays.asList("1 2", "2 3");
        ExecuteCodeRequest executeCodeRequest = ExecuteCodeRequest.builder()
                .code(code)
                .inputList(input)
                .language(language).build();
        ExecuteCodeResponse executeCodeResponse = codeSandbox.executeCode(executeCodeRequest);
        System.out.println(executeCodeResponse);
        Assertions.assertNotNull(executeCodeResponse);
    }
}