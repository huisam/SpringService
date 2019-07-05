package com.huisam.web.repository;

import com.huisam.web.domain.posts.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
    // JPA Repository에서 Test Code DataBase는 기본적으로 H2를 사용하고 있음
    // Repository는 DB에 연관되는 로직의 컨벤션
    // JpaRepository를 상속하면 CRUD 메소드가 자동완성 된다.
}
