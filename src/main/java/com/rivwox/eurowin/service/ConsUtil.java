package com.rivwox.eurowin.service;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;

public interface ConsUtil {
	JsonNode getJson(List<Object[]> list, String chain);
}
