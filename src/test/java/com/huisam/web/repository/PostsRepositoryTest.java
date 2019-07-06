package com.huisam.web.repository;

import com.huisam.web.domain.posts.Posts;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    private PostsRepository postsRepository;

    @After
    public void tearDown() {
        postsRepository.deleteAll();
    }

    @Test
    @Transactional(readOnly = true)
    public void getting_All_Entity_Description() {
        /* when */
        List<Posts> postsList = postsRepository.findAllDesc().collect(Collectors.toList());
        /* then */
        assertThat(postsList.get(0).getTitle()).isEqualTo("테스트2");
        assertThat(postsList.get(0).getAuthor()).isEqualTo("test2@gmail.com");
        assertThat(postsList.get(0).getContent()).isEqualTo("테스트2의 본문");
        assertThat(postsList.get(0).getCreatedDate()).isBefore(LocalDateTime.now());
        assertThat(postsList.get(0).getModifidedDate()).isBefore(LocalDateTime.now());

        assertThat(postsList.get(1).getTitle()).isEqualTo("테스트1");
        assertThat(postsList.get(1).getAuthor()).isEqualTo("test1@gmail.com");
        assertThat(postsList.get(1).getContent()).isEqualTo("테스트1의 본문");
        assertThat(postsList.get(1).getCreatedDate()).isBefore(LocalDateTime.now());
        assertThat(postsList.get(1).getModifidedDate()).isBefore(LocalDateTime.now());
    }
}