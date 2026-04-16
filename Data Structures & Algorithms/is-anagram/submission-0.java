class Solution {
    public boolean isAnagram(String s, String t) {
String s1 = s.toLowerCase();
String t1 = t.toLowerCase();
 int [] a  = new int[26];
 if(s1.length()== t1.length()){
    for(int i = 0;i<s1.length();i++){
        a[s1.charAt(i)-'a']++;
        a[t1.charAt(i)-'a']--;
    }

    for( int  count : a){
        if(count !=0){
            return false;
        }
    }
    return true;
 }else{
    return false;
 }
    }
}
