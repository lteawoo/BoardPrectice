package kr.taeu.boardPrectice.domain.board.dto;

import kr.taeu.boardPrectice.domain.board.domain.Board;
import lombok.Getter;

@Getter
public class BoardResponse {
  private Long id;
  
  private String name;
  
  public BoardResponse(final Board board) {
    this.id = board.getId();
    this.name = board.getName();
  }
}
