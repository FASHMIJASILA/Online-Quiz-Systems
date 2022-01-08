package dao;

import model.Question;
import model.QuizUserDetails;

public interface QuizLoginDetailsDao {
	
		public boolean signUp(QuizUserDetails user);
		public String signIn(QuizUserDetails user);
		public boolean update(String useranme);
		public boolean delete(String username);
		
		
	

}
