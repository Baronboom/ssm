package model;

public class Book {
	
	private int id;
	private String name;
	private int sex;
	private int typeid;
	private String typename;
	
	public static String[]sexs= {"����","��","Ů"};
	public String getSexname() {
		return sexs[sex];
	}

	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	
	public Book(String name) {
		super();
		this.name = name;
	}

	public int getTypeid() {
		return typeid;
	}
	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
}
