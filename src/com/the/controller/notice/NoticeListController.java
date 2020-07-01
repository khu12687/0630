package com.the.controller.notice;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.the.controller.Controller;
import com.the.model.board.Notice;
import com.the.model.board.NoticeDAO;

//Notice 게시판과 관련된 요청을 전담하는 컨트롤러 클래스
public class NoticeListController extends Controller{
	NoticeDAO noticeDAO=new NoticeDAO();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Model인 DAO에게 일시키기!!
		List list = noticeDAO.selectAll();
		//객체 담기
		request.setAttribute("list", list);
	}

	@Override
	public String getViewName() {
		return "/view/notice/list";
	}
	
}
