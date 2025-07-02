package com.pknu.backboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.pknu.backboard.entity.Board;
import com.pknu.backboard.service.BoardService;
import com.pknu.backboard.validation.BoardForm;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/board") // 공통이 되는 URL
@Controller
@Log4j2
@RequiredArgsConstructor
public class BoardController {

    @Autowired
    private final BoardService boardService;

    @GetMapping("/list")
    public String getList(Model model) {
        List<Board> boardList = this.boardService.getBoardList();
        model.addAttribute("boardList", boardList);

        return "board_list";
    }

    @GetMapping("/detail/{bno}")
    public String getDetail(Model model, @PathVariable("bno") Long bno) {
        Board board = this.boardService.getBoardOne(bno);

        model.addAttribute("board", board);
        return "board_detail"; // board_detail.html 필요
    }

    @GetMapping("/create") // 작성 요청할떄
    public String getCreate(BoardForm boardForm) {
        return "board_create"; // board_create.html 파일 생성
    }

    @PostMapping("/create") // 저장버튼 클릭 후
    public String setCreate(@Valid BoardForm boardForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "board_create";

        // TODO: 포스트 액션이후 처리
        this.boardService.setBoardOne(boardForm.getTitle(), boardForm.getContent());
        return "redirect:board/list";
    }

}
