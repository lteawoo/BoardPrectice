package kr.taeu.boardPrectice.domain.board.dto;

import javax.validation.constraints.NotEmpty;

import org.springframework.lang.NonNull;

import kr.taeu.boardPrectice.domain.board.domain.Board;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CreateBoardRequest {
  @NotEmpty
  private String boardId;
  @NotEmpty
  private String boardName;
  
  @Builder
  public CreateBoardRequest(@NonNull final String boardId, @NonNull final String boardName) {
    this.boardId = boardId;
    this.boardName = boardName;
  }
  
  public Board toEntity() {
    return Board.builder()
        .boardId(this.boardId)
        .boardName(this.boardName)
        .build();
  }
}
