package com.nozomi.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/*
* 根据此类封装信息来搜索书籍
* */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookSearchFactor {
    private String bookName;
    private String author;
    private Float bottomPrice;
    private Float topPrice;
//    private LocalDate beginDate;
//    private LocalDate endDate;
}
