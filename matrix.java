public class matrix {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},
                       {4,5,6},
                        {7,8,9}};
//access using for loop
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //access using for each loop
        for(int x[] : arr){
            for(int y : x){
                System.out.print(y + " ");
            }
            System.out.println();
        }

        // for access one row
        for(int j = 0; j<arr[1].length; j++){
                System.out.print(arr[1][j] + " ");
            }
        System.out.println();

        // for access one column
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i][1] + " ");
        }




    }
}
