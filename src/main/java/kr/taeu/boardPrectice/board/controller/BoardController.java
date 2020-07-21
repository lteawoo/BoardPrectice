package kr.taeu.boardPrectice.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.java.Log;

@Controller
@RequestMapping("/board")
public class BoardController {
	@GetMapping("/")
	public String index() {
		return "index";
	}
}
