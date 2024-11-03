package com.nozomi.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/*
* 帖子类
* */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    //帖子id，唯一标识，递增，主键
    private Integer id;
    //用户id
    private Integer userId;
    //标题
    private String headline;
    //内容
    private String content;
    //图片
    private String image;
    //点赞数
    private Integer likeCount;
    //评论数
    private Integer commentCount;
    //帖子发布时间
    private LocalDateTime createTime;
    //帖子修改时间
    private LocalDateTime updateTime;
}
