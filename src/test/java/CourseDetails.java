

//class creation
public class CourseDetails {
//method creation
	private void javaCourse() {
		System.out.println("Java Course");
	}
	private void pythonCourse() {
		System.out.println("Python course");
	}
	private void seleniumCourse() {
		System.out.println("Selenium Course");
	}
	private void oracleCourse() {
		System.out.println("Oracle Course");
	}
	private void course1() {
		// TODO Auto-generated method stub
        System.out.println("course");
	}
	private void course2() {
		// TODO Auto-generated method stub
        System.out.println("course2");
	}
	//Main method creation
	public static void main(String[] args) {	
		//object creation
		//classname objectname=new classname();
		CourseDetails c=new CourseDetails();
		//method calling
		//ObjectName.method
		c.javaCourse();
		c.pythonCourse();
		c.seleniumCourse();
		c.oracleCourse();
		c.course1();
		c.course2();
	}
}