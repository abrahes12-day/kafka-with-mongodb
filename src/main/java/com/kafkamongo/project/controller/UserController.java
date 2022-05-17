package com.kafkamongo.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class UserController {
    @GetMapping
	public ModelAndView sendLayout() {

		ModelAndView view = new ModelAndView("index");
		return view;
	}
}
