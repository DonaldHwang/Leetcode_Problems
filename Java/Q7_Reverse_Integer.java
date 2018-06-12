class Solution {
    public static int reverse(int x) {
		String s = String.valueOf(x);
		StringBuilder s1 = new StringBuilder();
		int a = s.length();
		if(s.charAt(0) == '-') {
			s1.append('-');
		}
        for(int i = 0, j = a; i  a; i++,j--) {
        	if(s.charAt(j - 1) == '-') {
        		break;
        	}
        	s1.append(s.charAt(j - 1));
        }
        String s2 = s1.toString();
        long temp = Long.parseLong(s2);
        if(temp  Integer.MAX_VALUE temp  Integer.MIN_VALUE) {
        	return 0;
        }
        
        int number = Integer.parseInt(s2);
        
        return number;
	}
}