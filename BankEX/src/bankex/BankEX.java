/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankex;
class Bank{
    public double amt,rate;
    public void Showbalance(){
        double newamt=amt+(rate/100.0)*amt;
        System.out.println("With Interst:" +newamt);
    }
}
public class BankEX {

    public static void main(String[] args) {
        Bank b=new Bank();
        b.amt=100.00;
        b.rate=5;
        double newamt=800.00;
        b.Showbalance();
        System.out.println("i wnat the new amuont is:"+newamt);
    }
    
}
