class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr=s.split(" ");
        int l=arr.length;
        int n=arr[l-1].length();
        return n;
    }
}