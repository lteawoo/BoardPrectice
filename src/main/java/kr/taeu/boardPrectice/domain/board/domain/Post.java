package kr.taeu.boardPrectice.domain.board.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="POST")
@Getter
@NoArgsConstructor
public class Post {
  @Id
  @Column(name = "POST_NO", nullable = false, unique = true, updatable = false)
  private Long postNo;
  
  @ManyToOne
  @JoinColumns({
    @JoinColumn(name = "BOARD_NO", referencedColumnName = "BOARD_NO", nullable = false)
  })
  private Board board;
  
  @Column(name = "TITLE", nullable = false, unique = false, updatable = true)
  private String title;
  
  @Column(name = "CONTENT", nullable = true, unique = false, updatable = true)
  private String content;
  
  @Column(name = "CREATE_DATE", nullable = false, unique = false, updatable = false)
  @CreatedDate
  private LocalDateTime createDate;
  
  @Column(name = "LAST_MODIFIED_DATE", nullable = false, unique = false, updatable = true)
  @LastModifiedDate
  private LocalDateTime lastModifiedDate;
}
