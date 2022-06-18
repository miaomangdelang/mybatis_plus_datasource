package com.joing.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Join.Yao (pathinfuture@163.com)
 * @date 2022/05/25 17:32
 */
@Data
@TableName("t_user")
public class User {

    @TableId
    private Integer id;

    private String name;

    private Integer age;

    private Integer sex;

    private String email;

    private Integer isDeleted;

}
