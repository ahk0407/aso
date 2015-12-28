package com.test.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.Dao.testDao;

@Service
public class testServicempl implements testService{
	
	@Autowired
	private testDao TestDao;
	
	@Override
	public String getName(String id){
		return TestDao.getName(id);
	}

}
