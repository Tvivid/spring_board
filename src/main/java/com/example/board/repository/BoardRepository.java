package com.example.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardRepository, Long> { //entity class이름과 entity class가 가지고 있는 pk의 타입

}
