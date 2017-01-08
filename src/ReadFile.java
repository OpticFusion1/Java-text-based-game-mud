
/* a class where ReadFile object and method are defined
 * String name  the fields of the class

 */
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadFile {

//The path to the text file
  private String path;

/*Constructor of the class 
 *it take string as argument
 **/
  public ReadFile(String file_path){
    this.path = file_path;
  }

//==============================================

/*Finds out how many lines/ rows there are on the text file 
 * it loop the text file line by line and count the number of line until the end of document
 * @return number of line/row in the text file 
 * */
  int FindNumberOfLines() throws IOException{
    FileReader file = new FileReader(this.path);
    BufferedReader br = new BufferedReader(file);

    String line;
    int numberOfLines = 0;

    while ((line = br.readLine()) != null) {
      numberOfLines ++;
    }
    br.close();
    return numberOfLines;
  }

//=============================================

/*Takes the path to the text file.
 *  Then puts the lines into an array. Every array index = one line
 *  @return textArray 
 *  */
  
  public String[] OpenFile() throws IOException {
    FileReader fr = new FileReader(path);
    BufferedReader textReader = new BufferedReader(fr);

    int numberOfLines = FindNumberOfLines();
    String[]textArray = new String[numberOfLines];

    for (int i = 0; i< numberOfLines; i++) {
      textArray[i] = textReader.readLine();
    }
    textReader.close();
    return textArray;
  }

//====================================

}
