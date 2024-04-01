//https://practice.geeksforgeeks.org/contest/gfg-weekly-coding-contest-148/problems
class Solution {
    public static int blackblacktree(int N, int M, int[] par, int[] arr, int[] brr) {
        // code here
        int count=0;
        int[]temp =arr;
        for(int i=0;i<M;i++){
            temp[brr[i]]^=1;
            int j=brr[i];
          while(j != -1 && j < par.length && par[j] != -1){
             temp[par[j]] ^= 1;
                j = par[j];
          }
        }
        
        for(int i:temp){
            if(i==1) count++;
        }
        
        return count;
    }
}
