package concat_ws;

import org.apache.hadoop.hive.ql.exec.UDF;

public class concat_ws extends UDF {
	private String result = new String(); //To store the concatenated string
	public String evaluate(String str1, String[] Chars) {
		if(str1 == null) {
			return null;
		}
	//This will join the array of strings using a delimter passed eg(result = chars[0]+str1+chars[1]+str1..)
  	result = String.join(str1,Chars);	
  	return result;
   }
 }