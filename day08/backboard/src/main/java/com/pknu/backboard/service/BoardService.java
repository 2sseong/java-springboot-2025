package com.pknu.backboard.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.pknu.backboard.entity.Board;
import com.pknu.backboard.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {

    @Autowired
    private final BoardRepository boardRepository;

    // SELECT * FROM board
    public List<Board> getBoardList() {
        return this.boardRepository.findAll(); // SELECT *
    }

    // 페이징용 게시판 조회메서드
    public Page<Board> getBoardList(int page) {
        Pageable pageable = PageRequest.of(page, 10); // 10을 변경해서 한 페이지에 20,30개 표현도 가능

        return this.boardRepository.findAll(pageable);
    }

    // SELECT * FROM board WHERE bno = ?
    public Board getBoardOne(Long bno) {
        Optional<Board> opBoard = this.boardRepository.findById(bno);
        if (opBoard.isPresent()) {
            return opBoard.get();
        } else {
            throw new RuntimeException("board not found");
        }
    }

    // INSERT INTO board VALUES ...
    public void setBoardOne(String title, String content) {
        Board board = new Board();
        board.setTitle(title);
        board.setContent(content);
        board.setCreateDate(LocalDateTime.now());

        this.boardRepository.save(board);
    }
}
