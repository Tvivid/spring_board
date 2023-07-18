package com.example.board.entity;

import com.example.board.dto.BoardDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

//DB의 테이블 역할을 하는 클래스
//service와 repository에서만 사용한다는 설정
@Entity
@Getter
@Setter
@Table(name="board_table")
public class BoardEntity extends BaseEntity{
    @Id //pk 컬럼 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;

    @Column(length = 20, nullable = false)//false로 설정하면 null일 수 없다)//크기 20
    private String boardWriter;

    @Column//크기 255, null가능
    private String boardPass;

    @Column
    private String boardTitle;

    @Column(length = 500)
    private String boardContents;

    @Column
    private int boardHits;

    public static  BoardEntity toSaveEntity(BoardDTO boardDTO){
        BoardEntity boardEntity = new BoardEntity();
        boardEntity.setBoardWriter(boardDTO.getBoardWriter());
        boardEntity.setBoardPass(boardEntity.getBoardPass());
        boardEntity.setBoardTitle(boardEntity.getBoardTitle());
        boardEntity.setBoardContents(boardEntity.getBoardContents());
        boardEntity.setBoardHits(0);
        return boardEntity;
    }


}
