package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Type;
import service.Type_Service;

@Controller
@RequestMapping("Type")
public class TypeController {
	@Autowired
	Type_Service service;

	// 异常处理
	@ExceptionHandler
	public void ex(Exception e) {
		e.printStackTrace();
	}

	@RequestMapping("index")
	public String index(ModelMap m) {
		m.put("list", service.select());
		return "Type/index";
	}

	// 新增1
	@RequestMapping("add")
	public String add(ModelMap m) {
		return "Type/edit";
	}

	// 修改1
	@RequestMapping("edit")
	public String edit(int id, ModelMap m) {
		m.put("info", service.selectById(id));
		return add(m);
	}

	// 新增2
	@RequestMapping("insert")
	public String insert(Type b, ModelMap m) {
		service.insert(b);
		return index(m);
	}

	// 修改2
	@RequestMapping("update")
	public String update(Type b, ModelMap m) {
		service.update(b);
		return index(m);
	}

	// 删除
	@RequestMapping("delete")
	public String delete(int id, ModelMap m) {
		service.delete(id);
		return index(m);
	}
}
