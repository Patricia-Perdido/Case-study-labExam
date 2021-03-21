/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

/**
 *
 * @author Patricia
 */
public class Method{ 
    public static void main (String[] args) {
    
 
sayNameMethod();
genderMethod();
int year = BirthYear();
System.out.println ("My birthyear: "+year);
System.out.println ("------------------");


}
    static int BirthYear(){
    return 2001;
} 
  public static void sayNameMethod(){
      System.out.println("Name: Patricia Anne Perdido");
  }
  public static void genderMethod(){
      System.out.println("Gender: Female");
  }

}