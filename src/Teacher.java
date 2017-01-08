/* Teacher class has method and constructor  for Teacher object 
 * class have string and course field
 * */

public class Teacher {
	String name;
	Course course;

	/* constructor  for empty Teacher object 
	 * 
	 * */

	public Teacher (){
		
	}
	/* constructor  for Teacher object 
	 * @param name 
	 * @param course
	 * 
	 * */

	public Teacher (String name, Course course){
		this.name = name;
		this.course = course;
	}
	
	
	/* set teacher name to new name
	 * @param name 
	 * 
	 * */

	public Teacher (String name){
		this.name = name;
	}

	/* return teacher name 
	 * @return nameS
	 * */

	public String getTeachername(){
		return this.name;
	}
	
	/* return the course name where teacher is responsible 
	 * @return courseS
	 * */

	public Course getTeachercourse(){
		return this.course;
	}

	/* assign a course to teacher  
	 * @param course
	 * */
	public void connectCourse(Course course){
		this.course = course;
	}


public static void main(String [] args) {



	}

}
