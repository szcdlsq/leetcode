class Solution {
    public int reverse(int x) {
    		int result2 = 0;
		if(x>0) {
		String xString = String.valueOf(x);
	    char[] array = xString.toCharArray();
	    char[] result = new char[array.length];
	    for(int i = 0; i<array.length;i++) {
	    	result[i] = array[array.length-i-1];
	    }
	    
	    try {
		    result2 =  Integer.parseInt(String.valueOf(result));
	    }
	    catch (Exception e) {
			result2 = 0;
		}
	    
	    	
	    
		}
		else if(x<0){
			String xString = String.valueOf(x).substring(1);
		    char[] array = xString.toCharArray();
		    char[] result = new char[array.length];
		    for(int i = 0; i<array.length;i++) {
		    	result[i] = array[array.length-i-1];
		    }
		    //result2 = -Integer.parseInt(String.valueOf(result));
		    
		    try {
			    result2 =  -Integer.parseInt(String.valueOf(result));
		    }
		    catch (Exception e) {
				result2 = 0;
			}
		}
		return result2;
		
		
		
        
    }
}
