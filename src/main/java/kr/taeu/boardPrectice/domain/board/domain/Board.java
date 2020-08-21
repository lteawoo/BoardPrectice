package kr.taeu.boardPrectice.domain.board.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.lang.NonNull;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "BOARD")
@IdClass(BoardPk.class)
@Getter
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Board {
  @Id
  @Column(name = "BOARD_ID", nullable = false, unique = true, updatable = false)
  private Long id;
  
  @Column(name = "BOARD_NAME", nullable = false, unique = false, updatable = true, length = 20)
  private String name;

  @CreatedDate
  @Column(name = "CREATE_DATE", nullable = true, unique = false, updatable = false)
  private LocalDateTime createDate;
  
  @LastModifiedDate
  @Column(name = "LAST_MODIFIED_DATE", nullable = true, unique = false, updatable = true)
  private LocalDateTime lastModifiedDate;
  
  @Builder
  public Board(@NonNull final Long id, @NonNull final String name) {
    this.id = id;
    this.name = name; 
  }
}
