public class binarySearch   
{
    public static void main(String[] args)
    {
        int[] nums={1,8,16,58,100};
        int n=8;
        int ans=binarySearch(nums,n);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr,int n)
    {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;//we can use this formula to nullify java int problem
            //int mid=(low+high)/2;//int has fixed size,might be possible that
            // start+end exceeds the range of number
            if (n>arr[mid])
            {
                 low=mid+1;
            }
            else if(n<arr[mid])
            {
                high=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
