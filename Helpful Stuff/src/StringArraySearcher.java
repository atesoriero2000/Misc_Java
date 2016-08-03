public class StringArraySearcher {
	
	static String[] StringArray = {"HELLO","TeST","BYE","test"};
	
	public static void main(String[] args){
		
		System.out.println(find("TEST"));
		
	}
	
	
	public static boolean find(String theString){
		boolean Return = false;
		
		for(String aString : StringArray){	
			if(aString.equals(theString)){
				
				Return=true;
				
			}
		}
		return Return;
	}

}
