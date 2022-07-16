package wix_engineering_interview;

import java.util.ArrayList;
import java.util.List;

/**
 * Question Link : https://leetcode.com/explore/interview/card/wix-engineering/651/arrays-and-strings/4157/
 */

public class unique_morse_code_words {
    class Solution {
        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        public int uniqueMorseRepresentations(String[] words) {
            List unique = new ArrayList<String>();
            for(String s : words){
                String morseCode = transformS(s);
                if(!unique.contains(morseCode)) unique.add(morseCode);
            }
            return unique.size();
        }
        public String transformS(String s){
            String res = "";
            for(int i=0; i<s.length(); ++i){
                int ascii = (int) s.charAt(i);
                ascii-=97;
                res+=codes[ascii];
            }
            return res;
        }
    }
}
