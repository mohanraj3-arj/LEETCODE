class Solution {
    public boolean checkInclusion(String s1, String s2) {
int n = s1.length();
int m = s2.length();

int[] need = new int[26];
int[] window = new int[26];
if(n > m) return false;

for(int i = 0; i < n; i++){
    need[s1.charAt(i) - 'a']++;
    window[s2.charAt(i) - 'a']++;

}
if(Arrays.equals(need, window)) return true;

for(int i = n; i < m; i++){
    window[s2.charAt(i) - 'a']++;
    window[s2.charAt(i - n) - 'a']--;
    if(Arrays.equals(need, window)) return true;
}


return false;
       
        
        
    }
}