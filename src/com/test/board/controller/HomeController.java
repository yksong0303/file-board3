package com.test.board.controller;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	
	private SqlSessionFactory ssf;
	private BasicDataSource dbs = new BasicDataSource();
	@RequestMapping("/")
	public String goHome(Model model) {
		model.addAttribute("msg","ㅅㅄㅄ");
		
		dbs.setDriverClassName("oracle.jdbc.OracleDriver");
		dbs.setUrl("jdbc:oracle:thin:@localhost:1521/xe");
		dbs.setUsername("test");
		dbs.setPassword("test");
		try {
			Connection con = dbs.getConnection();
			System.out.println(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		return "index";
	}
}
