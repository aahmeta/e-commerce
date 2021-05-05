package classManagerIntro;

public class CourseManager {
	
	public void addToCard(Course course) {
		System.out.println(course.courseName + " Kursuna kayıt olundu.");
	}
	
	public void detail(Course course) {
		System.out.println("Kurs detayları : " + course.courseDetail);
		
	}
}
