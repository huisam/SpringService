package com.huisam.web.domain.posts;

import com.huisam.web.domain.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity // 테이블 이름
public class Posts extends BaseTimeEntity {

    @Id // PrimaryKey
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment
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
