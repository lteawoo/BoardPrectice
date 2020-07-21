package kr.taeu.boardPrectice.domain.board.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.taeu.boardPrectice.domain.board.domain.Board;
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
	public String index() {
		return "board run..";
	}
	
	@GetMapping("/read")
	public String read() {
		return "read";
	}
	
	@PutMapping("/write")
	public Board write(@RequestBody @Valid final CreateBoardRequest dto) {
	  log.info("Create Board: " + dto.getBoardName());
		return boardService.create(dto);
	}
	
	@PostMapping("/update")
	public String update() {
		return "update";
	}
	
	@DeleteMapping("/delete")
	public String delete() {
		return "update";
	}
}
