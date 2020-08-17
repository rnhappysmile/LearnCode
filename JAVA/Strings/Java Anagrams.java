// https://www.hackerrank.com/challenges/java-anagrams/problem
// String 타입만 사용해서 문제를 풀어야 했다.
// String보다 StringBuilder를 사용하여 데이터 컨트롤이 편하다.

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        String tempA = a.toUpperCase();
        StringBuilder c= new StringBuilder(b.toUpperCase());
        
        if(a.length() != b.length()){
            return false;
        }

        for(int countA = 0; countA < tempA.length(); countA++){
            for(int countB = 0; countB < c.length(); countB++){
                if(tempA.charAt(countA) == c.charAt(countB)){
                    c.deleteCharAt(countB);
                    if(c.length() == 0){
                        return true;
                    }
                    break;
                }
            }
        }

        return false; 

    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
