package classManagerIntro;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "courseName1", "description1", "instructorName1");
		Course course2 = new Course(2, "courseName2", "description2", "instructorName2");
		
		Course[] courses = {course1, course2};
		
		for(Course course : courses) {
			System.out.println(course.courseName);
			
		}
		
		Category category1 = new Category(1, "YazýlýmDili1");
		Category category2 = new Category(2, "YazýlýmDili2");
		
		Category[] categories = {category1, category2};
		
		for(Category category : categories) {
			System.out.println(category.categoryName);
			
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.addToCard(course1);
		courseManager.detail(course2);
						
	}
}
