//https://practice.geeksforgeeks.org/contest/gfg-weekly-coding-contest-148/problems
class Solution {
    
    public static boolean solve(int[] a,int x,int mid){
        int n=a.length;
        int prev=a[0],count=1;
        for(int i=1;i<n;i++){
            if(Math.abs(a[i]-prev)>=mid){
                count++;
                prev=a[i];
            }
        }
        if(count>=x)
         return true;
        return false;
    }
    
    public static int maximizeCost(int n, int[] a, int x) {
        int l=0,r=1000000;
        int ans=0;
        Arrays.sort(a);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(solve(a,x,mid)){
                ans=mid;
                l=mid+1;
            }
            else
             r=mid-1;
        }
        return ans;
    }
}
