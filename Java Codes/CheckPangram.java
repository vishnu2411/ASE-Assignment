
import java.util.*;

public class CheckPangram{
	
	public static boolean isPangram(String str){
	
		if(str == null){
		return false;
		}
		
		Boolean[] Alphabets = new Boolean[26];
		Arrays.fill(Alphabets, false);
		int alphabetIndex = 0;
		str = str.toUpperCase();
		
		for (int i = 0; i < str.length(); i++){
			if('A' <= str.charAt(i) && str.charAt(i) <= 'Z'){
				alphabetIndex = str.charAt(i) - 'A';
				Alphabets[alphabetIndex] = true;
			}
		}
		
		for(boolean idx : Alphabets){
			if(!idx){
				return false;
			}
		}
		
		return true;
		
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check for Pangram or not");
		String inpStr = sc.nextLine();
		if(isPangram(inpStr)){
			System.out.println("The above string is a pangram");
		}
		else{
			System.out.println("The above string is not a pangram");
		}
		
		sc.close();
	}
}
