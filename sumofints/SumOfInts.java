package sumofints;
public class SumOfInts {
    public static boolean hasSum(int[] numbers, int x){
        for(int i = 0; i < numbers.length; i++){
            for (int j = i + 1; j < numbers.length; j++){
                if (numbers[i] + numbers[j] == x){
                    return true;
                }
            }
        }

            return false;
    }


    

    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 6, 8, 5, 9, 14};
        int target = 17;

        System.out.println(hasSum(nums, target)); 
    } 
}

