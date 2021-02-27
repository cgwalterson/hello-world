/*****
 Christian Walterson
 ******/
public class GitDemo {
    
    private double previousNumber;
    private int reverseNum;
    
    public GitDemo() {
        previousNumber = 1;
        reverseNum = 0;
    }
    
    /*****
     * This function should add 'num' to 'previousNumber' and return the sum.
    *****/
    public double addNumber(double num) {
        System.out.print("Add num to previousNumber: ");
        return num + previousNumber;
    }
    
    /*****
     * This function should calculate the factorial of 'num' and return the resulting value.
     * i.e. if num = 4,
     *  the function will return the value of (1 * 2 * 3 * 4)
     *****/
    public double findFactorial(double num) {
        if (num == 0){
            return 1.0;
        }
            
        return num * findFactorial(num - 1);
    }
    
    /*****
     * This function should reverse 'num' and return the resulting value.
     * i.e. if num = 1234
     *  the function will return 4321
     *****/
    public int reverseNumber(int num){
        
        while(num != 0){
            int n = num % 10;
            reverseNum = reverseNum * 10 + n;
            num /= 10;
        }
        return reverseNum;
    }
    
}
