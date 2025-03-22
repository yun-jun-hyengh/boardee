package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {
	@GetMapping("/boardfile")
	public String boardList() { // 여기 한번 수정 
		return "board/boardlist"; // 현재 board디렉토리에 boardlist라는 jsp 파일이 존재함 111467
	}
}
