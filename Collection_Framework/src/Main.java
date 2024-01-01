// Collection Framework :

// Collection and Collections in Java :-
/*
Collection :-
Collection is a interface present in java.util.package.
It is used to represent a group of individual objects as a single unit. It is similar to the container in the C++ language.
 The collection is considered as the root interface of the collection framework.
 It provides several classes and interfaces to represent a group of individual objects as a single unit.

The List, Set, and Queue are the main sub-interfaces of the collection interface.
The map interface is also part of the java collection framework, but it doesn’t inherit the collection of the interface.
 The add(), remove(), clear(), size(), and contains() are the important methods of the Collection interface.

Collections :-
Collections is a utility class present in java.util.package.
It defines several utility methods like sorting and searching which is used to operate on collection.
It has all static methods. These methods provide much-needed convenience to developers,
allowing them to effectively work with Collection Framework.
For example, It has a method sort() to sort the collection elements according to default sorting order,
 and it has a method min(), and max() to find the minimum and maximum value respectively in the collection elements.

 */

import java.util.*;

import static java.util.Collections.sort;

public class Main {
    public static void main(String[] args) {
        // Collection Framework :-
        // Collection :-
        // 1) List :-
        // --> In List we can add duplicate data...
        // (i) ArrayList :-
        // --> it is non-synchronized that's why it is faster than vector
        ArrayList<Integer> arrlist = new ArrayList<>();
        // to insert an element
        arrlist.add(45);
        arrlist.add(49);
        arrlist.add(56);
        arrlist.add(45);
        // to insert an element at a specific index(position)
        arrlist.add(1, 12);
        sort(arrlist); // collections
        // to remove an element from a specific index(position)
        arrlist.remove(2);
        // to print all elements of the array
        System.out.println("ArrayList : " + arrlist);
        // to print a specific element
        System.out.println("Element at index 2 : " + arrlist.get(2));

        // Iterable :- to print the list // instead of this we can use enhanced for loop
        Iterator<Integer> it = arrlist.iterator();
        while(it.hasNext()) System.out.println("ArrayList using iterator : " + it.next());

        System.out.println("----------------------------------");

        // (ii) LinkedList :-
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(45);
        ll.add(32);
        ll.add(21);
        ll.add(2,63);
        sort(ll);
        ll.remove(2);
        System.out.println("Linked List : " + ll);
        System.out.println("Index of 32 : " + ll.indexOf(32));
        System.out.println("Element at index 2 : " + ll.get(2));

        System.out.println("----------------------------------");

        // (iii) Vector :-
        // --> it is synchronized that's why it is slower than arraylist
        Vector<String> v = new Vector<>();
        v.add("Ram");
        v.add("Lakshamann");
        v.add("Shyam");
        v.add("Hari");
        v.add(2, "Vishnu");
        sort(v);
        v.remove(0);
        System.out.println("Vector : " + v);

        System.out.println("----------------------------------");

        // (iii) (a) Stack :-
        // stack extends vectors bcoz vector is thread safe and synchronized
        Stack<Integer> s = new Stack<>();
        s.push(32);
        s.push(21);
        s.push(56);
        System.out.println("Stack : " + s);
        s.pop();
        System.out.println("Top of Stack : " + s.peek());

        System.out.println("----------------------------------");

        // 2) Set :-
        // --> it is unordered collection and also does not allow duplicate value
        // --> it only stores unique value
        // (i) HashSet :-
        Set<Integer> set = new HashSet<>();
        set.add(23);
        set.add(21);
        set.add(65);
        set.add(54);
        set.add(21);
        System.out.println("HashSet : " + set);

        System.out.println("----------------------------------");

        // (ii) LinkedHashSet :-
        // in this the order will be maintained
        // but duplicate will be removed
        LinkedHashSet<Integer> llhs = new LinkedHashSet<>();
        llhs.add(34);
        llhs.add(32);
        llhs.add(21);
        llhs.add(32);
        System.out.println("LinkedHashSet : " + llhs);

        System.out.println("----------------------------------");

        // (iii) TreeSet implements SortedSet :-
        // in this the value will be sorted and the duplicate will be removed
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(45);
        ts.add(76);
        ts.add(23);
        ts.add(56);
        ts.add(23);
        System.out.println("TreeSet : " + ts);

        System.out.println("----------------------------------");

        // 3) Queue :-
        // FIFO
        // (i) LinkedList :-
        Queue<Integer> queue = new LinkedList<>();
        // we can either use offer or add, both works same
        // 'offer' return true/false means whether the data added in the queue or not based on that it returns true/false
        // 'add' may throw an exception when using with queue
        // 'poll' return null
        // remove may generate exception
        queue.add(12);
        queue.offer(34);
        queue.offer(32);
        queue.add(87);
        System.out.println("Queue(LinkedList) : " + queue);
        System.out.println("Q remove : " + queue.remove());
        System.out.println("Q poll : " + queue.poll());
        System.out.println("Q peek : " + queue.peek());

        System.out.println("----------------------------------");

        // (ii) ArrayDequeue implements Deque :-
        // offerLast() same as offer()
        // offerFirst() -> to add element in the rear(last) of queue
        // peekFirst() same as peek()
        // peekLast() -> to print the rear(last) value
        // pollFirst() same as poll()
        // pollLAst() -> to remove the rear(last) value
        Deque<Integer> arrDq = new ArrayDeque<>();
        arrDq.offer(34);
        arrDq.offerFirst(56);
        arrDq.offerLast(57);
        System.out.println("ArrayDeque : " + arrDq);
//        System.out.println("Dq poll : " + arrDq.pollFirst());
        System.out.println("Dq peek : " + arrDq.peekFirst());

        System.out.println("----------------------------------");

        // (iii) PriorityQueue :-
        // by default it follows min heap -> minimum value will be at top
        // to generate max heap :-
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(32);
        pq.add(43);
        pq.add(89);
        pq.offer(76);
        System.out.println("PriorityQueue : " + pq);
        System.out.println("Pq peek : " + pq.peek());
        System.out.println("pq poll : " + pq.poll());
        System.out.println("PriorityQueue : " + pq);

        System.out.println("----------------------------------");

        // Map :-
        // (i) HashMap :-
        // -> it is an unordered map
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Second", 20);
        hm.put("First", 5);
        hm.put("Third", 10);
        System.out.println("HashMap : " + hm);
        System.out.println("Value : " + hm.get("Second"));
        System.out.println("Keys : " + hm.keySet());
        System.out.println("Values : " + hm.values());

        System.out.println("----------------------------------");

        // (ii) TreeMap :-
        // -> gives output in sorted order(sorts the data according to key)
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("Second", 20);
        tm.put("First", 5);
        tm.put("Third", 10);
        System.out.println("TreeMap : " + tm);
        System.out.println("Value : " + tm.get("Second"));
        System.out.println("Keys : " + tm.keySet());
        System.out.println("Values : " + tm.values());


    }
}