package com.huisam.web.service;

import com.huisam.web.domain.posts.Posts;
import com.huisam.web.dto.PostsSaveRequestsDto;
import com.huisam.web.repository.PostsRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsServiceTest {

    @Autowired
    private PostsService postsService;

    @Autowired
    private PostsRepository postsRepository;

    @After
    public void tearDown() {
        postsRepository.deleteAll();
    }

    @Test
    public void DtoData_IsSaving_To_PostsDataBase() {
        /* given */
        PostsSaveRequestsDto dto = PostsSaveRequestsDto.builder()
                .author("huisam")
                .content("테스트")
                .title("테스트 표지")
                .build();

        /* when */
        postsService.save(dto);

        /* then */
        Posts posts = postsRepository.findAll().get(0);
        assertThat(posts.getAuthor()).isEqualTo("huisam");
        assertThat(posts.getContent()).isEqualTo("테스트");
        assertThat(posts.getTitle()).isEqualTo("테스트 표지");
    }
}