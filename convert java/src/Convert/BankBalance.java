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
public class BankBalance {
        public static final double OVERDRAWN_PENALTY=8.00;
        public static final double INTEREST_RATE=0.02;
        public static void main(String[] args){
            double balance;
            System.out.println("Enter your balance:");
            Scanner kb=new Scanner (System.in);
            balance=kb.nextDouble();
            if(balance>=0)
                balance= balance+(INTEREST_RATE* balance)/12;
            else
                balance= balance-OVERDRAWN_PENALTY;
            System.out.println("after adjusting moment");
            System.out.println("whatever, that code is nothing meaning");
            System.out.println("just thake it boss");
                
            
        }
    }
