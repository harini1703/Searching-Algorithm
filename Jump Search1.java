/* Jump Search

int jumpsearch(int arr[],int n, int key)
{
    int i,start=0;end=sqrt(n)
    while(arr[end]<key && start<n)
       start=end
       end=end+sqrt(n)
       if(end>n)
         end=n
   for(int i=start;i<end;i++)
   {
      if(arr[i]==key)
        return i

    }

 return -1

}

Code:*/

public class Jump_search
{
    public static void main(String[] args)
    {
        int[] arr={2,3,6,7,8,9,10,11};
        int index=jumpSearch(arr,9);
        if(index==-1)
        {
            System.out.println("Element is not found");
        }
        else
        {
            System.out.println("found element at index "+index);
        }
    }
    public static int jumpSearch(int arr[],int target)
    {
        int n=arr.length;
        int bs=(int)Math.sqrt(n);
        int stindx=0;
        int endindx=bs;

        while( endindx<n && arr[endindx]<=target)
        {
            stindx=endindx;
            endindx+=bs; //end=end+sqrt(n)
            if(endindx>n){
                endindx=n;
            }
        }
        //linear search
        int res=-1;
        for(int i =stindx;i<endindx;i++)
        {
            if(target==arr[i])
            {
                res=i;
            }
        }
        return res;
    }
}

/*Jump Search - Sorted order
Similar to linear search ,
 */

