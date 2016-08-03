import java.util.regex.*;

public class RegexTutorial {

	public static void main(String[] args) {
		
		String longString = "50 Pembrooke Road Chatham NJ 07928 "
				+ "(973) 908 4419 rubi5cksdu3de7@gmail.com";
		
		String phoneNums = " 1-(973) 908 4419 (973) 917 4253"
				+ " 862 812 5601 201-323-5988";

	/*	
		[0-9]//all numbers 0-9
		[a-zA_Z]//all letters
		[^1-8]//everything except 1-8
		\\s  //a white space
		\\S  //a non white space
		\\d   all digits
		\\D   all non digits
		{1} or {0,29} repeats a certain amount of times
		* repeat any number of times
		? something could be present
		| or
		
		*/
		
		//emails 
		regexChecker("\\S*[@][A-Za-z]*[.][A-Za-z]{2,4}", longString);
		
		//phone numbers 
		regexChecker("(\\d( |-)?)?(\\(?\\d{3}\\)?|\\d{3})( |-)?\\d{3}( |-)?\\d{4}", phoneNums);
	}

	
	
	private static void regexChecker(String theRegex, String str2Check) {
		
		Pattern checkRegex = Pattern.compile(theRegex);
		
		Matcher regexMatcher = checkRegex.matcher(str2Check);
		
		//regexMatcher.find();
		
		while(regexMatcher.find()){
			if(regexMatcher.group().length() != 0){
				System.out.println(regexMatcher.group().trim());
			}
			//System.out.println("Start Index: " + regexMatcher.start());
			//System.out.println("End Index: " + regexMatcher.end());
			//System.out.println();
		}
	}
	
}