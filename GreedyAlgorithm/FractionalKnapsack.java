package GreedyAlgorithm;
import java.util.*;
public class FractionalKnapsack {
    

    public static void main(String[] args) {
        int val[]={60,100,120};
        int weight[]={10,20,30};
        int w=50;

        double ratio[][]=new double[val.length][2];
        //0th col=> idx; 1th col=> ratio 

        for(int i=0;i<val.length;i++)
        {
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];

        }
        //ascending ordder
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));

        int capacity=w;
        int finalVal=0;
        for(int i=ratio.length-1;i>=0;i--){//to get descending order therefore i starts=ratio.length-1
            int idx=(int)ratio[i][0];
            if(capacity>=weight[idx]){ //include fullItem
                finalVal +=val[idx];
                capacity = capacity -weight[idx];
            }else{
                //include fractional item
                finalVal+=(ratio[i][1]* capacity);
                capacity=0;
                break;

            }

        }
        System.out.println("final value="+ finalVal);
    }
}
