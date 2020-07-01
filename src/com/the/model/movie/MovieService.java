package com.the.model.movie;

//이 클래스는 웹이건 응용이건 플랫폼에 상관없이 공통적으로 사용이가능한,
//즉 재사용성을 위한 모델객체이다!!
public class MovieService {	
	public String getAdivce(String movie) {
		String msg = null;
		if(movie.equals("para")){
			msg="아케데미 수상작";
		}else if(movie.equals("starwars")){
			msg="폭망함";
		}else if(movie.equals("007")){
			msg="10월 기대작";
		}
		return msg;
	}
}
