package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Type;
import service.TypeService;

@Controller
@RequestMapping("Type")
public class TypeController extends BasicController<Type> {
	@Autowired
	TypeService service;
	
	@Override
	public String index(ModelMap m,HttpServletRequest req) {
		System.out.println("Type_index");
		String txt=req.getParameter("txt");
		String where=""; 
		if(txt!=null&&txt.length()>0) where=" where Type.name like '%"+txt+"%' ";
		m.put("list", service.getWhere(where));
		return "Type/index";
	}
	
}
