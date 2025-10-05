package javaCodings;

import java.util.HashSet;

public class Remove_Duplicates_in_String {

	public static void main(String[] args) {
    String str="Programming";
    String result="";
   HashSet<Character> set=new HashSet<>();
  
  for(int i=0; i<str.length(); i++) {
		  char ch=str.charAt(i);
		  if(!set.contains(ch)) {
			  set.add(ch);
			  result+=ch;
		  }
	}
	System.out.println(result);
	}
}
