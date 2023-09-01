class Solution {
    public int lengthOfLastWord(String s) {
        String[] stringArray = s.trim().split(" ");
        int count = 0;
        for(String str : stringArray)
            count++;
        return stringArray[count-1].length();    
    }
}