package daoimpl;

import java.sql.SQLException;
import java.util.Scanner;

import dao.QuizLoginDetailsDao;
import model.Question;
import model.QuizUserDetails;
import repository.QuizLoginDetailsDaoRes;


public class QuizLoginDetailsDaoImpl implements QuizLoginDetailsDao{
	

	QuizLoginDetailsDaoRes quizLoginDetailsDaoRes=null;
	
	public QuizLoginDetailsDaoImpl(){
		
		try {
			quizLoginDetailsDaoRes=new QuizLoginDetailsDaoRes();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean signUp(QuizUserDetails user) {
	
		
		try {
			return quizLoginDetailsDaoRes.signUp(user);
		} catch (SQLException e) {
			System.out.println("problem in sign up"+e.getMessage());
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public String signIn(QuizUserDetails user) {

		try {
			return  quizLoginDetailsDaoRes.signIn(user);
	} catch (SQLException e) {
		
			System.out.println("problem in sign in"+e.getMessage());
			e.printStackTrace();
			return null;

		}
	}

	@Override
	public boolean update(String useranme) {
		// TODO Auto-generated method stub
		
		
		return false;
	}

	@Override
	public boolean delete(String username) {
		// TODO Auto-generated method stub
		
		QuizLoginDetailsDaoRes quizresss;
		try {
			quizresss = new QuizLoginDetailsDaoRes();
			
			return quizresss.delete(username);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("problem deletequestion in"+e.getMessage());
			return false;
		}
		
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
	
*/
}
	