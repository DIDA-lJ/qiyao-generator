package com.qiyao.model;

import lombok.Data;

/**
 * @ClassName MainConfigTemplate
 * @Description 动态模版配置
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/11/13
 */

@Data
public class MainTemplateConfig {

    /**
     * 是否生成循环 (开关)
     */
    private boolean loop;

    /**
     * 作者注释
     */
    private String author="作者";

    /**
     * 输出信息
     */
    private String outputText="输出结果";
}

