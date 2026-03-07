public class arrays {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        //access an array
        System.out.println(arr[1]);

        //find the length of array
        System.out.println( "Length = " +arr.length);

        //print all the values of an array ist method
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //2nd method(for each loop)
            for(int x : arr){
                System.out.print(x + " ");
            }




    }
}
