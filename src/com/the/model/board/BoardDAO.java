package com.the.model.board;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.the.mybatis.MybatisConfigManager;

public class BoardDAO {
	MybatisConfigManager manager = MybatisConfigManager.getInstance();
	
	//목록가져오기 selectAll
	public List selectAll() {
		List list = null;
		SqlSession sqlSession=manager.getSqlSession();
		list = sqlSession.selectList("Board.selectAll");
		manager.closeSession(sqlSession);
		return  list;
	}
	//한건 가져오기 select
	
	//1건 등록 insert
	public int insert(Board board) {
		int result=0;
		SqlSession sqlSession = manager.getSqlSession();
		System.out.println("insert 하기전의 board_id "+board.getBoard_id());
		result = sqlSession.insert("Board.insert",board);
		sqlSession.commit();
		System.out.println("insert 한후의 board_id "+board.getBoard_id());
		return result;
	}
	//1건 수정 update
	
	//1건 삭제 delete
	
	//rank + 1증가 updateRank
	
	//답변 등록 aply
}
