package kr.taeu.boardPrectice.domain.board.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.taeu.boardPrectice.domain.board.domain.BoardPk;
import kr.taeu.boardPrectice.domain.board.dto.BoardResponse;
import kr.taeu.boardPrectice.domain.board.dto.CreateBoardRequest;
import kr.taeu.boardPrectice.domain.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
public class BoardController {
  private final BoardService boardService;
  
	@GetMapping("/isRunning")
	public String isRunning() {
		return "board run..";
	}
	
	@GetMapping("/{boardId}")
	public BoardResponse getById(@PathVariable("boardId") final Long boardId) {
	  log.info("boardId: " + boardId);
		return new BoardResponse(boardService.findById(boardId));
	}
	
	@PostMapping()
	public BoardResponse write(@RequestBody @Valid final CreateBoardRequest dto) {
	  log.info("Create Board: " + dto.getName());
		return new BoardResponse(boardService.create(dto));
	}
	
	@PatchMapping("/{boardId}")
	public void update(@RequestBody @Valid final ) {
		
	}
	
	@DeleteMapping("/{boardId}")
	public void delete() {
	}
}
