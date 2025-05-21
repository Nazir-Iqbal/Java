class demo
{
    public static void main(String args[]){
        //  1 D arrys
        // first method
        // int arr1[] = {1,2,3,4};

        // second method
        int arr1[] = new int[4];

        for(int i=0;i<arr1.length;i++){
            arr1[i] = (int)(Math.random() * 100);
        }
        System.out.println("1 D array");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

        // 2 D arrays

        int arr2[][] = new int[3][4];

        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                arr2[i][j] = (int)(Math.random()*100);
            }
        }

        // enhanced loop
        System.out.println("2 D array");
        for(int arr[] : arr2){
            for(int ele : arr){
                System.out.print(ele+" ");
            }
            System.out.println();
        }

        // 2 d jagged array
        int arrj[][] = new int[3][];
        arrj[0] = new int[3];
        arrj[1] = new int[5];
        arrj[2] = new int[2];

        for(int i=0;i<arrj.length;i++){
            for(int j=0;j<arrj[i].length;j++){
                arrj[i][j] = (int)(Math.random()*100);
            }
        }

        System.out.println("2 D jagged array");
        for(int arr[] : arrj){
            for(int ele : arr){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        
    }
}