package week1.day3;

public class Fibonacci_series {

	public static void main(String[] args) {
		int userInput = 8;
		int seriesNumber = 0;
		int seriesNumber1 = 1;
		
		for(int i=1;i<=userInput;i++) {
			System.out.print(seriesNumber+",");
			int fibanacciSereies = seriesNumber + seriesNumber1;
			seriesNumber = seriesNumber1;
			seriesNumber1 = fibanacciSereies;
//			System.out.println("Fibonacci Series :"+" "+fibanacciSereies);
		}
		
	}

}
