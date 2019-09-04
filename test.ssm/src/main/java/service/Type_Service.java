package service;

import java.util.List;


import model.Type;

public interface Type_Service {
	
	// 查询全部
	public List<Type> select();
	
	// 查询一个
	public Type selectById(int id);
	
	// 新增
	public void insert(Type t);
	
	// 修改
	public void update(Type t);
	
	// 删除
	public void delete(int id);
}
