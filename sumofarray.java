public class sumofarray {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // using for loop
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum = " + sum);

        //using for each loop
        int sum1 = 0;
        for(int x : arr){
            sum1 = sum1 + x;
        }
        System.out.println("Sum = " + sum1);
    }
}
