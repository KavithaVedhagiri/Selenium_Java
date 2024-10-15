package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		int number = 10;
		boolean flag = true;
		for(int i =2;i<number;i++) {
			if(number%i==0) {
				flag = false;
			}
		}
		   if(flag==true){
				System.out.println("The Number is Prime");
			}
		   else {
			   System.out.println("The Number is not a Prime");
		}

	}

}
