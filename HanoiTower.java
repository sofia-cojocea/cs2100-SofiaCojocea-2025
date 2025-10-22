public class HanoiTower {
    public static void main(String[] args){
        int n = 5;
        HanoiMethod(n, 'A', 'C', 'B');

    }
    //sources: stack overflow and geeks for geeks.org
    public static void HanoiMethod(int n, char source_rod, char destination_rod, char helper_rod){
        //base case
        if (n == 1){
            System.out.println("move disk 1 from rod " + source_rod + " to rod " + destination_rod);
        }
        else {
            HanoiMethod(n - 1, source_rod, helper_rod, destination_rod);
            System.out.println("move disk " + n + " from rod" + source_rod + " to rod " + destination_rod);
            HanoiMethod(n-1, helper_rod, destination_rod, source_rod);

        }

    }
}
