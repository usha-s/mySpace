package shopping.model;

public class User {
	
	public String name;
	public long id;
	
	public User(String name, long id){
		this.name = name;
		this.id = id;
				
	}
	public User(){
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	

}
