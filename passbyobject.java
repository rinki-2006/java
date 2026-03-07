public class passbyobject {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
//        System.out.println(arr[0]);  modification is not happened at that time
        show(arr);                    // function call
//        System.out.println(arr[0]);  //modification is happened after function call
    }
    public static void show(int arr[]){
        int sum = 0;
//        arr[0] = 25;
//        for(int x : arr){
//            System.out.print(x + " ");
        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);

    }

}
