import java.util.ArrayList;

public class LinkedList {
    ArrayList<Integer> array = new ArrayList<Integer>(20);



    public void addToTail(int data) {
        //your code is here
        array.add(data);
    }
//
    public boolean contains(int value) {
        //your code is here
        int length = array.size();
    for (int x = 0; x < length; x++)
            if (array.get(x) == value){
            return true;
            }
        return false;
    }
//
    public void removeHead() {
        //your code is here
        array.remove(0);
        System.out.println(array);
    }
//
    public void printList() {
        //your code is here
        System.out.println(array);
    }
//
    public int getHead() {
        //your code is here
        return array.get(0);

    }
//
public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.addToTail(5);
    list.addToTail(2);
    list.addToTail(-2);
    System.out.println("Is the head, and it's been removed");
    System.out.println(list.getHead() + " This is the new head");
    list.addToTail(3);
    list.addToTail(1000);
    System.out.println(list.contains(1000));
}

}