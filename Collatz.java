// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		int completions = 0, iterations = 1;
		boolean hasStarted = false;

		for (int startingNumber = 1; startingNumber <= seed; startingNumber++){
			int number = startingNumber;
			hasStarted = false; // check for the first run when number = 1
			iterations = 1;
			
			if(mode.equals("v")){
				System.out.print(startingNumber + " ");
			}

			while (number != 1 || !hasStarted){
				hasStarted = true;
				
				if(number % 2 == 0){
					number /= 2;
				} else {
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

		// Should print only if the completions match the the input
		if(completions == seed){
			String conciseMessaage = String.format("Every one of the first %d hailstone sequences reached 1.", completions); 
			System.out.println(conciseMessaage);
		}

	}
}
