package service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Type_Dao;
import model.Type;
import service.Type_Service;

@Service
public class Type_Service_Impl implements Type_Service{
	@Autowired
	Type_Dao dao;
	
	// 查询全部
	public List<Type> select() {
		return dao.select();
	}

	// 查询一个
	public Type selectById(int id) {
		return dao.selectById(id);
	}
	
	// 新增
	public void insert(Type t) {
		dao.insert(t);
	}

	// 修改
	public void update(Type t) {
		dao.update(t);
		
	}

	// 删除
	public void delete(int id) {
		dao.delete(id);
	}


}
