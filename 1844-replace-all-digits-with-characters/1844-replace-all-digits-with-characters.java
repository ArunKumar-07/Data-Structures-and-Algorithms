class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=1;i<s.length();i+=2){
            int add = s.charAt(i)-'0'+s.charAt(i-1);
            sb.setCharAt(i,(char)add);
        }
        return sb.toString();
    }
}