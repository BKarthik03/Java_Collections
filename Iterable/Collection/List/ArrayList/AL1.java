package Iterable.Collection.List.ArrayList;
import java.util.ArrayList;
class AL1{
    public static void main(String args[]){
        ArrayList<Integer> sample = new ArrayList<>();
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
        System.out.println("Class of al object: "+al.getClass());

        Integer a[] = al.toArray(new Integer[0]);
        for(int i : a){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}