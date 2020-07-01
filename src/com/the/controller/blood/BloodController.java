package com.the.controller.blood;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.the.controller.Controller;
import com.the.model.blood.BloodService;
import com.the.model.movie.MovieService;

public class BloodController extends Controller{
	 public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String blood = request.getParameter("blood");
			//로직은 여기서 짜지말고, 공통코드로 분리시켜놓은 객체를 재사용
			BloodService bloodService = new BloodService();
			String msg = bloodService.getAdivce(blood);
			
			 request.setAttribute("msg", msg); //요청갹채애 원하는 대아터를 심는다
			 
			//System.out.println("컨트롤러에서의 결과"+msg);
			//얻어진 결과를, view 인 jsp로 전달해보자!!
			
			//클라이언트인 브라우저가 재접속할 URL
			//아래의 경우처럼 get 방식으로 데이터를 view에 전달하는 방식은 
			//오직 string 만 가능하므로, 사용 할 수없다!!
			//방법??
			//response.sendRedirect("/movie2/result.jsp?msg="+msg);
			
			//클라이언트에게 응답처리를 하지말고, 서버상의 또 다른 자원으로 요청의 흐름을 이어가자!!
			//즉 포위 당해보자
			// RequestDispatcher dis = null;
			// dis = request.getRequestDispatcher("/blood/result.jsp");
			 //setAttribute를 이용하면,String 포함된 모든 객체를 담을 수 잏다!
			 //request.setAttribute("msg", msg); //요청갹채애 원하는 대아터를 심는다
			 //생성된 포워딩 객체를 이용하면 됨
			// dis.forward(request, response);	
	 }
	 @Override
	public String getViewName() {
		 return "/view/blood";
	 }
}
