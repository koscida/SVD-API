package com.koscida.svdapi.svdapi.webservice;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.koscida.svdapi.svdapi.business.cooking.CookingService;

@RestController
@RequestMapping("/api/cooking")
public class CookingController {

	CookingService cookingService;

	public CookingController(CookingService cookingService) {
		this.cookingService = cookingService;
	}

	@GetMapping("")
	public String getCooking() {
		return "";
	}

}
