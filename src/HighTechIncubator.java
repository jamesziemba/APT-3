import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class HighTechIncubator {
      public String[] shameList(String[] location1, 
                                    String[] location2, 
                                    String[] location3) {
    	  HashSet<String> mySet1 = new HashSet<String>(Arrays.asList(location1));
    	  HashSet<String> mySet2 = new HashSet<String>(Arrays.asList(location2));
    	  HashSet<String> mySet3 = new HashSet<String>(Arrays.asList(location3));
    	  ArrayList<String> cheaters = new ArrayList<String>();
    	  Map<String, Integer> map1 = new HashMap<String, Integer>();
    	  for(String name : mySet1){
    			 if(map1.get(name)== null){
    			  map1.put(name, 0);}
    			 map1.put(name, map1.get(name)+1);
    			 }
    	  for(String name : mySet2){
 			 if(map1.get(name)== null){
 			  map1.put(name, 0);}
 			 map1.put(name, map1.get(name)+1);
 			 }
    	  for(String name : mySet3){
 			 if(map1.get(name)== null){
 			  map1.put(name, 0);}
 			 map1.put(name, map1.get(name)+1);
 			 }
    	  for (Entry<String, Integer> entry : map1.entrySet()) {
    		  if(entry.getValue()>1){cheaters.add(entry.getKey());}
    	  }
    	  String[] retval = new String[cheaters.size()];
    	  retval = cheaters.toArray(retval);
    	  Arrays.sort(retval);
    	  return retval;
    	  
      }
      public static void main(String[] args){
         	HighTechIncubator myTest = new HighTechIncubator();
         	System.out.println(myTest.shameList(new String[]{"JOHN", "JOHN", "FRED", "PEG"},new String[]{"PEG", "GEORGE" },new String[]{"GEORGE", "DAVID" }));}
   }