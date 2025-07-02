package com.pknu.backboard.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
