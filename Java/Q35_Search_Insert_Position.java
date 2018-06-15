package Easy;

public class Q35_Search_Insert_Position {
	public static void main(String[] args) {
		int[] num = {1,3,5,6};
		int j = 8;
		int k = searchInsert(num, j);
		System.out.println(k);
	}
	
    public static int searchInsert(int[] nums, int target) {
        int i;
    	for(i = 0; i < nums.length; i++) {
        	if(target <= nums[i])
        		return i;
        }
    	return nums.length;
    }
}
