package com.lap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller {
@RequestMapping("/")
public String home()
{
	return "Home";
}
@RequestMapping("/login")
public String login()
{
	return "login";
}
@RequestMapping("/signup")
public String signup()
{
	return "signup";
}
}

