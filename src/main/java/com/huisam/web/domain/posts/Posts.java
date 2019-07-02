package com.huisam.web.domain.posts;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity // 테이블 이름
public class Posts {

    @Id // PrimaryKey
    @GeneratedValue // Auto Increment
    private long id;

    @Column(length = 500, nullable = false) // length = VAR CHAR 길이
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
