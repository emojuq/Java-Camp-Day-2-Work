
public class Main {

	public static void main(String[] args) {
		Course course1=new Course(1,"Java & React","Engin Demiroğ");
		Course course2=new Course(2,"C# & Angular","Engin Demiroğ ");
		Course course3=new Course(3,"SQL","Engin Demiroğ");
		
		Course[] courses= {course1,course2,course3};
		
		for(Course course:courses) {
			System.out.println(course.courseName);
		};
		
		Teacher teacher1 = new Teacher(1,"Emre Aydın");
		Teacher teacher2 = new Teacher(1,"Yunus Aydın");
		Teacher teacher3 = new Teacher(1,"Ahmet Aydın");
		
		Teacher[] teachers= {teacher1,teacher2,teacher3};
		
		for(Teacher teacher:teachers) {
			System.out.println(teacher.TeacherName);
		};
		
		CourseManager courseManager= new CourseManager();
		courseManager.addToCourse(course1);
		courseManager.deleteToCourse(course2);
		

}
	}
