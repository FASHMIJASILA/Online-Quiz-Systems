package daoimpl;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuizValidationImpl {
	
	public static boolean isValidUsername(String name)
    {
    	String regex = "^(.+)@(.+)$";
    	Pattern p=Pattern.compile(regex);
    	if(name==null){
		return false;
    	}
    	
    	Matcher m=p.matcher(name);
    	return m.matches();
    }
    
    public static boolean isValidPwd(String pwd)
    {
    	String regex="^(?=.*[0-9])"
                + "(?=.[a-z])(?=.[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
    	Pattern p=Pattern.compile(regex);
    	if(pwd==null){
		return false;
    	}
    	
    	Matcher m=p.matcher(pwd);
    	return m.matches();
    }
    
    
    
    
    
	/*public boolean Validator(String passwords){
		final int NUM_UPPER_LETTERS=2;
		final int NUM_LOWER_LETTERS=2;
		final int NUM_DIGITS=1;
		int upperCount=0;
		int lowerCount=0;
		int digitCount=0;
		int letterCount=0;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the username");
		String inp=in.nextLine();
		System.out.println("enter the pasword");
		String input=in.nextLine();
		int inputLen=input.length();
		//inputLen=inp.length();
		
		//Character
		for(int i=0;i<inputLen;i++){
			//char ch1=inp.charAt(i);
			char ch=input.charAt(i);
			if(Character.isUpperCase(ch)){
				upperCount++;
			}
			else if(Character.isLowerCase(ch)){
				lowerCount++;
			}
			else if(Character.isDigit(ch)){
				digitCount++;
			}
				
	}
		if(upperCount>=NUM_UPPER_LETTERS && lowerCount >=NUM_LOWER_LETTERS && digitCount>=NUM_DIGITS)
			System.out.println("valid password");
		else{
			System.out.println("the password did not have enough of the following");
				if(upperCount<NUM_UPPER_LETTERS)
					System.out.println("uppercase letters");
				if(lowerCount<NUM_LOWER_LETTERS)
					System.out.println("lowercase letters");
				if(digitCount<NUM_DIGITS)
					System.out.println("digits");
		
		}
		return false;
	
	



}*/
}
