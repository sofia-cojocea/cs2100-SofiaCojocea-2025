import java.util.Scanner;

public class FindMinMax {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter # of elements: ");
    int n = scanner.nextInt();
    int[] arrayNum = new int[n];

    System.out.println("Enter your numbers");
    for (int i = 0; i < n; i ++){
        arrayNum[i] = scanner.nextInt();
    }

    int min = arrayNum[0];
    int max = arrayNum[0];

    for (int i = 1; i < n; i++){
        if (arrayNum[i] < min){
            min = arrayNum[i];
        }
        if (arrayNum[i] > max){
            max = arrayNum[i];
        }
    }

    System.out.println("Min = " + min);
    System.out.println("Max = " + max);
  }  
}
