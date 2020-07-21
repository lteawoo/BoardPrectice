package kr.taeu.boardPrectice.domain.board.domain;

import java.io.Serializable;
import java.util.Objects;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BoardPk implements Serializable{
  private static final long serialVersionUID = 9190089886520699913L;
  
  private Long boardNo;
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoardPk boardId = (BoardPk) o;
    return boardNo.equals(boardId.boardNo);
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(boardNo);
  }
}
