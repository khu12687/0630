package com.the.controller.movie;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.the.controller.Controller;
import com.the.model.movie.MovieService;

//클라이언트의 요청 중 영화와 관련된 요청을 처리하기 위한
//컨트롤러 클래스!! 왜? jsp인 디자인과 로직인 pojo를 분리시키기 위해
public class MovieController extends Controller{
	 
	 public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String movie = request.getParameter("movie");
			//로직은 여기서 짜지말고, 공통코드로 분리시켜놓은 객체를 재사용
			MovieService movieService = new MovieService();
			String msg = movieService.getAdivce(movie);
			
			 request.setAttribute("msg", msg); //요청갹채애 원하는 대아터를 심는다
			 
			//System.out.println("컨트롤러에서의 결과"+msg);
			//얻어진 결과를, view 인 jsp로 전달해보자!!
			
			//클라이언트인 브라우저가 재접속할 URL
			//아래의 경우처럼 get 방식으로 데이터를 view에 전달하는 방식은 
			//오직 string 만 가능하므로, 사용 할 수없다!!
			//방법??
			//response.sendRedirect("/movie2/result.jsp?msg="+msg);
			
			//클라이언트에게 응답처리를 하지말고, 서버상의 또 다른 자원으로 요청의 흐름을 이어가자!!
			 
	 }
	 @Override
	public String getViewName() {
		return "/view/movie";
	}
}
