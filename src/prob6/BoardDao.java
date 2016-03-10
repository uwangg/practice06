package prob6;

import java.util.LinkedList;
import java.util.List;

public class BoardDao extends Board {
	List<Board> list;
	public BoardDao() {
		list = new LinkedList();
		Board bd[] = new Board[3];
		for(int i=0 ; i<3 ; i++)
		{
			bd[i] = new Board();
			bd[i].setTitle("제목"+(i+1));
			bd[i].setContent("내용"+(i+1));
			list.add(bd[i]);
		}
	}
	List getBoardList() {
		return list;
	}
}
