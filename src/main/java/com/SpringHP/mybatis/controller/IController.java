package com.SpringHP.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SpringHP.mybatis.command.Command;
import com.SpringHP.mybatis.command.JoinCommand;
import com.SpringHP.mybatis.command.LoginCommand;

/*@Controller
public class IController {
	Command command;
	
	@RequestMapping("/join")
	public String join(Model model){
		System.out.println("join");
		
		command = new JoinCommand();
		command.execute(model);
		return "join";
	}
	@RequestMapping("/login")
	public String login(Model model){
		System.out.println("login");
		
		command = new LoginCommand();
		command.execute(model);
		return "login";
	}
	@RequestMapping("/main")
	public String main(Model model){
		System.out.println("main");
		return "main";
	}
	
	
}*/
