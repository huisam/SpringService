package com.huisam.web.dto;

import com.huisam.web.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

/**
 * Dto는 많이 만들더라도 domain 영역과 꼭 분리하는 것이 좋다!
 * domain의 Entity Class는 핵심 로직인 반면에,
 * Dto Class는 오로지 View를 위한 로직이므로 반드시 구분하는 것이 올바르다!
 */
@Getter
public class PostsMainResponseDto {
    private long id;
    private String title;
    private String author;
    private String modifidedDate;

    public PostsMainResponseDto(Posts entity) {
        id = entity.getId();
        title = entity.getTitle();
        author = entity.getAuthor();
        modifidedDate = toStringDatetime(entity.getModifidedDate());
    }

    private String toStringDatetime(LocalDateTime localDateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss");
        return Optional.of(localDateTime)
                .map(formatter::format)
                .orElse("");
    }
}
