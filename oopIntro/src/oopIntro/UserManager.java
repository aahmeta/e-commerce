package oopIntro;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.id);
	}
	
	public void addMultiple(User[] users) {
		for(User user : users) {
			add(user);
			
		}	
	}
}
