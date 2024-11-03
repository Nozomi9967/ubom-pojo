package com.nozomi.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * 根据此类封装信息来搜索用户
 * */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserSearchFactor {
    private Integer id;
    private String username;
    private String nickname;
    private String email;
    private boolean userType;
}
