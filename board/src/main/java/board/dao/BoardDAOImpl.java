package board.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import board.vo.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	@Override
	public void write(BoardVO boardVO) {
		sqlSession.insert("boardMapper.insert",boardVO);
	}
}
