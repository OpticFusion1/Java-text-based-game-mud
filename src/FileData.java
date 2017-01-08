import java.io.IOException;
/* a class FileData  S
 * String name  the fields of the class

 */
public class FileData {
  public static void main(String [] args) throws IOException {

    String file_name = "../Javaparttwo/sr.text";

    try {
      ReadFile file = new ReadFile(file_name);
      String[] LineArray = file.OpenFile();

      int i;
      for ( i=0; i < LineArray.length; i++ ) {
        System.out.println( LineArray[ i ] ) ;
        System.out.println( LineArray.length ) ;

      }
    }

    catch (IOException e) {
      System.out.println (e.getMessage());
    }

  	}
}
