package wix_engineering_interview;

import java.util.ArrayList;
import java.util.List;

/**
 * Question Link : https://leetcode.com/explore/interview/card/wix-engineering/651/arrays-and-strings/4154/
 */


public class unique_email_addresses {
    class Solution {
        public int numUniqueEmails(String[] emails) {
            List uniqueEmails = new ArrayList<String>();
            for(int i=0; i< emails.length;++i){
                String[] parts = emails[i].split("@", 2);
                String[] parts2 = parts[0].split("\\+", 2);
                String s1 = parts2[0].replace(".", "");
                if(!uniqueEmails.contains(s1))  uniqueEmails.add(s1);
            }
            return uniqueEmails.size();
        }
    }
}
