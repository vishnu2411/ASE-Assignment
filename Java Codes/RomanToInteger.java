import java.util.*;

class RomanToInteger {
	public static int convert(String romanNumber){
		Map<Character,Integer> romanMap = new HashMap<>();
		romanMap.put('I',1);
		romanMap.put('V',5);
		romanMap.put('X',10);
		romanMap.put('L',50);
		romanMap.put('C',100);
		romanMap.put('D',500);
		romanMap.put('M',1000);
		
		int integerNumber = 0;
		
		for(int i = 0; i < romanNumber.length(); i++){
			char currentChar = romanNumber.charAt(i);
			
			if(i > 0 && romanMap.get(currentChar) > romanMap.get(romanNumber.charAt(i-1))){
			integerNumber += romanMap.get(currentChar) - 2*romanMap.get(romanNumber.charAt(i-1));
			
		}
		
		else{
			integerNumber += romanMap.get(currentChar);
		}
		
	}
	return integerNumber;
}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a roman number");
		String romanNumber = sc.nextLine();
		System.out.println("Equivalent integer for the above roman number: ");
		romanNumber = romanNumber.toUpperCase();
		System.out.println(convert(romanNumber));
		sc.close();
		
	}
}
