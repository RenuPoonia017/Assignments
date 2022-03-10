package assignment.ques1;
import java.util.*;
public class LinkedListClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<String> ll=new LinkedList<>();
		for(int i=0;i<10;i++) {
			String s=sc.next();
			ll.add(s);
		}
		System.out.println("Elements in LinkedList-- "+ll);
		System.out.println("--List iteration using iterator--");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
			}
		System.out.println("");
		System.out.println("--List iteration using ListIterator--");
		ListIterator<String> namesIterator = ll.listIterator();
        while (namesIterator.hasNext()) {
             System.out.print(namesIterator.next()+" ");
        }
        System.out.println("");
        System.out.println("--List iteration using Enhanced loop--");
        for(String s:ll) {
        	System.out.print(s+" ");
        }
        
        
  
	}

}
