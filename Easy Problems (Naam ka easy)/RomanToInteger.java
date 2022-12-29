//Q. https://leetcode.com/problems/roman-to-integer

//solution function==>>

class Solution {
public int romanToInt(String s) {
int ans = 0;
for(int i=s.length()-1; i>=0; i--){
char c = s.charAt(i);
switch(c){
case 'I':
ans+= (ans>=5? -1:1);
break;
case 'V':
ans+= 5;
break;
case 'X':
ans+= (ans>=50? -10:10);
break;
case 'L':
ans+= 50;
break;
case 'C':
ans+= (ans>=500? -100:100);
break;
case 'D':
ans+= 500;
break;
case 'M':
ans+= 1000;
break;
}
}
return ans;
}
}
