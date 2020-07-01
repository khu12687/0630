package com.the.gui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropApp {
	public static void main(String[] args) {		
		//key-value 쌍으로 이루어진 맵형 데이터를
		//해석할 수 있는 전담 객체인 Properties를 이용해본다
		Properties props = new Properties();
		String path ="C:/web_app_DB/javaEE/WebApp0630/WebContent/WEB-INF/mapping.data";
		try {
			FileInputStream fis = new FileInputStream(path);
			props.load(fis);
			System.out.println(props.get("/movie.do"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
