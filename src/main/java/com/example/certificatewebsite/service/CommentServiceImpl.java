package com.example.certificatewebsite.service;

import com.example.certificatewebsite.entity.Board;
import com.example.certificatewebsite.entity.Comment;
import com.example.certificatewebsite.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    CommentRepository commentRepository;

    @Override
    public void writeComment(Board board, String comment, String memberID) {
        Comment c1 = new Comment();
        c1.setComment(comment);
        c1.setCreateDate(LocalDateTime.now());
        c1.setBoard(board);
        c1.setId(memberID);
        this.commentRepository.save(c1);
    }
}
