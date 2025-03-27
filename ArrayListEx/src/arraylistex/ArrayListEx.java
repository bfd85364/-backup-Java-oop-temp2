/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistex;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx{
   public static void main(String[]args){
           ArrayList<String> cars=new ArrayList();
       cars.add("Volovo");
       cars.add("toyota");
       cars.add("mizda");
       cars.add("BMW");
       Iterator<String> it=cars.iterator();
       while(it.hasNext()){
           System.out.println(it.next());
   }
   }
}
