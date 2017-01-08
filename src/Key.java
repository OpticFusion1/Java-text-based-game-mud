import java.util.Random;

/** class Key is a class where Key object and methods are defined
 */

public class Key  implements PlayerItem{

	private String key;


	/**
	* Constructor for key
	* @param key the name of the key
		*/
	public Key(String key) {
		super();
		this.key = key;
	}

	/**
	* The toString method for Key
	* @return the String representation of the key
		*/
	@Override
	public String toString() {
		return "Key [key=" + key + "]";
	}

	/**
	* @return the name of the key
		*/
	public String returnKeyName(){
		return this.key;
	}

	/**
	* finds out if key is a key. 
	* @return true, since all Key object is a key
		*/
    public boolean isKey(){
    	return true;
    }





public static void main(String [] args) {
}

@Override
public String returnName() {
	// TODO Auto-generated method stub
	return null;
}
}
