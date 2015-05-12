import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MatchingNGrams {
	public int totalMatches(String[] ngrams) {
		int length = ngrams.length;
		String[][] indexed = new String[length][ngrams[0].length()];
		for(int j = 0;j<length;j++){
			String[] temp = new String[ngrams[0].length()];
			for(int i = 0;i<ngrams[j].length();i++){
				String temp2="";
				temp2+= "" +ngrams[j].indexOf(ngrams[j].charAt(i));
				temp[i]=temp2;

			}

			indexed[j]=temp;
		}
		String[] combined = new String[length];
		for(int i =0;i<indexed.length;i++){
			String temp1 = "";
			for(int j = 0;j<indexed[i].length;j++){
				temp1 += indexed[i][j];

			}
			combined[i]=temp1;
		}

		int retval = 0;
		for(int i = 0;i<combined.length;i++){
			for(int j = 0;j<combined.length;j++){
				if(i!=j){
					if(combined[i].equals(combined[j])){
						retval+=1;
					}
				}
			}
		}	 
		return retval/2;
	}


	public static void main(String[] args){
		MatchingNGrams test = new MatchingNGrams();
		System.out.println(test.totalMatches(new String[]{"aab", "abb", "cdd", "ccd"}));
	}
}