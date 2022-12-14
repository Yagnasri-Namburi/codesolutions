class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<nums2[j]){
                nums3[k]=nums1[i];
                i++;
                k++;
            }else{
                nums3[k]=nums2[j];
                j++;
                k++;
            }
        }
    while(i<nums1.length){
        nums3[k]=nums1[i];
        i++;
        k++;
    }
    while(j<nums2.length){
        nums3[k]=nums2[j];
        j++;
        k++;
    }
    int mid=nums3.length/2;
    if((nums3.length)%2==0){
      //int mid=nums3.length/2;
      return (nums3[mid]+nums3[mid-1])/2.0;
    }else{
        return nums3[mid];

    }
     

        
    }
}
Console
