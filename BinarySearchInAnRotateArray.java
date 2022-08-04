public class BinarySearchInAnRotateArray {
    public static void main(String[] args) {
        int apu[]={ 1,2,7,6,4,8,9};
        System.out.println(Search(apu, 6, 0, apu.length-1));
    }
    static int Search(int[] arr , int target, int s, int e)
    {
        if(s>e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid]>=arr[s]){
            if(target>=arr[s] && target<=arr[mid])
            {
                return Search( arr , target, s,mid-1);
            }
            else{
                return Search( arr , target, mid+1, e);
            }
        }
        if(target>=arr[mid]&& target<=arr[e]){
            return Search( arr , target, mid+1, e);
        }
        return Search( arr , target, s, mid-1);
    }
}
