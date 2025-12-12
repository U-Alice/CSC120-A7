/* This is the House class */

import java.util.ArrayList;
/* The house class */
public class House extends Building implements HouseRequirements{

  /*
   * Class attributes
   */
  private ArrayList<Student> residents; 

  private boolean hasDiningRoom;

  /*
   * accessor
   * return hasDiningRoom
   */
  public boolean hasDiningRoom(){
    return hasDiningRoom;
  }
  /*
   * accessor
   * return nResidents
   */
  public int nResidents(){
    return residents.size();
  }
  
  /*
   * register a student as a resident
   * param s
   */
  @Override
  public void moveIn(Student s) {
    if(residents.contains(s)){
      throw new RuntimeException("Student already registered as a resident!");
    }
    residents.add(s);
  }

  /*
   * removes a student from residents
   * param s
   * return s
   */
  @Override
  public Student moveOut(Student s) {
    if(!residents.contains(s)){
      throw new RuntimeException("Student not registered as a resident!");
    }
    residents.remove(s);
    return s;
  }

  /*
   * checks if a student is a resident
   * param s
   * return boolean
   */
  @Override
  public boolean isResident(Student s) {
    return residents.contains(s);
  }

  /*
   * constructor
   * param name
   * param address
   * param nFloors
   * param hasDiningRoom
   */
  public House(String name, String address, Integer nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    residents = new ArrayList<Student>();
    System.out.println("You have built a house: 🏠");
  }

  public static void main(String[] args) {
    House house = new House("Talbot House", "25 Prospect Street",4, true);
  }
}