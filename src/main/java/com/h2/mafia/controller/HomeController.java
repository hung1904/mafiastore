package com.h2.mafia.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.h2.mafia.response.MafiaStoreResponse;
import com.h2.mafia.service.HomeService;

@RestController
@RequestMapping("home")
@Validated
public class HomeController extends AbstractController {
	private static final Logger LOG = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	HomeService homeService;
	
	@GetMapping("/list")
	public MafiaStoreResponse getAllProduct(Pageable pageable) {
		LOG.info("Start getAllProduct");
		return homeService.getAllProduct(pageable);
	}

}
