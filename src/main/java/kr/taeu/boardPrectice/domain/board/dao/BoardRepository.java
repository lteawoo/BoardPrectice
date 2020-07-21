package kr.taeu.boardPrectice.domain.board.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.taeu.boardPrectice.domain.board.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
