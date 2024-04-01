//https://practice.geeksforgeeks.org/contest/gfg-weekly-coding-contest-148/problems
class Solution {
    public static int minimizeArr(int n, int[] arr) {
        // code here
        int min =Integer.MAX_VALUE;
        int count=0;
        for(int i:arr){
            if(i<min){
                min=i;
            }
        }
        
        for(int i:arr){
            if(i==min) count++;
        }
        
        
       for(int i:arr){
           if(i%min>0){
               return 1;
           }
       }
       
       return (count+1)/2;
    }
}
