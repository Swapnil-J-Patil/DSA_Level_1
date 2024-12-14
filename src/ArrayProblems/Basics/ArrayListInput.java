package ArrayProblems.Basics;

import java.util.ArrayList;

public class ArrayListInput {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //generics definition: What type of data that can be stored in the list object
        //Wrapper classes: Integer, Double, Float
        //We cannot use primitives to define datatype in Arraylist
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(11);
        list2.add(12);
        System.out.println(list.get(4));
        list.addAll(list2);

        System.out.println(list.contains(15));
        //list.clear();
        list.set(1, 99);
        System.out.println(list);

        list.removeAll(list2);      //pass another list and remove those elements from our og list, it's fine even if all the elements of the other list are not in og list.
        list.addAll(list2);
        System.out.println(list.equals(list2));

        //System.out.println(list.getFirst());    //To get first element of the list
        System.out.println(list);

        System.out.println(list.subList(1, 3));
    }
}
