package com.study.java_study.ch17_컬렉션;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

// Data Transfer Object
// 데이터 전송 객체. 데이터를 주고 받는
@AllArgsConstructor
@Data
public class BookRequestDto {
    private int status;
    private String message;
    private List<BookEntity> bookEntities;       // List 타입의 books들 -> boonEntities로 왜 바꿔준건지
}
