package service;

import java.util.List;


import model.Type;

public interface Type_Service {
	
	// ��ѯȫ��
	public List<Type> select();
	
	// ��ѯһ��
	public Type selectById(int id);
	
	// ����
	public void insert(Type t);
	
	// �޸�
	public void update(Type t);
	
	// ɾ��
	public void delete(int id);
}
