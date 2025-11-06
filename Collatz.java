// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		int completions = 0, iterations = 1;
		boolean hasStarted = false;

		for (int index = 1; index <= seed; index++){
			int number = index;
			hasStarted = false;
			iterations = 1;
			if(mode.equals("v")){
				System.out.print(index + " ");
			}
			while (number != 1 || !hasStarted){
				hasStarted = true;
				if(number % 2 == 0){
					number /= 2;
				}else{
					number = (number * 3) + 1;
				}
				if(mode.equals("v")){
					System.out.print(number + " ");
				}
				iterations++;
			}
			completions++;
			if(mode.equals("v")){
				System.out.print("(" + iterations + ")\n");
			}
		}

		String conciseMessaage = String.format("Every one of the first %d hailstone sequences reached 1.", completions); 
		if(completions == seed){
			System.out.println(conciseMessaage);
		}

	}
}
