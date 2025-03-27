/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Convert;

/**
 *
 * @author User
 */
import java.util.*;
public class StrCompare {
    public static void main(String[] args){
        String s1, s2;
        System.out.println("enter two linesod text");
        Scanner kb= new Scanner(System.in);
        s1=kb.nextLine();
        s2=kb.nextLine();
        if(s1.equals(s2))
            System.out.println("the line is are equal!");
        else
            System.out.println("lines are not qual!");
        if(s1.equalsIgnoreCase(s2))
            System.out.println("lines are equal(longing case)!");
        else
            System.out.println("lines arenot equal!");
        
    }
}
