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
  private Long id;
  @NotEmpty
  private String name;
  
  @Builder
  public CreateBoardRequest(@NonNull final Long id, @NonNull final String name) {
    this.id = id;
    this.name = name;
  }
  
  public Board toEntity() {
    return Board.builder()
        .id(this.id)
        .name(this.name)
        .build();
  }
}
