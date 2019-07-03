package com.huisam.web.domain.posts;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsTest {

    @Autowired
    private PostsRepository postsRepository;

    @After
    public void tearDown() {
        postsRepository.deleteAll();
    }

    @Test
    public void board_save_testing() {
        /* given */
        postsRepository.save(Posts.builder()
                .title("테스트 게시글")
                .content("테스트 본문")
                .author("huisam")
                .build());

        /* when */
        List<Posts> postsList = postsRepository.findAll();

        /* then */
        Posts posts = postsList.get(0);
        assertThat(posts.getTitle()).isEqualTo("테스트 게시글");
        assertThat(posts.getContent()).isEqualTo("테스트 본문");
    }

    @Test
    public void BaseTimeEntity_Register() {
        /* given */
        LocalDateTime now = LocalDateTime.now();
        postsRepository.save(Posts.builder()
                .title("테스트 게시글")
                .content("테스트 내용")
                .author("huisam")
                .build());

        /* when */
        List<Posts> postsList = postsRepository.findAll();

        /* then */
        Posts posts = postsList.get(0);
        assertThat(posts.getCreatedDate()).isAfter(now);
        assertThat(posts.getModifidedDate()).isAfter(now);
    }
}