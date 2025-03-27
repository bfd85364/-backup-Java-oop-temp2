/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class StrCompare2 {
    public static void main(String[] args){
    int score;
    char grade;
    System.out.println("enter your score:");
    Scanner kb=new Scanner(System.in);
    score=kb.nextInt();
    if(score>=90)
        grade='A';
    else if(score>=80)
        grade='B';
    else if(score>=70)
        grade='C';
    else
        grade='F';
    System.out.println("Try Hard!");
    System.out.println("Your grade is:"+grade);
    }
    
}
