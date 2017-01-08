/* Student class has method and constructor  for student object 
 * class have string , finished and unfinished course field
 * */
public class Student extends People{
	public String studentName; // name of student 
	private Course finishedcourse; // name  finished course
	private Course unfinishedcourse; // name of unfinished course

	/* empty student class constructor 
	 * */
	
	public Student(){

	}
	
	/* Student class constructor, which take sting for name name, course for finished and unfinished course
	 * @param name 
	 * @param finished
	 * @param unfinihsed 
	 * */

	 public Student(String name, Course finshed, Course unfinshed){
			this.name =  name;
			this.finishedcourse = finshed;
			this.unfinishedcourse = unfinshed;
		}

	 /* The function check if the course existed in finished course list; 
		 * @param course
		 * @return true or false
		 * */
	public boolean isFinishedcourse(Course course){
		if(course.returnCourseName().equals(this.finishedcourse.returnCourseName())){
			return true; 
		}
		return false; 
	}
	
	/* The function check if the course existed in finished course list; 
	 * @param course
	 * @return true or false
	 * */
	public boolean isunFinishedcourse(Course course){
		if(course.returnCourseName().equals(this.unfinishedcourse.returnCourseName())){
			return true; 
		}
		return false; 
	}
	
	/* The function return name of the student; 
	 * @return studentName; 
	 * */
	
	public String getStudentname(){
		return this.studentName;
	}

	/* The function set name of the student and create finished  and unfinished course object; 
	 * @param name  
	 * */

	public Student(String name){
		this.name =  name;
		this.finishedcourse = new Course();
		this.unfinishedcourse = new Course();
	}
	
	/* The function return the name of finished course book where 
	 * @return  course book name 
	 * */

	public String returnFinishedcourseBook(){
		return this.finishedcourse.returncourseBookName();
	}
	
	/* The function return the name of unfinished course book where 
	 * @return  course book name 
	 * */
	public String unreturnFinishedcourseBook(){
		return this.unfinishedcourse.returncourseBookName();
	}
	
	/* The function return the course where the student completed 
	 * @return  course
	 * */
	public Course returnFinshedcourse(){
		return this.finishedcourse;
	}

	/* The function return the course where the student uncompleted 
	 * @return  course
	 * */
	public Course returnunFinshedcourse(){
		return this.unfinishedcourse;
	}

	/* The function return the book where the student completed 
	 * @return  book
	 * */
	public Book returnFinshedcourseBook(){
		return finishedcourse.returncourseBook();
	}



public static void main(String [] args) {



	}

}
