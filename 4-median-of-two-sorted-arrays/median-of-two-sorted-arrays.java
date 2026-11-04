class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
    int c[]=new int[m+n];
     for(int i=0;i<m;i++){
        c[i]=nums1[i];
     }   
     for(int i=0;i<n;i++){
        c[m+i]=nums2[i];
     }
     java.util.Arrays.sort(c);
     if(c.length%2==0){
        int a=c.length/2;
        double b=((c[a]+c[a-1])/2.0);
        return b;
     }
      else{
      double d=c[c.length/2];
        return d;
      }
    }
}