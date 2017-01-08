
/** class Course is a class where Course object and methods are defined

 */
public class Course {
	private String courseName;
	private Book b;
	private int Hp;
	Teacher t;
	private String question;
	private String alternativeOne;
	private String alternativeTwo;
	private String answer;
	public Course (){

	}

	/**
	* Constructor for bag class
	* @param courseName the name of the course to be created
	* @param b the coursebook of the course to be created
	* @param question the question of the course to be created
	* @param alternativeOne one of the wrong answers to the question
	* @param alternativeTwo one of the wrong answers to the question
	* @param answer the right answer to the question

		*/
	public Course(String courseName, Book b, int Hp, String question,String alternativeOne, String alternativeTwo,String answer){
		this.courseName = courseName;
		this.b = b;
		this.Hp = Hp;
		this.question = question;
		this.alternativeOne = alternativeOne;
		this.alternativeTwo = alternativeTwo;
	    this.answer = answer;
	}
	
	/**
	 * get Teacher of the course
	 * @return teacher
		 */
	public Teacher returnTeacher(){
		return this.t;
	}

	/**
	 * Gets the question of the course
	 * @return the question of the course
		 */
	public String returnQuestion(){
		return this.question;
	}

	/**
	 * Gets the answer of question of the course
	 * @return the anser of the course
		 */
	public String returnAnswer(){
		return this.answer;
	}

	/**
	 * @return the first (wrong) alternative of answers to the question.
		 */
	public String returnAlternativeOne(){
		return this.alternativeOne;
	}

	/**
	 * @return the second (wrong) alternative of answers to the question.
		 */
	public String returnAlternativeTwo(){
		return this.alternativeTwo;
	}

	/**
	 * @return the name of the course.
		 */
	public String returnCourseName(){
		return this.courseName;
	}

	/**
	 * @return the book of the course.
		 */
	public Book returncourseBook(){
		return b;
	}

	/**
	 * @return the name of the book of the course.
		 */
	public String returncourseBookName(){
		return b.returnName();
	}

	/**
	 * @return the HP of the course.
		 */
	public int returnHp(){
		return this.Hp;
	}

	/**
	 * Sets the name of the course
	 * @param name the new name of the course.
		 */
	public void setCoursename(String name){
		this.courseName = name;
	}

	/**
	 * Gets the name of the teacher of the course
	 * @return the name of the techer of the course
		 */
	public String returnCourseTeacher(){
		return t.getTeachername();
	}

	/**
	 * Sets the HP of the course
	 * @param Hp the new HP of the course.  
		 */
	public void setHp( int Hp){
		this.Hp = Hp;
	}


	public static void main(String [] args) {



	}

}
