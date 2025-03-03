public class ClimbStairs {
	
    public static void main(String[] args) {
		System.out.println(climbStairs(1)); 
        System.out.println(climbStairs(2)); 
        System.out.println(climbStairs(3)); 
        System.out.println(climbStairs(5));  
    }
	
	public static int climbStairs(int n) { //n = number of stairs
        int first = 1, second = 2;
		int	result = 0;
		
		if (n == 1){
			return 1;
		}	
        if (n == 2){
			return 2;
		}
		
        for (int i = 3; i <= n; i++) {
		//	System.out.println(climbStairs(5)); 
            result = first + second;
            first = second;
            second = result;
        }
        
        return result;
    }


}
