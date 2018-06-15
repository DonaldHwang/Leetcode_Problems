package Easy;

public class Q70_Climbing_Stairs {
	public static void main(String[] args) {
		int j = 8;
		int k = climbStairs(j);
		System.out.println(k);
	}
	
	public static int climbStairs(int n) {
        if(n <= 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        
        int a = 1;
        int b = 2;
        int all = 0;
        for (int i = 2; i < n; i++) {
        	all = a + b;
        	a = b;
        	b = all;
        }
        return all;
    }
}