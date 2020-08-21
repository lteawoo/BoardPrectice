package kr.taeu.boardPrectice.domain.board.service;

import org.springframework.stereotype.Service;

import kr.taeu.boardPrectice.domain.board.dao.BoardRepository;
import kr.taeu.boardPrectice.domain.board.domain.Board;
import kr.taeu.boardPrectice.domain.board.domain.BoardPk;
import kr.taeu.boardPrectice.domain.board.dto.CreateBoardRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class BoardService {
  private final BoardRepository boardRepository;
  
  public Board findById(final Long id) {
    log.info("id: " + id);
    Board board = boardRepository.findById(new BoardPk(id))
        .orElseThrow(() -> new IllegalArgumentException("Not found board by id"));
    
    return board;
  }
   
  public Board create(final CreateBoardRequest dto) {
    return boardRepository.save(dto.toEntity());
  }
}
