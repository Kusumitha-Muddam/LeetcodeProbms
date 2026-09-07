import java.util.Arrays;
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        //  Arrays.sort(nums1, (a, b) -> Integer.compare(a[0], b[0]));
          //Arrays.sort(nums2, (a, b) -> Integer.compare(a[0], b[0]));
          int[][] arr=new int[nums1.length+nums2.length][2];
          int i=0,j=0,k=0;
       while(i<nums1.length && j<nums2.length)
        {
           if(nums1[i][0]==nums2[j][0])
              {
                arr[k][0]=nums1[i][0];
                arr[k][1]=nums1[i][1]+nums2[j][1];
                i++;
                j++;
              }
              else if(nums1[i][0]<nums2[j][0])
              {
                 arr[k][0]=nums1[i][0];
                arr[k][1]=nums1[i][1];
                i++;

              }
              else
              {
                 arr[k][0]=nums2[j][0];
                arr[k][1]=nums2[j][1];
                j++;
              }
              k++;
        }
          while (i < nums1.length) {

            arr[k][0] = nums1[i][0];
            arr[k][1] = nums1[i][1];

            i++;
            k++;
        }
        
        while (j < nums2.length) {

            arr[k][0] = nums2[j][0];
            arr[k][1] = nums2[j][1];

            j++;
            k++;
        }

        int[][] result = new int[k][2];

        for (int x = 0; x < k; x++) {
            result[x][0] = arr[x][0];
            result[x][1] = arr[x][1];
        }

        return result;
    }
}