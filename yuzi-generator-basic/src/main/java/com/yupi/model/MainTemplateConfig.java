package com.yupi.model;

import lombok.Data;

/**
 * 动态模版配置
 */
@Data
public class MainTemplateConfig {

    /**
     * 是否生成循环（开关）
     */
    private boolean loop;

    /**
     * 作者注释（字符串，填充只）
     */
    private String author = "yupi";

    /**
     * 输出信息
     */
    private String outputText = "输出结果";
}
