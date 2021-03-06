class Solution {

    /** return a index to the first occurence of target in source
     * or -1 if target is not part of source
     * @param source string to be scanned
     * @param target string containning the sequence of characters to match.
     */
    //DFS
     public int strStr(String source, String target) {
         if (source == null) {
            return -1;
         }

         if (target == null) {
            return -1;
         }
         return helper(source, target, 0, 0);
      }

     private int helper(String source, String target, int startSource, int curr ) {
         if (curr == target.length()) {
            return startSource - target.length();
         }

         for(int i = startSource; i < source.length(); i++) {
             //if curr is greater than 0, then if i not matching, directy exit
             if(source.charAt(i) == target.charAt(curr)) {
                 return helper(source, target, i + 1, curr +1);
             } else {
                 continue;
            }
         }
         return -1;
     }
    
    //O(n) time complexity
    public int strStrOn(String source, String target) {
        if (source == null || target == null) {
            return -1;
        }
        if (target.length() == 0) {
            return 0;
        }

        for (int i = 0; i < source.length() - target.length() + 1; i++) {
            for (int j = 0; j < target.length(); j++) {
                if (source.charAt(i + j) == target.charAt(j)) {
                    if (j == target.length() -1) {
                        return i;
                    }
                    //j++;error uncaught
                } else {
                    break;
                }
            }
        }
        return -1;
     }
}
