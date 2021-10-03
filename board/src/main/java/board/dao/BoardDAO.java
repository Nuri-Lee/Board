package board.dao;

import board.vo.BoardVO;

public interface BoardDAO {
	
	public void write(BoardVO boardVO) throws Exception;

}
