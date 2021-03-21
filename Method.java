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
    
 //Perdido's Method
sayNameMethod();
genderMethod();
int year = BirthYear();
System.out.println ("My birthyear: "+year);
System.out.println ("------------------");

// Pena, Jenyvi
sayMyName(" Ma.  Jenyvi M.  Peña");
addressMethod();
int age = returnTwentyone();
System.out.println ("Age: " + age);
//Basic Information
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
static int returnTwentyone (){
return 21;
}
static void sayMyName(String name) {
System.out.println ("My name is: " + name);
} 
static void addressMethod() {
System.out.println ("Address: Tarlac City ") ;
  }

}