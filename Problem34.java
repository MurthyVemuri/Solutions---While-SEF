import java.util.*;

public class DigitFactorials 
{
    
    private ArrayList<Long> factorialList = new ArrayList<Long>();
    
        public static void main(String[] args) {
            DigitFactorials digFact = new DigitFactorials();
            digFact.findCuriousNumbers();
            digFact.printCuriousNumbers();
        }

    
    public void findCuriousNumbers() {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        for(long i = 3; i < input; i++) {
            if(i == findFactorialSums(i)) {
                factorialList.add(i);
            }
        }
    }
    
    public void printCuriousNumbers() {
    
        int tempSum = 0;
        
        for(int i = 0; i < factorialList.size(); i++) {
            tempSum += factorialList.get(i);
        }
        System.out.println("The sum is: " + tempSum);
    }
    
    private long findFactorial(long toFactor) {
        
        long factorial = 1;
        
        for(long i = toFactor; toFactor > 1; toFactor--) {
            factorial *= toFactor;
        }
        return factorial;
    }
    
    private long findFactorialSums(long toSumFactor) {
        char[] factorialCharArray;
        long factorialSum  = 0;
        
        factorialCharArray = Long.toString(toSumFactor).toCharArray();
        
        for(char i : factorialCharArray) {
            factorialSum += findFactorial((i - 48)); 
        }
        
        return factorialSum;
    }
}
