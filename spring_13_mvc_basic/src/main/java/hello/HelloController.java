package hello;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import model.User;

@Controller
public class HelloController {
	
	@RequestMapping("/index.do") 
	protected String index() {  //String => response page Name
		//응답시 페이지만 불러올 경우 사용 ( = sendredirect)
		return "index";
		//index.jsp
	}
	
	@RequestMapping("/hello.do")       //get 방식
	//@RequestMapping(value="/hello.do")
	protected ModelAndView hello() {	   //응답시 정보도 같이 전송할 경우 ModelAndView 객체 사용
		ModelAndView mv = new ModelAndView();			
		mv.setViewName("ok");  // ok.jsp
		mv.addObject("message", "Spring MVC");	
		return mv;
	}
	
	@RequestMapping("/login/hello.do")  //get 방식
	//@RequestMapping(value="/login/hello.do", method=RequestMethod.POST)  //post 방식
	protected ModelAndView loginHello(HttpServletRequest request) {
		String userid = request.getParameter("userid");
		String userpw = request.getParameter("userpw");
		
		ModelAndView mv = new ModelAndView();		
		//mv.addObject(attributeName, attributeValue)
		//mv.addObject(attributeValue)
		
		if(userid != null && userpw != null && 
		   userid.trim().length() > 0 && userpw.trim().length() > 0	) {
			mv.addObject("userid", userid);
			mv.addObject("message", "Spring MVC : loging success");
			
			mv.setViewName("ok");  
			// ok.jsp
		} else {
			mv.addObject("message", "loging fail");
			mv.setViewName("error/errorAuthentication"); 
			// error/errorAuthentication.jsp
		}
		
		return mv;
	}
	
	@RequestMapping(value="/postMethod.do", method=RequestMethod.POST)
	protected String postMethod(@ModelAttribute("my") User user) {		
		return "postView";  // postView.jsp
	}
	
	/*
	 * protected String postMethod(@ModelAttribute("my") User user) {
	 * 
	 * 		// @ModelAttribute("my") User user
	 * 		: 요청시 전달 받은 정보를 User객체에 담은 후 my에 set한다.
	 * 
	 * 		String id = request.getParameter("id");
	 * 		String name = request.getParameter("name");
	 * 		int age = Integer.parseInt(request.getParameter("age"));
	 * 		
	 * 		User user = new User(id, name, age);
	 * 
	 * 		request.setAttribute("my", user);
	 * }
	 * 
	 */
	
//	@RequestMapping(value="/getMethod.do", method=RequestMethod.GET)
//	protected String getMethod(@RequestParam("id") String id) {
//		System.out.println("id�� " + id);
//		return "getView";	// getView.jsp
//	}	

	@RequestMapping(value="/getMethod.do", method=RequestMethod.GET)
	protected ModelAndView getMethod(@RequestParam("id") String id) {
		ModelAndView mv = new ModelAndView();			
		mv.setViewName("getView");  // getView.jsp
		mv.addObject("id", id);	
		mv.addObject("message", "�����������ӿ�ũ ��� �ű��ϴ�..");
		return mv;
	}
	
	/*
	 * protected ModelAndView getMethod(@RequestParam("id") String id) {
	 * 		@RequestParam("id") String id
	 * 		: 요청 전달 parameter "id" 설정
	 * 
	 * 		String id = request.getParameter("id");
	 * }
	 */
}






















