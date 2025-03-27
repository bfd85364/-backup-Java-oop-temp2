/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparecontents;

import java.util.*;
class Login{
    String name;
    String id;
    int age;
Login(String name, String id, int age)
    {
        this.name = name;
        this.id =id;
        this.age =age;
    }
    
}
public class CompareContents {

    public static void main(String[] args) {
        Login roland = new Login("roland","9radefixer", 35);
        Login junhyung = new Login("junhyung","limbus",23);
        Login yujin= new Login("yujin","German Shepherd",25);
         System.out.println(roland.equals(roland));
    }
    
}
