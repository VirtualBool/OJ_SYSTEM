package com.yupi.yuoj.judge.codesandbox;

import com.yupi.yuoj.judge.codesandbox.impl.ExampleCodeSandbox;
import com.yupi.yuoj.judge.codesandbox.impl.RemoteCodeSandbox;
import com.yupi.yuoj.judge.codesandbox.impl.ThirdPartyCodeSandbox;

/**
 * 代码沙箱工厂，根据配置选择沙箱
 */
public class CodeSandboxFactory {

    /**
     * 根据沙箱类型选择创建沙箱对象
     * @param type 沙箱类型
     * @return
     */
     public static CodeSandbox newInstance(String type) {

         switch (type){
             case "thirdParty":
                 return new ThirdPartyCodeSandbox();
             case "remote" :
                 return new RemoteCodeSandbox();
             default:
                 return new ExampleCodeSandbox();
         }

    }
}
