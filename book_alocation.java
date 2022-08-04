import javax.lang.model.util.ElementScanner14;

public class book_alocation {
    static boolean isPossible(int arr[],int n,int m,int mid)
    {
        int stduentCount=1;
        int pageSum=0;
        for(int i=0;i<n;i++)
        {
            if (pageSum +arr[i]<=mid)
                pageSum+=arr[i];
            else
            {
                stduentCount++;
                if(stduentCount>m ||   arr[i]>mid )
                {
                    return false;
                }
            
                pageSum=arr[i];

            }

        }
        return true;
    }
    
    static int allocationBooks(int arr[],int n,int m)
    {
        int s=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        int e=sum;
        int ans=-1;
        int mid =s+(e-s)/2;
        while(s<=e)
        {
            if(isPossible(arr,n,m,mid)){
                ans=mid;
                e=mid-1;
            }
            else
            {s=mid+1;
            }
            mid=s+(e-s)/2;
            }
            return ans;
        }

    public static void main(String[] args) {
        int apu[]={ 1 ,2 ,2, 3, 1 };
        System.out.println(allocationBooks(apu,5,3));
        
        
    }

    
}
