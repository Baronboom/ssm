package service;

import java.util.List;


import model.Book;
import model.Type;

public interface Book_Service {
	// 查询全部
	public List<Book> select(String where);
	
	// 查询单个book
	public Book selectById(int id);
	
	// 查询Type
	public List<Type> selectType();
	
	// 新增
	public void insert(Book t);
	
	// 修改
	public void update(Book t);
	
	// 删除
	public void delete(int id);
}
