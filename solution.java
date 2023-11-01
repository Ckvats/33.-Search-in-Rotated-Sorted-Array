class Solution {
    public int search(int[] nums, int target) {
      if(nums.length==1 )
      {
        if(nums[0]!=target){
            return -1;
        }
        return 0;
      }
      int n =0;
      int m =nums.length-1;
      while(n<=m)
      {
          int mid = (n+m)/2;
          if(nums[mid]==target)
          {
              return mid;
          }
          if(nums[n]<=nums[mid])
          {
              if(nums[n]<=target && nums[mid]>target)
              {
                if(nums[n]==target)
                {
                    return n;
                }
                m = mid-1;
              }
              else{
                   n = mid+1;
              }
             
          }
          else if(nums[n]>nums[mid] && nums[m]>=nums[mid])
          {
            if(nums[mid]<target && nums[m]>=target)
            {
              if(nums[m]==target)
              {
                return m;
              }
              n = mid+1;
            }
            else{
              m = mid-1;
            }
          }
         
      }
      return -1;
    }
}
