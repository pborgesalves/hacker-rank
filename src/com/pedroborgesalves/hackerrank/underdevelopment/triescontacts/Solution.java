package com.pedroborgesalves.hackerrank.underdevelopment.triescontacts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pedroborgesalves
 */


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<String> contacts = new ArrayList();
        
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            
            if(op.equals("add")){
                contacts.add(contact);
            }else{
                int counter = 0;
                for (String contactOnList : contacts) {
                    if(contactOnList.startsWith(contact)){
                        counter++;
                    }
                }
                System.out.println(counter);
            }
        }
    }
}
