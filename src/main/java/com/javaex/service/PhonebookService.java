package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.PhonebookDao;
import com.javaex.vo.PhonebookVo;

@Service
public class PhonebookService {

	@Autowired
	private PhonebookDao phonebookDao;
	
	public List<PhonebookVo> exePhoneList(){
		System.out.println("PhonebookService.exePhoneList()");
		List<PhonebookVo> phonebookList = phonebookDao.phonebookList();
		return phonebookList;
	}
}
