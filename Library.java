/* This is a stub for the Library class */

import java.util.Hashtable;

public class Library extends Building implements LibraryRequirements {
    /* Class attributes */
    private Hashtable<String, Boolean> collection;
    /*
     * constructor
     * param name
     * param address
     * param nFloors
     */
    public Library(String name, String address, Integer nFloors) {
      super(name, address, nFloors);
      collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }
    
    public static void main(String[] args) {
      Library library = new Library("Neilson Library", "Chapin", 3);
    }
    /*
     * adds a title to the collection
     * param title
     */
    @Override
    public void addTitle(String title) {
      if(collection.get(title) != null){
        throw new RuntimeException("Title already exists, please update!");
      }
      collection.put(title, true);
    }
    /*
     * removes a title from the collection
     * param title
     * return title
     */
    @Override
    public String removeTitle(String title) {
      if(collection.get(title)== null){
        throw new RuntimeException("Title not found in collection!");
      }
      collection.remove(title);
      return title;
    }
    /*
     * checks out a title from the collection
     * param title
     */
    @Override
    public void checkOut(String title) {
      if(!collection.get(title)){
        throw new RuntimeException("Book not available for checkout!");
      }
      collection.put(title, false);
    }

    /*
     * returns a book to the collection
     * param title
     */
    @Override
    public void returnBook(String title) {
      collection.put(title, true);
    }
    /*
     * checks if the collection contains a title
     * param title
     * return boolean
     */
    @Override
    public boolean containsTitle(String title) {
    return collection.containsKey(title);
    }
    /*
     * checks if a title is available
     * param title
     * return boolean
     */
    @Override
    public boolean isAvailable(String title) {
     return collection.get(title);
    }
    /*
     * prints the collaection
     */
    @Override
    public void printCollection() {
      if(collection.size()!=0)
        System.out.println("Collection: " + collection);
      else 
        throw new RuntimeException("Collection is empty!");
    }
  
  }