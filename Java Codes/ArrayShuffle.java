import java.io.*;
import java.util.*;
class ArrayShuffle {
    static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
	
    }
	public static void main (String[] args) {
		
		int[] inpArray = {1,2,3,4,5,6,7};
		
		System.out.println("Input Array: ");
		printArray(inpArray);
		
		Random randomNumberGen = new Random();
		
		for(int i = 0; i < inpArray.length; i++){
		    int randIndex = randomNumberGen.nextInt(inpArray.length);
		    int temp = inpArray[randIndex];
			inpArray[randIndex] = inpArray[i];
			inpArray[i] = temp;
		}
		
		System.out.println("\nShuffled Array: ");
		printArray(inpArray);
		
	}
}












