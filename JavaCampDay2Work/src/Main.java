
public class Main {

	public static void main(String[] args) {
		Course course1=new Course(1,"Java & React","Engin Demiro�");
		Course course2=new Course(2,"C# & Angular","Engin Demiro� ");
		Course course3=new Course(3,"SQL","Engin Demiro�");
		
		Course[] courses= {course1,course2,course3};
		
		for(Course course:courses) {
			System.out.println(course.courseName);
		};
		
		Teacher teacher1 = new Teacher(1,"Emre Ayd�n");
		Teacher teacher2 = new Teacher(1,"Yunus Ayd�n");
		Teacher teacher3 = new Teacher(1,"Ahmet Ayd�n");
		
		Teacher[] teachers= {teacher1,teacher2,teacher3};
		
		for(Teacher teacher:teachers) {
			System.out.println(teacher.TeacherName);
		};
		
		CourseManager courseManager= new CourseManager();
		courseManager.addToCourse(course1);
		courseManager.deleteToCourse(course2);
		

}
	}
