public class Factorial {
    public static void main(String[] args){
      int n = Integer.parseInt(args[0]);
      System.out.println("factorial of " + n + " is " + factorial(n));  
    }
    

    public static int factorial(int n){
        //base case
        if (n == 0){
            return 1;
        }
        else {
            return n * factorial (n-1);
        }
    }
}