package com.huisam.web.service;

import com.huisam.web.dto.PostsSaveRequestsDto;
import com.huisam.web.repository.PostsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

// Service와 Controller로직을 직접 분리하여, 해당 역할을 할 수 있게 패키지를 지정
@AllArgsConstructor
@Service
public class PostsService {
    private PostsRepository postsRepository;

    @Transactional // DB에 등록,수정,삭제는 반드시 필요한 트랜잭션 작업
    public long save(PostsSaveRequestsDto dto) {
        return postsRepository.save(dto.toEntity())
                .getId();
    }
}
