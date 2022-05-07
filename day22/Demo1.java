import java.util.*;
import java.util.Map.Entry;
class Demo1{
public static void main(String args[]){
TreeMap<Integer,String>map1;
map1=new TreeMap<>();
map1.put(10,"V");
map1.put(11,"A");
map1.put(12,"I");
map1.put(13,"S");
map1.put(14,"H");
map1.put(15,"U");
System.out.println(map1);

//READ ALL THE KEYS:
Set<Integer>keys;
keys=map1.keySet();
System.out.println("keys......");
for(Integer k:keys){
System.out.println(k);
}

// READ ALL THE VALUES:
Collection<String>values;
values=map1.values();
System.out.println("values......");
for(String v:values){
System.out.println(v);
}
//Read all keys and values
System.out.println("items...");

Set<Entry<Integer,String>> items;
items=map1.entrySet();
for(Entry<Integer,String>e1:items){
System.out.println(e1.getKey()+":"+e1.getValue());
}
}
}

