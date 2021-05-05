package oopIntro;

public class Main {

	public static void main(String[] args) {
		Instructor name1 = new Instructor();
		name1.id = 1;
		name1.autoBiography = "abcd";
		
		Student name2 = new Student();
		name2.id = 2;
		name2.firstName = "firstName2";
		
		UserManager userManager = new UserManager();
		
		User[] users = {name1, name2};
		
		userManager.addMultiple(users);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.description(name1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.firstName(name2);
		

	}
}
