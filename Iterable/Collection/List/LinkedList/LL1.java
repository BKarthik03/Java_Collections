package Iterable.Collection.List.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
public class LL1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ArrayList<String> al = new ArrayList<>();
        al.add("chickoo");
        al.add("Mango");
        al.add("Jack");

        //adding elements
        ll.add("apple");
        ll.add("banana");
        ll.add("cherry");

        ll.addFirst("Watermelon");
        System.out.println("Linked List: "+ll);
        ll.set(1,"orange");
        System.out.println("Linked List: "+ll);
        ll.addAll(al);
        System.out.println("Linked List: "+ll);

        LinkedList<String> clonedList = (LinkedList)ll.clone();
        System.out.println("Linked List: "+clonedList);

        //element() to retrieve the first element, returns NOSuchElementException if list is empty
        System.out.println("The First Element: "+ll.element());

        //getting the item at index 2
        System.out.println("Element atr index 2: "+ll.get(2));

        System.out.println("Element 'avacado' added at starting: "+ll.offerFirst("avacado"));
        System.out.println("Element 'strawberry added at the end: "+ll.offerLast("strawberry"));
        System.out.println(ll);

        //peek() first element, if no element present null is returned
        System.out.println("Peeked Element: "+ll.peek());
        clonedList.clear();
        System.out.println("Peeked List: "+clonedList.peek());
        try{
            System.out.println("element() called on empty list: "+clonedList.element());
        }catch(Exception e){
            System.out.println("Error: "+e);
        }

        //poll() and pollFirst() to retrieve and remove the first element
        System.out.println("Poll the list: "+ll.poll());

        //pollLast() to retrieve and remove the last element
        System.out.println("PollLast: "+ll.pollLast());

        //pop() retrieving anf removing the printing the first element
        System.out.println("Pop: "+ll.pop());
        System.out.println("The linked List after peek and poll: "+ll);

        //push() retrieving anf removing the printing the last element
        ll.push("apple");
        System.out.println("Apple pushed into linked list: "+ll);

        //remove()
        System.out.println("remove() without arguments: "+ll.remove());
        System.out.println("remove() with index 2 as argument: "+ll.remove(2));
        System.out.println("remove() with item as argument: "+ll.remove("chickoo"));
        System.out.println("LinkedList after 3 removals: "+ll);

        System.out.println("Printing LinkedList Elements in Reverse Order using descendingIterator(): ");
        Iterator<String> it = ll.descendingIterator();
        while(it.hasNext()){
            System.out.print(it.next()+"\t");
        }

        System.out.println("\nElements in normal order using listIterator(): ");
        it = ll.listIterator();
        while(it.hasNext()){
            System.out.print(it.next()+"\t");
        }

        //toArray()
        String fruits[] = ll.toArray(new String[0]);
        System.out.println("\nfruits are:");
        for(String fruit : fruits){
            System.out.print(fruit+"\t");
        }
        System.out.println("\nSize of the LinkiedList is: "+ll.size());



    }
}
