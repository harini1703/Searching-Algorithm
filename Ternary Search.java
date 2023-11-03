public class Ternary_search
{
    public static void main(String[] args)
    {
        int[] nums = {12,15,17,19};
        int n = 19;
        int ans = Ternary_search(nums, n,0,nums.length-1);
        System.out.println(ans);
    }
    static int Ternary_search(int num[],int n,int start,int end) {
        //int start = 0;
        //int end = num.length - 1;
        int index = -1;
        while (start <= end)
        {
            int mid1 = start + (end - start) / 3;
            int mid2 = end - (end - start) / 3;
            if (n <= num[mid1])
            {
                if (n == num[mid1])
                {
                    return mid1;
                }
                return Ternary_search(num,n,start,mid1-1);
            }
            else if (n >= num[mid2])
            {
                if (n == num[mid2])
                {
                    return mid2;

                }
                return Ternary_search(num,n,mid2+1,end);
            }
            else
                //start = mid1 + 1;
                //end = mid2 - 1;
               return Ternary_search(num,n,mid1+1,mid2-1);
        }
        return index;
    }
}
