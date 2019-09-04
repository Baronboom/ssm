package controller;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import model.Book;
import service.Book_Service;

@Controller
@RequestMapping("Book")
public class BookController {

	@Autowired
	Book_Service service;
	// �쳣����
	@ExceptionHandler
	public void ex(Exception e) {
		e.printStackTrace();
	}
	
	// ajax�ļ��ϴ�
    @RequestMapping("sss")
	public @ResponseBody String aaa(@RequestParam("file") CommonsMultipartFile file,HttpServletRequest req )throws Exception {
		String oname=file.getOriginalFilename();
		String ex=oname.substring(oname.lastIndexOf("."),oname.length());
		String nname = UUID.randomUUID()+ex;
		
		String path=req.getSession().getServletContext().getRealPath("/");
		path=new File(path).getParentFile().getPath()+"/upload";
		System.out.println(path);
		file.transferTo(new File(path,nname));
    	return "/upload/" + nname;
	}
	
	// ��ѯ
	@RequestMapping("index")
	public String index(ModelMap m,String txt) {
		String where = "";
		if(txt !=null){
			where = "where book.name like '%"+txt+"%'";
		}
		m.put("list", service.select(where));
		return "Book/index";
	}
	
	// ����1
	@RequestMapping("add")
	public String add(ModelMap m) {
		m.put("sublist", service.selectType());
		return "Book/edit";
	}
	
	// �޸�1
	@RequestMapping("edit")
	public String edit(int id, ModelMap m) {
		m.put("info", service.selectById(id));
		return add(m);
	}
	
	// ����2
	@RequestMapping("insert")
	public String insert(Book b, ModelMap m) {  // Book b �Զ����յ�name�������档
		service.insert(b);
		return index(m,null);
	}
	
	// �޸�2
	@RequestMapping("update")
	public String update(Book b, ModelMap m) {
		service.update(b);
		return index(m,null);
	}
	
	// ɾ��
	@RequestMapping("delete")
	public String delete(int id, ModelMap m) {
		service.delete(id);
		return index(m,null);
	}
}
