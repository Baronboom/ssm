package service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Book_Dao;
import model.Book;
import model.Type;
import service.Book_Service;

@Service
public class Book_Service_Impl implements Book_Service{
	
	@Autowired
	Book_Dao dao;

	public List<Book> select(String where) {
		return dao.select(where);
	}

	public Book selectById(int id) {
		return dao.selectById(id);
	}

	public List<Type> selectType() {
		return dao.selectType();
	}

	public void insert(Book t) {
		dao.insert(t);
	}

	public void update(Book t) {
		dao.update(t);
	}

	public void delete(int id) {
		dao.delete(id);
	}



	
}
