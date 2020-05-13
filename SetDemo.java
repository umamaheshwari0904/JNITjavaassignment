import java.util.*;
class SetDemo{
public static void main(String args[]){
TreeSet<String> hs= new TreeSet<String>();
hs.add("F");
hs.add("A");
hs.add("G");
hs.add("H");
hs.add("M");
hs.add("T");
hs.add("P");
hs.add("S");
hs.add("B");
hs.add("E");
System.out.println(hs);

System.out.println(hs.first());
System.out.println(hs.last());
System.out.println(hs.lower("M"));
System.out.println(hs.floor("A"));
System.out.println(hs.ceiling("M"));
System.out.println(hs.higher("M"));
System.out.println(hs.pollFirst());
System.out.println(hs.pollLast());
}
}