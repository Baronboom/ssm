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
	
	// ��ѯȫ��
	public List<Type> select() {
		return dao.select();
	}

	// ��ѯһ��
	public Type selectById(int id) {
		return dao.selectById(id);
	}
	
	// ����
	public void insert(Type t) {
		dao.insert(t);
	}

	// �޸�
	public void update(Type t) {
		dao.update(t);
		
	}

	// ɾ��
	public void delete(int id) {
		dao.delete(id);
	}


}
