package com.example.mybatis_plus;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

public class MybatisPlusGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://139.224.213.105:3306/mybatis_plus?useUnicode=true&characterEncoding=utf8&serverTimezone=Asia/Shanghai",
                "root",
                "piyihao")
                .globalConfig(builder ->
                {
                    builder.author("皮一豪")
                            .enableSwagger()
                            .fileOverride()
                            .outputDir("E:\\IDEA_Workspace\\mybatis_plus\\src\\main\\java");
                })
                .packageConfig(builder ->
                {
                    builder.parent("com.example.mybatis_plus");
                })
                .execute();
    }
}
