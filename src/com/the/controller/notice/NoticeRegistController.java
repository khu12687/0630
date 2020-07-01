package com.the.controller.notice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.the.controller.Controller;
import com.the.model.board.Notice;
import com.the.model.board.NoticeDAO;

//하위 컨트롤러 중, 글쓰기 요청을 처리하는 컨트롤러!!
public class NoticeRegistController  extends Controller{
	NoticeDAO noticeDAO = new NoticeDAO();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//DAO에게 일시키기!! (컨트롤러는 일을 하는자가 아니라 부리는 자)
		Notice notice = new Notice();
		notice.setTitle(request.getParameter("title"));
		notice.setWriter(request.getParameter("writer"));
		notice.setContent(request.getParameter("content"));
		int result = noticeDAO.insert(notice);
		System.out.println("등록 결과는 "+result);
	}

	@Override
	public String getViewName() {
		return "/view/notice/regist";
	}

}
