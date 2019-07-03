package com.huisam.web.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass // JPA Entity 클래스가 BaseTimeEntity를 상속하면 Column에 createdDate, modifidedDate도 포함으로 간주
@EntityListeners(AuditingEntityListener.class)
public class BaseTimeEntity {

    @CreatedDate // Entity가 생성될때 자동으로 저장
    private LocalDateTime createdDate;

    @LastModifiedDate // 마지막으로 변경할 때 자동으로 저장
    private LocalDateTime modifidedDate;
}
