package com.the.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//모든 하위 컨트롤러의 최상위 객체를 정의!!
//다형성을 이용한 코드의 유연성이 높아진다!!
public abstract class Controller {
	 public abstract void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	 public abstract String getViewName();
}
