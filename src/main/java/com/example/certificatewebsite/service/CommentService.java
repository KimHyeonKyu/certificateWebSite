package com.example.certificatewebsite.service;

import com.example.certificatewebsite.entity.Board;

public interface CommentService {
    void writeComment(Board board, String comment, String memberID);
}
