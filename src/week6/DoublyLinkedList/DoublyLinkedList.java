//package week6.DoublyLinkedList;
//
//import java.util.NoSuchElementException;
//
//public class DoublyLinkedList<T> {
//    Node head = null;
//    Node tail = null;
//    private int size;
//
//
//    class Node<T> {
//        T element;
//        Node<T> previous;
//        Node<T> next;
//
//
//        public Node(T element) {
//            this.element = element;
//        }
//    }
//
//    public void addElement(T element){
//
//        Node<T> node =new Node<>(element);
//        if(head==null){
//            head=node;
//            tail=node;
//
//            head.previous=null;
//            tail.next=null;
//        }
//        else {
//            tail.next = node;
//            node.previous = tail;
//            tail = node;
//            tail.next = null;
//        }
//        size++;
//
//    }
//
//    public void addElementAtTheBeginning(T element){
//        Node<T> node = new Node<>(element);
//        node.next=head;
//        head.previous=node;
//        node=head;
//        head.previous=null;
//        head.element=element;
//        size++;
//
//    }
//
//    public void addElementInTheMiddle(T element, int index){
//        Node<T> currentElement =head;
//        for(int i=0; i<size; i++){
//            if(i==index){
//                currentElement
//            }
//            currentElement=currentElement.next;
//
//        }
//
//        node.previous=tail;
//        tail.next=node;
//        node.next=null;
//        node.element=element;
//        size++;
//    }
//
//    public void deleteElement(T element){
//        Node<T> currentNode = head;
//        Node<T> temp;
//
//        for(int i=0; i<size; i++){
//            if(currentNode.element==element){
//                temp=currentNode.previous;
//                 currentNode.previous=currentNode.next;
//                 currentNode.next=temp;
//
//            }
//        }
//        size--;
//
//    }
//
//    public int returnIndex(T element){
//        Node<T> currentElement= head;
//
//        for(int i=0; i<size; i++){
//            if(currentElement.element==element){
//                return i;
//            }else{
//                currentElement=currentElement.next;
//
//            }
//        }
//        throw new NoSuchElementException();
//    }
//
//    @Override
//    public String toString() {
//        return "DoublyLinkedList{" +
//                "head=" + head +
//                ", tail=" + tail +
//                ", size=" + size +
//                '}';
//    }
//
//    public static void main(String[] args) {
//        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();
//        doublyLinkedList.addElement(1);
//        doublyLinkedList.addElement(2);
//        doublyLinkedList.addElement(3);
//        doublyLinkedList.addElement(4);
//        doublyLinkedList.addElement(5);
//        doublyLinkedList.addElement(6);
//        doublyLinkedList.addElement(7);
//
//        System.out.println(doublyLinkedList.returnIndex(7));
//    }
//
//}
