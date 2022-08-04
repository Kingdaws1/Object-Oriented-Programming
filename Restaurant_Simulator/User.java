
public class User {

	String name = "";
	
	public User() {
		this.name = "";
	}
	
	public User(String newName) {
		this.name = newName;
	}
	
	public String getName() {
		return(this.name);
	}
	
	public void setName(String newName) {
		this.name = newName;
	}

}
