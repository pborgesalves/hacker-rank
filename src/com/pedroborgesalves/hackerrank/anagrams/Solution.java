package com.pedroborgesalves.hackerrank.anagrams;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Solution for https://www.hackerrank.com/challenges/ctci-making-anagrams
 * @author pedroborgesalves
 */


public class Solution {
    
    public static int numberNeeded(String first, String second) {
      
        HashMap<Character, Integer> counter1 = letterCounter(first);
        HashMap<Character, Integer> counter2 = letterCounter(second);
        
        
        return countRemovals(counter1, counter2);
    }
    
    public static HashMap<Character, Integer> letterCounter(String string){
        
        HashMap<Character, Integer> counter = new HashMap<>();
        
        for(int i = 0; i < string.length(); i++){
            Character character = string.charAt(i);
            if(!counter.containsKey(character)){
                counter.put(character, 1);
            }else{
                counter.put(character, counter.get(character) + 1);
            }
        }
        
        return counter;
    }
    
    public static int countRemovals(HashMap<Character, Integer> counter1, 
            HashMap<Character, Integer> counter2){
        
        int result = 0;
        
        for(Character character : counter1.keySet()){
            if(counter2.containsKey(character)){
                result += Math.abs(counter1.get(character) - counter2.get(character));
            }else{
                result += counter1.get(character);
            }
        }
        
        for(Character character : counter2.keySet()){
            if(!counter1.containsKey(character)){
                result += counter2.get(character);
            }
        }
        
        return result;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
    
}
