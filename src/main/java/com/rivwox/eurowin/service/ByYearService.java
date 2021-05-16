package com.rivwox.eurowin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.rivwox.eurowin.repository.ByYearRepositoryImpl;

@Service
public class ByYearService {
	
	@Autowired 
	private ByYearRepositoryImpl byyearrepoimpl;
	
	@Autowired
	ConsUtil consutil;
	
	public JsonNode getWinnerByYear(Long yr) {
		String chain = "YEAR,HOST_CITY,WINNER_COUNTRY,SONG,ARTIST,LANGUAGE,POINTS";
		List<Object[]> listResult = byyearrepoimpl.ListWinnerByYear(yr);
		JsonNode jsonResult = consutil.getJson(listResult, chain); 
		return jsonResult;
	}
	
	
}
