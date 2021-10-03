package board.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import board.dao.BoardDAO;
import board.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Inject
	private BoardDAO boardDAO;
	
	@Override
	public void write(BoardVO boardVO) throws Exception {
		boardDAO.write(boardVO);
	}
}
