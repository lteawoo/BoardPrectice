package kr.taeu.boardPrectice.domain.board.dto;

import javax.validation.constraints.NotEmpty;

import org.springframework.lang.NonNull;

import lombok.Getter;

@Getter
public class UpdateBoardRequest {
  @NotEmpty
  private String name;
  
  public UpdateBoardRequest(@NonNull final String name) {
    this.name = name;
  }
}
