package com.nozomi.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/*
* 用户类
* */

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_user")
public class User {
    // 用户id，主键，唯一标识
    private Integer id;
    // 用户名，1-20
    private String username;
    // 用户类型，0-普通用户，1-管理员
    private boolean userType;
    // 密码，6-20
    private String password;
    // 昵称
    private String nickname="未命名";
    // 邮箱
    private String email;
    // 头像
    private String image;
    // 创建时间
    private LocalDateTime createTime;
    // 更新时间
    private LocalDateTime updateTime;
}
