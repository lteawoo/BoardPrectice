package kr.taeu.boardPrectice.domain.board.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/board")
public class BoardController {
	@GetMapping("/isRunning")
	public String index() {
		return "board run..";
	}
	
	@GetMapping("/read")
	public String read() {
		return "read";
	}
	
	@PutMapping("/write")
	public String write() {
		return "write";
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
