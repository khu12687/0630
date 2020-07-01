package com.the.gui;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.the.model.movie.MovieService;

public class MovieApp extends JFrame{
	Choice ch;
	JButton bt;
	MovieService movieService = new MovieService();
	public MovieApp() {
		ch = new Choice();
		bt = new JButton("결과보기");
		ch.add("para");
		ch.add("starwars");
		ch.add("007");
		setLayout(new FlowLayout());
		add(ch);
		add(bt);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,150);
		
		//버튼과 리스너 연결!!
		bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String msg = movieService.getAdivce(ch.getSelectedItem());
				JOptionPane.showMessageDialog(MovieApp.this,msg);
			}
		});
	}
	public static void main(String[] args) {
		new MovieApp();
	}
}
