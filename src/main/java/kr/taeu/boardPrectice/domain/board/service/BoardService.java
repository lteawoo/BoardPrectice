package kr.taeu.boardPrectice.domain.board.service;

import org.springframework.stereotype.Service;

import kr.taeu.boardPrectice.domain.board.dao.BoardRepository;
import kr.taeu.boardPrectice.domain.board.domain.Board;
import kr.taeu.boardPrectice.domain.board.dto.CreateBoardRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class BoardService {
  private final BoardRepository boardRepository;
   
  public Board create(final CreateBoardRequest dto) {
    return boardRepository.save(Board.builder()
        .boardName(dto.getBoardName())
        .build());
  }
}
