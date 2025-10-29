package Iterable.Collection.List.ArrayList;
import java.util.ArrayList;
class AL1{
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<>();

        //Insertion
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);

        al.set(2,900);
        for(int i : al){
            System.out.println(i);
        }
    }
}