package service;

import java.util.List;


import model.Book;
import model.Type;

public interface Book_Service {
	// ��ѯȫ��
	public List<Book> select(String where);
	
	// ��ѯ����book
	public Book selectById(int id);
	
	// ��ѯType
	public List<Type> selectType();
	
	// ����
	public void insert(Book t);
	
	// �޸�
	public void update(Book t);
	
	// ɾ��
	public void delete(int id);
}
