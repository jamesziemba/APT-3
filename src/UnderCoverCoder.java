import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class UnderCoverCoder {
      public int totalNotes(String[] clips, String[] notes) {
    	 int retval = 0;
    	 Map<Character, Integer> clipMap = new HashMap<Character, Integer> ();
    	 for(String value : clips){for(int i = 0;i<value.length();i++){
    		 if(clipMap.get(Character.toLowerCase(value.charAt(i)))== null){
    			 clipMap.put(Character.toLowerCase(value.charAt(i)),1);}
    		 else{clipMap.put(Character.toLowerCase(value.charAt(i)), clipMap.get(Character.toLowerCase(value.charAt(i)))+1);}
    		clipMap.put(' ', 100); 
    	 }}
    	 
    	 
    	 
    	 
    	 for(String note : notes){
    		 Map<Character, Integer> noteMap = new HashMap<Character, Integer> ();
    		 for(int i = 0;i<note.length();i++){
    			 if(noteMap.get(Character.toLowerCase(note.charAt(i)))== null){
        			 noteMap.put(Character.toLowerCase(note.charAt(i)),1);}
        		 else{noteMap.put(Character.toLowerCase(note.charAt(i)), noteMap.get(Character.toLowerCase(note.charAt(i)))+1);
    		 }}
    			 int counter = 0;
        	 ArrayList<Character> checker = new ArrayList<Character>();
        	 for (Entry<Character, Integer> entry : noteMap.entrySet()) {for (Entry<Character, Integer> entry1 : clipMap.entrySet()) {
        		 if(!checker.contains(entry.getKey())){
        			 if(entry.getKey()==entry1.getKey()){
        			 if(entry.getValue()<=entry1.getValue()){
        				 checker.add(entry.getKey());
        				 counter +=1;
        			 }
        		 }}
        	 }
        	 if(noteMap.size()==counter){retval+=1;}
    	 
		}}
		return retval;

      }
    		  
    	  
      public static void main(String[] args){
         	UnderCoverCoder myTest = new UnderCoverCoder();
         	System.out.println(myTest.totalNotes(new String[]{"Earthquake in San Francisco ", " Burglary at musuem in Sweden ", " Poverty "}, new String[]{"Give me my money back ", " I am the best coder ", " TOPCODER "}));
    	  
      }}
   