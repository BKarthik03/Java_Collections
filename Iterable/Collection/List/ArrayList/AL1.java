package Iterable.Collection.List.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
class AL1{
    public static void main(String args[]){
        ArrayList<Integer> sample = new ArrayList<>(20);
        sample.add(1);
        sample.add(2);
        sample.add(3);
        sample.add(4);
        sample.add(5);
        ArrayList<Integer> al = new ArrayList<>();

        //Insertion
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);

        //set method - replaces the element at given index
        al.set(2,900);

        //add method with index - adds the element to the specified index and moves the elements right to it
        al.add(2,300);

        //addAll - appends all the elements of given collection to end of the ArrayList
        al.addAll(sample);

        //addAll with index - inserts all the elements of the specified collection at specified index/position
        al.addAll(0,sample);
       
        System.out.println("Element at index 0: "+ al.get(0));
        System.out.println("last Element: "+al.getLast());
        System.out.println("Class of al object: "+al.getClass()); //prints "class java.util.ArrayList"

        Integer a[] = al.toArray(new Integer[0]);
        for(int i : a){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("Size of the ArrayList: "+al.size());
        System.out.println("is the ArrayList Empty: "+al.isEmpty());
        System.out.printf("al contains 100?: %b, if true what is its index: %d%n",al.contains(100),al.indexOf(100));

        //sort the ArrayList
        Collections.sort(al);
        System.out.println("Sorted in Ascending order:");
        for(Integer i : al){
            System.out.print(i+" ");
        }
        //sort ArrayList in reverse order
        Collections.sort(al,Collections.reverseOrder());
        System.out.println("\nSorted in reverse order:");
        for(Integer i : al){
            System.out.print(i+" ");
        }
        System.out.println();

        //trimtoSize() reduces the internal array capacity of the ArrayList to the the number of elements currently present
        al.trimToSize();


        //gives a iterator object that can be iterated
        System.out.println(al.iterator());
        Iterator<Integer> iterator = al.iterator();
        while(iterator.hasNext()){
            System.out.print((Integer)iterator.next()+"\t");
        }
        System.out.println();

        //cloned ArrayList is not a separate copy of the original one, rather it is a reference to that one, 
        //changes at any of these will affect both (only in case when the objects are mutable like 'StringBuilder', unlike 'Integer', 'String')
        ArrayList<Integer> cloned = (ArrayList<Integer>)al.clone();
        System.out.println("Element at index '0' before changes in cloned: "+cloned.get(0));
        al.set(0,5000);
        System.out.println("Element at index '0' after changes in cloned: "+cloned.get(0));

        //prints the subList fromIndex to toIndex(exclusive)
        ArrayList<Integer> subArray = new ArrayList<>(al.subList(2,8));
        System.out.println(subArray);


        //remove element
        al.remove(al.get(0));

        //remove element at index 0
        al.remove(0);

        //remove first element
        al.removeFirst();

        //remove all elements that are present in specified collection
        al.removeAll(sample);
        System.out.println(al);


        //clear the ArrayList
        al.clear();
        System.out.println("After clearing the al: "+al);


    }
}