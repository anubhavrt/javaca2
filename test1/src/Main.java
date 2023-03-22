import java.util.Deque;
import java.util.LinkedList;
import java.util.*/;

public class Main {
    public static void main(String[] args) {

        Deque<String> deque = new LinkedList<>();
        deque.add("ram");
        deque.add("is");
        deque.add("12");
        deque.add("year");
        deque.add("old");
        deque.add("boy");



        System.out.println("mydeque " + deque);

        System.out.println("last elmnt: " + deque.getLast());

        String p=deque.pop();
        System.out.println("Popped element: " + p);
        System.out.println("mydeque: " + deque);
        System.out.println("pushing operation ");
        deque.push("shyam");

        System.out.println("mydeque " + deque);
        //deque.push("12");

        //System.out.println("mydeque " + deque);
        //deque.add("newe1");
        //System.out.println("Deque after new elmnt " + deque);
        System.out.println("offerfirst operation ");
        deque.offerFirst("offerfirst");
        System.out.println("mydeque" + deque);
        deque.addFirst("addfirst");

        System.out.println("Deque after adding addfirst=" + deque);


    }
}