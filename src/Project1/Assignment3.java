package Project1;

public class Assignment3 {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        int i =0, j =0;

        for(i=0;i<3;i++){

            for(j=0;j<4;j++){

                if(arr[i][j]%2!=1){

                    System.out.println(("even ")+arr[i][j]);

                }

            }

            System.out.println("\n");

        }



    }
}

