class FirstAndLast {
	
	public static void main(String[]args) {
		int arr [] = {5,7,7,8,8,10};
		int target = 8;
		int [] ans = searchRange(arr,target);
		for(int i = 0; i < 2; i++) {
			System.out.print(ans[i] + " ");
		}
		System.out.println();
	}
	
	
    private static int[] searchRange(int[] nums, int target) {
        if(nums.length < 1 || target < nums[0] || target > nums[nums.length - 1]){
            return new int [] {-1,-1};
        }
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        int [] ans = {-1,-1};
        while(low < high){
            mid = low + ((high - low) / 2);
            if(nums[mid] == target){
                ans[0] = findFirst(nums,mid,low);
                ans[1] = findLast(nums,mid,high);
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    private static int findFirst(int [] nums, int mid, int low){
        int first = mid;
        for(int i = mid-1; i >= low; i--){
            if(nums[i] != nums[mid]){
                break;
            }
            if(nums[i] == nums[mid]){
                first = i;
            }
        }
        return first;
    }

    private static int findLast(int [] nums, int mid, int high){
        int last = mid;
        for(int i = mid+1; i <= high; i++){
            if(nums[i] != nums[mid]){
                break;
            }
            if(nums[i] == nums[mid]){
                last = i;
            }
        }
        return last;
    }
}
