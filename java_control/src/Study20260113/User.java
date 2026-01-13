package Study20260113;

public class User {
	
	private String id;
	private String pasword;
	private String name;
	private String tel;
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", pasword=" + pasword + ", name=" + name + ", tel=" + tel + "]";
	}
	
	public User(String id, String pasword, String name, String tel) {
		super();
		this.id = id;
		this.pasword = pasword;
		this.name = name;
		this.tel = tel;
	}
	
	
	

}
