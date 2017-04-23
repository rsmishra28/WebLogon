package com.gss.controller;


import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gss.model.Users;
//http://www.beingjavaguys.com/2014/08/spring-security-with-hibernate.html
@Controller
public class LoginController {

/*	@RequestMapping(value = { "/", "/home" })
	 public String getUserDefault() {
	  return "home";
	 }*/

	/* @RequestMapping("/login")
	 public ModelAndView getLoginForm(@ModelAttribute Users users,
	   @RequestParam(value = "error", required = false) String error,
	   @RequestParam(value = "logout", required = false) String logout) {

	  String message = "";
	  if (error != null) {
	   message = "Incorrect username or password !";
	  } else if (logout != null) {
	   message = "Logout successful !";
	  }
	  return new ModelAndView("login", "message", message);
	 }
*/
	
	@RequestMapping(value = { "/", "/home" })
	 public String getUserDefault() {
	  return "home";
	 }

	 @RequestMapping("/login")
	 public ModelAndView getLoginForm(@ModelAttribute Users users,
	   @RequestParam(value = "error", required = false) String error,
	   @RequestParam(value = "logout", required = false) String logout) {

	  String message = "";
	  if (error != null) {
	   message = "Incorrect username or password !";
	  } else if (logout != null) {
	   message = "Logout successful !";
	  }
	  return new ModelAndView("login", "message", message);
	 }
	 
	 
	 @RequestMapping("/admin")
	 public String getAdminProfile() {
		 System.out.println("Admin");
	  return "admin";
	 }

	 @RequestMapping("/user")
	 public String getUserProfile() {
		 System.out.println("User");
	  return "Welcome";
	 }

	 @RequestMapping("/403")
	 public ModelAndView getAccessDenied() {
		 System.out.println("Hi Acess Denied");
	  Authentication auth = SecurityContextHolder.getContext()
	    .getAuthentication();
	  String username = "";
	  if (!(auth instanceof AnonymousAuthenticationToken)) {
	   UserDetails userDetail = (UserDetails) auth.getPrincipal();
	   username = userDetail.getUsername();
	  }

	  return new ModelAndView("403", "username", username);
	 }

	
/*	@RequestMapping(value = { "/user", "/home" }, method = RequestMethod.GET)
	public String homePage(ModelMap model) {
		System.out.println("home");
		model.addAttribute("user", getPrincipal());
		return "Welcome";
	}

	 @RequestMapping("/admin**")
	 public String getAdminProfile() {
		 System.out.println("/admin");
	  return "admin";
	 }*/
	 
	/*@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String adminPage(ModelMap model) {
		System.out.println("adminPage");
		model.addAttribute("user", getPrincipal());
		return "admin";
	}*/
	
	/*@RequestMapping(value = "/Access_Denied", method = RequestMethod.GET)
	public String accessDeniedPage(ModelMap model) {
		System.out.println("Access Denied");
		model.addAttribute("user", getPrincipal());
		return "accessDenied";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		System.out.println("/login");
		return "login";
	}

	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
		System.out.println("logout");
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null){    
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:/login?logout";
	}

	private String getPrincipal(){
		System.out.println("getPrincipal");
		String userName = null;
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			userName = ((UserDetails)principal).getUsername();
		} else {
			userName = principal.toString();
		}
		return userName;
	}

*/

}
