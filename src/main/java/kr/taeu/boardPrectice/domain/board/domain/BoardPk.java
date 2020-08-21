package kr.taeu.boardPrectice.domain.board.domain;

import java.io.Serializable;
import java.util.Objects;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BoardPk implements Serializable{
  private static final long serialVersionUID = 9190089886520699913L;
  
  private Long id;
  
  public BoardPk(Long id) {
    this.id = id;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoardPk boardPk = (BoardPk) o;
    return id.equals(boardPk.id);
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
