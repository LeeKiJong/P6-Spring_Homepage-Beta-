package com.test.homepage;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.homepage.dao.IDao;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	//ContentDao dao;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("/join")
	public String join(Model model){
		System.out.println("join");
		
		return "join";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		//IDao dao = sqlSession.getMapper(IDao.class);
		
		//model.addAttribute("list", dao.listDao());
		
		return "/list";
	}
	@RequestMapping("/writeForm")
	public String writeForm() {
		
		return "/writeForm";
	}
	@RequestMapping("/write")
	public String write(HttpServletRequest request, Model model) {
		//IDao dao = sqlSession.getMapper(IDao.class);
		//dao.writeDao(request.getParameter("mWriter"), request.getParameter("mcontent"));
		
		return "redirect:list";
	}
	
	@RequestMapping("/view")
	public String view() {
		return "/view";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) {
		//IDao dao = sqlSession.getMapper(IDao.class);
		//dao.deleteDao(request.getParameter("mId"));
		
		return "redirect:list";
	}

	@RequestMapping("/admin")
	public String admin() {
		return "/MainPage/admin";
	}
	
	@RequestMapping("/user")
	public String user() {
		return "/MainPage/user";
	}
	
}