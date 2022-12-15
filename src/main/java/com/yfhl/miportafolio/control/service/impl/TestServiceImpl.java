package com.yfhl.miportafolio.control.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yfhl.miportafolio.control.dao.TestDao;
import com.yfhl.miportafolio.control.service.TestService;

@Service
public class TestServiceImpl  implements TestService{
	@Autowired
	private TestDao testDao;

	@Override
	public Map<String, Object> testApi() {
		return testDao.testApi();
	}

}
