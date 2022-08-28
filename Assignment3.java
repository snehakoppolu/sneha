import java.util.Arrays;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Assignment3 obj= new Assignment3();
		Scanner sc = new Scanner(System.in);
		System.out.println("reverse of a string iNeuron ");
		 String s= sc.nextLine();
		System.out.println(reverse("iNeuron"));
		 
		 System.out.println("===========================================");
		 s= sc.nextLine();
		 System.out.println( "reverse of a string Think Twice :"+reverseSentence("Think Twice"));
		
		 System.out.println("===========================================");
		 s= sc.nextLine();
		 System.out.println("isAnagaram:" + Anagaram("rat", "rat"));
		 
		 
		 System.out.println("=============================================");
		 s= sc.nextLine();
		 System.out.println( " isPangram :"+isPangram("qwertyuiplkjhgfd"));
		
		
		 System.out.println("==============================================");
		 s= sc.nextLine();
		 System.out.println("Vowels and Consonants of a String value :"+ countVC("nellore"));
		
		 System.out.println("===============================================");
		 s= sc.nextLine();
		 System.out.println("sortString" +sortString("koppalasneha"));
		
		
		 
	}
	//reverse a String   iNeuron----norueNi
	static  String  reverse(String s){
		String s1="";
		for(int i=s.length()-1 ;i>=0; i--) {
			  s1=s1+s.charAt(i);	  
		}
		
		return s1;
	}
    
	//Think Twice  ----kniht eciwt
   static  String reverseSentence(String s) {
    	
        String[] splitSentences = s.split(" ");
        String String = "";
        for (int i = 0; i < splitSentences.length; i++) {
            String = String + " " +reverse(splitSentences[i]);
        }
        return String;
    }
    
   // anagaram 
   static boolean Anagaram(String s1, String s2) {
       String st1 = s1.trim().toLowerCase();
       String st2 = s2.trim().toLowerCase();
       char[] st1Array = st1.toCharArray();

       if (st1.length() != st2.length()) {
           return false;
       } else {
           for (int i = 0; i < st1Array.length; i++) {
               if (st2.indexOf(st1Array[i]) < 0) {
                   return false;
               }

           }
       }

       return true;
   }

  //pangram 
   static boolean isPangram(String str) {
       String s = str.trim().toLowerCase();
       char[] string = "abcdefghijklmnopqrstuvwxyz".toCharArray();
       for (int i = 0; i < string.length; i++) {
           if (s.indexOf(string[i]) < 0) {
               return false;
           }
       }
       return true;
   }
   
 //count vow and con
   static void countVC(String s) {
       char[] c = s.toCharArray();
       String string = "aeiouAEIOU";
       int cV = 0;
       int cC = 0;
       for (int i = 0; i < c.length; i++) {
           if (string.indexOf(c[i]) > -1) {
               cV++;
           } else {
               cC++;
           }
       }

       System.out.println("Count of Vowels : " + cV);
       System.out.println("Count of Consonants : " + cC);

   }
   
 //sort a String Alphabetically
   static String sortString(String str) {
       char[] chs = str.toCharArray();       
       Arrays.sort(chs);
       String sorted = "";
       for (int i = 0; i < chs.length; i++) {
           sorted = sorted + chs[i];
       }
       return sorted;
   } 
   
   //repeatedly occurring characters in the given String.


}
