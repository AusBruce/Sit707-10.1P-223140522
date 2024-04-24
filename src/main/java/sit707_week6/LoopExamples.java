package sit707_week6;

public class LoopExamples {

	 /**
     * Sums numbers from 1 up to the given limit.
     * 
     * @param limit the upper bound of the range to sum
     * @return the sum of numbers from 1 to limit
     */
    public static int sumNumbers(int limit) {
        int sum = 0;
        for (int i = 1; i <= limit; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * Counts numbers divisible by divisor within the range 1 to limit.
     * 
     * @param limit the upper limit of the range to check
     * @param divisor the number to divide by
     * @return count of numbers divisible by divisor from 1 to limit
     */
    public static int countDivisibles(int limit, int divisor) {
        int count = 0;
        for (int i = 1; i <= limit; i++) {
            if (i % divisor == 0) {
                count++;
            }
        }
        return count;
    }


	
}
