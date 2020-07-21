package kr.taeu.boardPrectice.domain.board.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.taeu.boardPrectice.domain.board.domain.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
