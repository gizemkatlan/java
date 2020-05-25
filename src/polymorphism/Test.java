package polymorphism;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		Random rnd = new Random();
		Connection con = null;
		
		for(int i=0 ; i<5 ; i++){
			int randomSayi = rnd.nextInt() % 2; 
			
		    if (randomSayi == 0) {
			    con = new OracleConnection();
		   } else {
			    con = new MySqlConnection();
		   }
		    
		   ConnectionUtil.connectionAc(con);
		}
		
	}
}
