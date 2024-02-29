package GreedyAlgorithm;
import java.util.*;
public class ActivtySelection {

    public static void main(String[] args) {  //O(n)
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};

        //sorting
        //TC =nlogn
        int activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }

        //lambda function -> shortform of a function
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));//column no. 2 ke basis par sorting krni hai ,,end time ke basis

        //end time basis sorted
        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();
        //activity 1
        maxAct=1;
        ans.add(0); //max.activities ans.add(activities[0][0])
        int lastEnd=end[0]; //;lastEnd=activities[0][2];
        for(int i=1;i<end.length;i++){
            if(start[i]>=lastEnd){  //if(activities[i][1]>=lastEnd)
                //activity select
                maxAct++;
                ans.add(i);  //ans.add(activities[i][0]);
                lastEnd=end[i]; //lastEnd=activities[i][2];

            }

        }
        System.out.println("max activities = "+maxAct);
        for(int i=0;i<ans.size();i++)
        {
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
