package com.multi.myStagebox;


import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

//테이블 하나당 DAO하나! ==> CUD를 완성!! 
@Component
public class HashtagDAO {

	@Autowired
	SqlSessionTemplate my;

	public int insert(HashtagVO bag) {
		int result = my.insert("concert.create", bag);
		return result;
	}
	
	public int update(HashtagVO bag) {
		int result = my.update("concert.up", bag);
		return result;
	}
	
	public int delete(int no) {
		int result = my.delete("concert.del", no);
		return result;
	}
	
	public HashtagVO one(int no) {
		HashtagVO bag = my.selectOne("concert.one", no);
		return bag;
	}
	
	public List<HashtagVO> list() {
		List<HashtagVO> list = my.selectList("concert.all");
		return list;
	}
}
