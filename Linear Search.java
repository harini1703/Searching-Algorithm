public class linearSearchIndex
{
    public static void main(String[] args)
    {
              int[] nums={1,5,6,8,9,19,25};
              int n=19;
              int ans=linearSearch(nums,n);
              System.out.println(ans);
    }
    //Search in the array,ele found reuturn index if not return null
    static int linearSearch(int[] arr,int n)//Debug it
    {
        if (arr.length == 0)
        {
            return -1;
        }
        for (int i=0;i<arr.length;i++)
        {
            if(n==arr[i])
            {
                return i;
            }


        }
//no ele found
        return -1;
    }

}
