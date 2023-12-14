class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int first = getFirst(arr,n,x);
        int last = getLast(arr,n,x);
        list.add(first);
        list.add(last);
        return list;
    }
    
    int getFirst(int[] arr, int n,int x) {
        int low = 0, high = n-1,first = -1;
        while(low<=high) {
            int mid = low+(high-low)/2;
            if(arr[mid] == x) {
                first = mid;
                high = mid - 1;
            }
            else if(arr[mid] > x) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return first;
    }
    
    int getLast(int[] arr, int n ,int x) {
        int low = 0, high = n-1, last = -1;
        while(low<=high) {
            int mid = low+(high-low)/2;
            if(arr[mid] == x) {
                last = mid;
                low = mid + 1;
            }
            else if(arr[mid] > x) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return last;
    }
}