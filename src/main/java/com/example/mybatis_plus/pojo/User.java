package com.example.mybatis_plus.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
@TableName(value = "user",schema = "mybatis_plus")
public class User {
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    @TableField(insertStrategy = FieldStrategy.IGNORED,fill = FieldFill.INSERT)
    private String name;
    @TableField(insertStrategy = FieldStrategy.IGNORED,fill = FieldFill.INSERT)
    private Integer age;
    @TableField(insertStrategy = FieldStrategy.IGNORED,fill = FieldFill.INSERT)
    private String email;
}
