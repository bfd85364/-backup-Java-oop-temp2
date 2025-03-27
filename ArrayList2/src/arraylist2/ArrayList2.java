/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist2;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList();
        num.add(23);
        num.add(20);
        num.add(45);
        num.add(15);
        Collections.sort(num);
        for(int i: num){
          System.out.println(i);
        }
    }
    
}
