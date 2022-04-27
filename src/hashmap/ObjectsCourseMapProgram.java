package hashmap;

import java.util.Map;
import java.util.HashMap;


public class ObjectsCourseMapProgram {

	public static void main(String[] args) {
		
		Course course1 = new Course("swd1tf001", "Orientation to Software Engineering", "5cr");
		Course course2 = new Course("swd4tf033", "Programming 2", "5cr");
		Course course3 = new Course("swd4tf032", "Programming 1", "5cr");
		
		Map<String, Course> courseMap = new HashMap<String, Course>();
		
		courseMap.put(course1.getCourseCode(), course1);
		courseMap.put(course2.getCourseCode(), course2);
		courseMap.put(course3.getCourseCode(), course3);
		
		for (Course course : courseMap.values()) {
			 
			System.out.println(course);
			
		}
		
		System.out.println("---");
		
		System.out.println(courseMap.get("swd4tf033"));
		
	}

}
