package com.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.dao.BoardDAO;
import com.board.domain.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;
	
	
	//게시물 목록
	@Override
	public List<BoardVO> list() throws Exception {

		return dao.list();
	}

	//게시물 총 갯수
	@Override
	public int count() throws Exception {
		return dao.count();
	}

	//게시물 목록 + 페이징 + 검색
	@Override
	public List<BoardVO> listPage(int displayPost, int postNum, String searchType, String keyword, String fromDate, String toDate) throws Exception {
		 return  dao.listPage(displayPost, postNum, searchType, keyword, fromDate, toDate);
	}
	
	// 게시물 총 갯수
	@Override
	public int searchCount(String searchType, String keyword) throws Exception {
	 return dao.searchCount(searchType, keyword);
	}
	
	// 달력 총 갯수
	@Override
	public int calCount( String fromDate, String toDate) throws Exception {
	 return dao.searchCount(fromDate, toDate);
	}

	@Override
	public void write(BoardVO vo) throws Exception {
		dao.write(vo);		
	}
	
	// 게시물 조회
	@Override
	public BoardVO view(int bno) throws Exception {

	 return dao.view(bno);
	}
 
}