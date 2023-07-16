package com.example.board.controller;

import com.example.board.dto.BoardDTO;
import com.example.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;
    @GetMapping("/save")
    public String saveForm() {
        return "save";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute BoardDTO boardDTO){ //BoardDTO라는 클래스 객체를 찾아서 html에서 name에 들어간 내용을 dto 필드에 넣어줌
        System.out.println("boardDTO = " + boardDTO);
        boardService.save(boardDTO);

        return null;
    }
}
