package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import model.Type;

@Repository
public interface Type_Dao {
	// 查询全部
	@Select("select * from type")
	public List<Type> select();
	
	// 查询一个
	@Select("select * from type where id=#{id}")
	public Type selectById(int id);
	
	// 新增
	@Insert("insert into type (name) values(#{name})")   // 这里name属性的值从 Type t里通过getName()获取
	public void insert(Type t);
	
	// 修改
	@Update("update type set name=#{name} where id=#{id}")
	public void update(Type t);
	
	// 删除
	@Delete("delete from type where id=#{id} ")
	public void delete(int id);
	
}
