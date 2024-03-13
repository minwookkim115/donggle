package com.ssafy.backend.domain.book.dto;

import com.ssafy.backend.domain.book.entity.Book;
import com.ssafy.backend.domain.user.entity.User;
import lombok.Builder;

@Builder
public record BookReviewResponseDto(
        User user,
        Book book,
        int score,
        String content
) {
}
