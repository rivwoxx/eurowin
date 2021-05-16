package com.rivwox.eurowin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.rivwox.eurowin.service.ByYearService;

@RestController
@RequestMapping(value = "/EurovisionWinners")
public class ByYearController {
	@Autowired
	ByYearService yearservice;

	@GetMapping(value = "ByYear/{yrr}")
	public ResponseEntity<Object> getWinnerByYear(@PathVariable Long yrr) {
//		Long yrr = Long.parseLong(yr);

		ServiceResponse serviceres = new ServiceResponse();

		JsonNode res = yearservice.getWinnerByYear(yrr);
		if (res == null || res.size() == 0) {
			serviceres.setMesaje("Not data found");
		} else {
			serviceres.setData(res);
			serviceres.setMesaje("OK");
		}
		return new ResponseEntity<>(serviceres, HttpStatus.OK);
	}
}
