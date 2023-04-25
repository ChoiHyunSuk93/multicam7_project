package com.multi.myStagebox;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller // 스프링에서 제어하는 역할로 등록!
public class HashtagController {

	@Autowired
	HashtagDAO dao;
	// 컨트롤 하는 기능(CRUD)
	// 회원가입, 수정, 탈퇴, 정보검색

	// 클래스 내에서 기능처리 담당
	// 멤버변수 + 멤버메서드(기능처리 담당)
	// 하나의 요청당 하나의 메서드
	// 하나의 버튼호출당 하나의 함수 연결!
	// 요청된 주소가 어떻게 될 때
	// 바로 아래에 있는 메서드가 호출이 될지를
	// 써주어야 한다.
	@RequestMapping("insert")
	public void insert(HashtagVO bag) {
		dao.insert(bag);
	}

	@RequestMapping("update")
	public void update(HashtagVO bag) {
		dao.update(bag);
	}

	@RequestMapping("delete")
	public void delete(int no) {
		dao.delete(no);
	}

	@RequestMapping("one")
	public void one2(int no, Model model) {
		HashtagVO bag = dao.one(no);
		model.addAttribute("bag", bag);
	}
	
	@RequestMapping("list")
	public void list(Model model) {
		List<HashtagVO> list = dao.list();
		model.addAttribute("list", list);
	}

}
