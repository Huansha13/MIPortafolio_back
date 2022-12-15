package com.yfhl.miportafolio.control.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.yfhl.miportafolio.control.dao.TestDao;

@Component
public class TestDaoImpl implements TestDao{

	@Override
	public Map<String, Object> testApi() {
		Map<String, Object> response = new HashMap<>();
		response.put("numero", 123);
		response.put("nombre", "Carlos");
		response.put("edad", 22);
		return response;
	}

}
