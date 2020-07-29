package kr.taeu.boardPrectice.domain.board.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String isRunning() {
		return "board run..";
	}
	
	@GetMapping("/{boardNo}")
	public String index(@PathVariable("boardNo") String boardNo) {
	  log.info("boardNo: " + boardNo);
		return "read";
	}
	
	// 반환값 추후 response 클래스로 변경해야함.
	@PutMapping("/create")
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
		return "delete";
	}
}
