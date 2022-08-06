public class Main {
    public static void main(String[] args) {

        double [] numbers = {-1.1,2.3,5.1,2.2,-5.1,-1.9,1.2,4.5,-9.9,1.3,-5.5,4.6,9.5,-2.2,-3.3};

        int i = 0;
        double result = i;

        for (double d : numbers) {
                    result += d;
                    if (numbers[i] <0 ) {
                        ;
                    }
                    continue;
                }

                System.out.println("arithmetic average" + result / numbers.length);
            }
}