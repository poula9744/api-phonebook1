package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PhonebookVo;

@Repository
public class PhonebookDao {

	@Autowired
	private SqlSession sqlSession;
	
	public List<PhonebookVo> phonebookList(){
		System.out.println("PhonebookDao.phonebookList()");
		
		List<PhonebookVo> phonebookList = sqlSession.selectList("phonebook.list");
		System.out.println(phonebookList);
		return phonebookList;
	}
}
