// package TwoDarrays;

public class DiagonalSum {
    public static void diagonalsum(int matrix[][]){
        //primary diagonal sum
        // int k=0;
        // int primarysum=0;
        // for(int i=0,j=0;k<matrix.length;k++){
        //     primarysum=primarysum +matrix[i][j];
        //     i++;
        //     j++;
        // }
        // System.out.println(primarysum);
        // //secondary diagonal sum
        //  k=0;
        // int secondarysum=0;
        // for(int i=matrix.length-1,j=0;k<matrix.length;k++){
        //     secondarysum=secondarysum +matrix[i][j];
        //     i--;
        //     j++;
        // }
        // System.out.println(secondarysum);
        int sum=0;

        for(int i=0;i<matrix.length;i++){
            //primary diagonal
            sum=sum +matrix[i][i];
            //secondary diagonal
            //i+j =>n-1 for secondary diagonal therefore j=n-1-i
            if(i !=matrix.length-1-i){
                sum=sum+matrix[i][matrix.length-i-1];
            }
        }


    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        diagonalsum(matrix);
    }
}
