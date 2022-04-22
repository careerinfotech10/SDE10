package com.santosh.interviews.j8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapConversion7to8 {

  public static void main(String[] args) {

    Map<String, List<String>> map=new HashMap<>();
    String key="";
    List<String> values=new ArrayList<>();
new MapConversion7to8().appendMapEntries(map,key,values);
  }

  public void appendMapEntries(Map<String, List<String>> map, String key, List<String> values) {
    for (String value : values) {
      List<String> existingValues = map.get(key);
      if (existingValues == null) {
        existingValues = new ArrayList<String>();
        map.put(key, existingValues);
      } else {
        existingValues.add(value);
      }

    }  }


}
