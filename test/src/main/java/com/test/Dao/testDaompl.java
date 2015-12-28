package com.test.Dao;

import org.springframework.stereotype.Repository;

@Repository
public class testDaompl implements testDao{

	@Override
	public String getName(String id) {
		// TODO Auto-generated method stub
		return "Dao pattern";
	}

}
