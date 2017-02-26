import java.util.Scanner;
public class Quiz2Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double rate = 0;
		double rate1 = 0;
		double initialTuition = 0;
		double secondYearTuition = 0;
		double thirdYearTuition = 0;
		double fourthYearTuition = 0;
		double totalTuition = 0;
		
		System.out.println("What is the initial cost of tuition?");
			initialTuition = input.nextDouble();
			
		System.out.println("What is the percentage increase of tuition? Express as an integer.");
			rate = input.nextDouble();
			rate1 = rate / 100;
		
		for (int i = 0;i<=4; i++) {
			secondYearTuition = initialTuition + (initialTuition*rate1);
			thirdYearTuition = secondYearTuition + (secondYearTuition*rate1);
			fourthYearTuition = thirdYearTuition + (thirdYearTuition*rate1);
			
			totalTuition = initialTuition + secondYearTuition + thirdYearTuition + fourthYearTuition;
		 }
		System.out.printf("After four years, the total cost of tuition would be $%.2f", totalTuition);
		input.close();
	}

}
