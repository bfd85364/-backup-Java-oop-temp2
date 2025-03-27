/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conditionalst;

/**
 *
 * @author User
 */
public class Conditionalst {
    public static void main(String[] args) {
      int n1=10, n2=20;
      int max=(n1>n2)?n1:n2; //the n1 is 'true' expreesion of max(n1>n2) conditional, n2 is 'false' expression of the conditonal//
      System.out.println("the result is: " +max);
      
      int hours=1;
      System.out.println("You worked "+hours+" "+((hours>1)?"hours":"hour")); /// if you enter the '2' at 'int hours=' then this print 'hours'
     }
    
}
