
public class stringYak {
	/*Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, 
	but the "a" can be any char. The "yak" strings will not overlap.*/
	public String stringYak(String str) {
  		StringBuilder builder = new StringBuilder();
	    
	    for(int i = 0; i < str.length(); i++) {
		  if(str.length() > (i + 2) && str.charAt(i) == 'y' && str.charAt(i+2) == 'k') {
			  i = i + 2;
		  } else {
			  builder.append(str.charAt(i) + "");
		  }
	    }
	    return builder.toString();
	}
}
