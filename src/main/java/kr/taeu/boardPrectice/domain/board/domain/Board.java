package kr.taeu.boardPrectice.domain.board.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "BOARD")
@IdClass(BoardPk.class)
@Getter
@NoArgsConstructor
public class Board {
  @Id
  @Column(name = "BOARD_NO", nullable = false, unique = true, updatable = false)
  private Long boardNo;
  
  @Column(name = "NAME", nullable = false, unique = false, updatable = true, length = 20)
  private String boardName;

  @Column(name = "CREATE_DATE", nullable = false, unique = false, updatable = false)
  @CreatedDate
  private LocalDateTime createDate;
  
  @Column(name = "LAST_MODIFIED_DATE", nullable = false, unique = false, updatable = true)
  @LastModifiedDate
  private LocalDateTime lastModifiedDate;
}
