package com.pedroborgesalves.hackerrank.ransomnote;

/**
 * Solution for https://www.hackerrank.com/challenges/ctci-ransom-note
 * @author pedroborgesalves
 */


import java.util.*;

public class Solution {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public Solution(String magazine, String note) {
        
        magazineMap = buildHashMap(magazine);
        noteMap = buildHashMap(note);
        
    }

    public boolean solve() {
        
        for(String note : noteMap.keySet()){
            Integer count = magazineMap.get(note);
            
            if(count == null){
                return false;
            }else if(count < noteMap.get(note)){
                return false;
            }
        }
        
        return true;
    }
    
    private HashMap<String, Integer> buildHashMap(String phrase){
        
        HashMap<String, Integer> hashmap = new HashMap<>();
        String[] phraseWords = phrase.split(" ");
        
        for(String phraseWord : phraseWords){
            if(!hashmap.keySet().contains(phraseWord)){
                hashmap.put(phraseWord, 1);
            }else{
                hashmap.put(phraseWord, hashmap.get(phraseWord) + 1);
            }
        }
        
        return hashmap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}

