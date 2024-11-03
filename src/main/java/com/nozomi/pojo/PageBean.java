package com.nozomi.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/*
* 分页类
* */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageBean {
    //总记录数
    private Long total;
    //数据集合
    private List data;
}
