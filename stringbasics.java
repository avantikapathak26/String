
import java.util.Arrays;
import java.util.Scanner;

public class string {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		char ch='a';
		//StringBuilder sb=new StringBuilder("madam");
		
		//duplicateschar(str);
	    //anagrams(str1,str2);
		//reverseString(str1);
		//palindrome(sb);
		//removecharacter(str1,'a');
		//countwordsinstring(str1);
		//reversewordsinstring(str1);
		//swapstring(str1,str2);
	}

//	private static void swapstring(String str1, String str2) {
//		str1=str1+str2;
//		str2=str1.substring(0, (str1.length()-str2.length()));
//		str1=str1.substring(str2.length());
//		System.out.println(str1+" "+str2);
//	}

//	private static void reversewordsinstring(String str1) {
//		String rev="";
//		String[] arr=str1.split("\\s+");
//		for(String s:arr) {
//			for(int i=s.length()-1;i>=0;i--) {
//				rev=rev+s.charAt(i);
//				
//			}
//		}
//		System.out.print(" "+rev);
//		
//	}
	

//	private static void countwordsinstring(String str1) {
//      //  String[] s=str1.split("\\s+");
//      // System.out.println(s.length);
//		
//		
//		//********************2 method**********************
	
//		int count=1;
//		for(int i=0;i<str1.length();i++) {
//			if(str1.charAt(i)==' ') {
//				count++;
//			}
//		}
//		System.out.println(count);
//		
//	}

//	private static void removecharacter(String str1, char ch) {
//		String f="";
//		for(int i=0;i<str1.length();i++) {
//			if(str1.charAt(i)!=ch)
//				System.out.print(f+str1.charAt(i));
//		}
//		
//	}
	

//	private static void palindrome(StringBuilder sb) {
//	StringBuilder reverse=sb.reverse();
//		if(reverse.equals(sb)) {
//			System.out.println("palindrome");
//		}
//	}
	
	

//	private static void reverseString(String str1) {
//		String reverse="";
//		for(int i=str1.length()-1 ; i>=0 ;i--)
//		{
//			reverse=reverse+str1.charAt(i);
//		}
//		System.out.print(reverse);
//		
//	}

//	private static void anagrams(String str1, String str2) {
//		char[] ch=str1.toLowerCase().toCharArray();
//		char[] arr=str2.toLowerCase().toCharArray();
//		Arrays.sort(ch);
//		Arrays.sort(arr);
//		if(Arrays.equals(ch, arr))
//			System.out.println("anagram");
//	else
//		System.out.println(" not anagram");
//	}
	
	
		
//		private static void duplicateschar(String str) {
//			int count=0;
//			for(int i=0;i<str.length()-1;i++) {
//				for(int j=i+1;j<str.length();j++) {
//					if(str.charAt(i)==str.charAt(j)) {
//						System.out.println(str.charAt(i));
//				       count++;
//					}
//				}
//			}
//			if(count>0) {
//				System.out.println("yes");
//			   }
//		      }
		
	}

	

