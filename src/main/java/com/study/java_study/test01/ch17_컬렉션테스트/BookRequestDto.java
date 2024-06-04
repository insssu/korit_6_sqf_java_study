package com.study.java_study.test01.ch17_컬렉션테스트;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@AllArgsConstructor
@Data
public class BookRequestDto {
    private int status;
    private String message;
    private List<BookEntity> bookEntities;
}
