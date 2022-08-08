
public class User {

	String name = "";
	String type = "";
	String restaurantName = "";
	
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
	
	public String getRestaurantName() {
		return(this.restaurantName = this.name + "'s " + this.type + " Restaurant");
	}
	
	public void setRestaurantType(String newType) {
		this.type = newType;
	}

}
