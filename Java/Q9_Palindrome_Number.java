class Solution {
    public boolean isPalindrome(int x) {
		if(x < 0)
			return false;
		int re = 0;
		int x2 = x;
		while(x != 0) {
			re = re *10 + x % 10;
			x /= 10;
		}
		return re == x2;
	}
}