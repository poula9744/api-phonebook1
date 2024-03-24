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
	
	//리스트
	public List<PhonebookVo> exePhoneList(){
		System.out.println("PhonebookService.exePhoneList()");
		List<PhonebookVo> phonebookList = phonebookDao.phonebookList();
		return phonebookList;
	}
	
	//등록 
	public int exeAddPhone(PhonebookVo phonebookVo) {
		System.out.println("PhonebookService.exeAddPhone()");
		int count = phonebookDao.addPhone(phonebookVo);
		return count;
	}
	
	//삭제
	public int exeDeletePhone(PhonebookVo phonebookVo) {
		System.out.println("PhonebookService.exeDeletePhone()");
		int count = phonebookDao.deletePhone(phonebookVo); 
		return count;
	}
	
	//데이터 한 개 가져오기 
	public PhonebookVo exeModifyForm(int personId) {
		System.out.println("PhonebookService.exeModifyPhone()");
		PhonebookVo phonebookVo = phonebookDao.selectOne(personId); 
		return phonebookVo;
	}
	
	//수정
	public int exeModifyPhone(PhonebookVo phonebookVo) {
		System.out.println("PhonebookService.exeModifyPhone()");
		int count = phonebookDao.modifyPhone(phonebookVo); 
		return count;
	}
}
