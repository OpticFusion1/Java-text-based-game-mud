import java.util.ArrayList;
import java.util.List;

/** class Bag is a class where Bag object and methods are defined

 */

public class Bag{
	 List<PlayerItem> itemList;
	 int size;

	 /**
 	 * Constructor for bag class
 		 */
	public Bag(){
		this.itemList = new ArrayList<PlayerItem>();
	}


	/**
	 * Gets the size of the bag.
	 * @return size of the bag.
		 */
	public int returnBagsize(){
		return this.size;
	}

	/**
	 * Adds a object into the bag.
	 * @param object the object to be added
		 */
	public void addObject(Object ob){
		if (this.BagIsFull()){
			System.out.println("The bag is full. You need to drop one item to pick up a new one.");
		}
		else{
			if(ob instanceof Book){
				if(this.size == 9){
					System.out.println("You don't have enough space");
				}
				else{
					itemList.add((PlayerItem) ob);
					size +=2;
				}
			}
			else{
				itemList.add((PlayerItem) ob);
				++size;
			}

		}
	}

	/**
	 * Finds out if bag is empty
	 * @return true if bag size is 0, and by that the bag is empty
		 */
	public boolean isEmpy(){
		return(itemList.size() == 0);
	}

	/**
	 * Gets the bags size
	 * @return the bag size
		 */
	public int bagSize(){
		return(itemList.size());
	}

	/**
	 * Prints out the contains of the bag.
		 */
	public void printBag(){
				System.out.println("\n");
        if(itemList.size() == 0){
        	System.out.println("The list is empty");
        }
        else{

        	for(int i = 0; i < itemList.size(); ++i){
    			System.out.println(i+1 +". " + this.itemList.get(i).returnName());
    		}
        }

	}

	/**
	 * Checks if an object is a key.
	 * @return true if obhect is key, else false.
		 */
	public boolean isKey(){
    	boolean found = false;
    	for(int i = 0; i < itemList.size(); ++i){
    		if(itemList.get(i) instanceof Key){
    			found = true;
    			return found;
    		}
    	}
    	return false;
    }


	/**
	 * Gets an item from an idex.
	 * @param i the idex to get object from
	 * @return the object at given index.
		 */
	public Object returnIndexitem(int i){
			assert(itemList.size() >=i);
			return itemList.get(i);
	}

	/**
	 * Removes a object from bag, and returns it.
	 * @param i the index of the item to be removed.
	 * @return the droped item.
		 */
	public Object dropItem(int i){
		assert(itemList.size() >=i);
		return itemList.remove(i);
}

/**
 * Drops any key from the bag
	 */
public void dropAnyKey(){
	if(this.isKey()) {
		PlayerItem k = null;
		for(int i = 0; i < itemList.size(); ++i){
			if(itemList.get(i) instanceof Key) {
			  k = itemList.get(i);
			}
		}
		this.dropObject(k);
	}
}
	/**
	 * Removes a object from bag.
	 * @param ob the object to be removed.
		 */
	public void dropObject(Object ob){
		assert(itemList.size() >=0);
		itemList.remove(ob);
	    if(ob  instanceof Book){
		 this.size= this.size -2;
		}
	    else{
	    	this.size = this.size -1;
	    }
}

	/**
	 * Checks if the bag is full (i.e size is 10)
	 * @return true if bag is full (size is 10), else false
		 */
	public boolean BagIsFull(){
		if(this.size ==10)
			return true;
		return false;
	}




public static void main(String [] args) {

		Book b = new Book("Data", "James", 2017, 7);
		Book c = new Book("Data", "James", 2017, 7);
		Book d = new Book("Data", "James", 2017, 7);
		Book e = new Book("Data", "James", 2017, 7);
		//Book f = new Book("Data", "James", 2017, 7);
		Key k = new Key("Master");

		Bag ba = new Bag();
		ba.addObject(k);
		ba.addObject(b);
		//ba.addObject(c);
		//ba.addObject(d);
		//ba.addObject(e);
		//ba.addObject(f);
		//ba.printBag();
		//ba.dropItem(0);
		//ba.printBag();
		System.out.println(ba.returnIndexitem(0) instanceof Key);
		System.out.println(ba.returnIndexitem(1) instanceof Key);

	}

}
