package com.nozomi.pojo;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/*
* 书籍类
* */

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_book")
public class Book {
    //书籍id，主键，自增
    private Integer id;

    //图书名
    private String bookname;

    //作者
    private String author;

    //价格
    private Float price;

    //描述
    private String description;

    //图片
    private String image;

    //所属用户
    private Integer userId;

    //创建时间
    private LocalDateTime createTime;

    //更新时间
    private LocalDateTime updateTime;
}


