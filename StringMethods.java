public class StringMethods {

		public static void main(String[] args) {
			
		}
		
		
		public static String capitalize(String word) {
			
			return(word.substring(0, 1).toUpperCase() + 
			word.substring(1).toLowerCase());}
		
		
		public static int wheresWaldo(String phrase) {
			
			return(phrase.indexOf("Waldo"));}
		
		
		public static String firstThingsFirst(String a, String b) {
			
			if(a.substring(0,1).toLowerCase().codePointAt(0) < 
			b.substring(0,1).toLowerCase().codePointAt(0)) {
				return(a + " " + b);}
			
			else {return(b + " " + a);}}
		
		
		public static String reverse(String s) {
			
			String result = "";
			
			for(int i = s.length() - 1; i >= 0; i--) {
				result += s.charAt(i);}
			
			return result;}
		
		
		public static void soLong(String a, String b) {
			
			if(a.length() > b.length()) {
				System.out.println(a);}
			
			else if(a.length() < b.length()) {
				System.out.println(b);}
			
			else {System.out.println(a + " " + b);}}
		
		
		public static String afterMath(String phrase) {
			
			if(phrase.contains("math")) {
				return(phrase.substring(phrase.indexOf("math")));}
			
			else {return "dud";}}
		
		
		public static void letterize(String word) {
			
			for(int i = 0; i < word.length(); i++) {
				System.out.println(word.charAt(i));}}
		
		/*
		public static void camelCase(String phrase) {
			
			String firstWord = phrase.substring(0, phrase.indexOf(" ")).toLowerCase();
			
			StringBuffer remainder = null;
			
			remainder.append(phrase.substring(phrase.indexOf(" ") + 1)); 
			
			StringBuffer result = null;
			
			result.append(firstWord);
		
			while(remainder.indexOf(" ") >= 0) {
				
				result = result.append(remainder.delete(remainder.indexOf(" "), remainder.length()));
				
				remainder = remainder.delete(0, remainder.indexOf(" "));}
			
			System.out.println(result);}
			*/
				
			
				
		}
		
		

			
		
		
		
	

