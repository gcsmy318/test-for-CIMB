public class CompareVersion {
       public static void main(String[] args) {
        System.out.println(compareVersion("1.01", "1.001"));
        System.out.println(compareVersion("1.0", "1.0.0"));
        System.out.println(compareVersion("0.1", "1.1"));
    }
	
	public static int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

		//System.out.println("v1="+v1[1]);
		//System.out.println("v2="+v2[1]);
		
        int maxLen = Math.max(v1.length, v2.length); //find highest length
		//System.out.println("maxLen" + maxLen);
        for (int i = 0; i < maxLen; i++) { 
            
			int num1, num2;

			if (i < v1.length) {
				num1 = Integer.parseInt(v1[i]);
			} else {
				num1 = 0;
			}

			if (i < v2.length) {
				num2 = Integer.parseInt(v2[i]);
			} else {
				num2 = 0;
			}
           
			
            if (num1 < num2){ 
				return -1; 
			}
			
            if (num1 > num2){
				return 1; 
			}
        }
        
        return 0;
    }

 
}
