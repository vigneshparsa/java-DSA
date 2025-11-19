package com.vignesh.linkedlists;

public class Main {
    public static void main(String[] args) {
//        LL ll = new LL();
//        ll.insertFirst(3 , null);
//        ll.insertFirst(6 , null);
//        ll.insertFirst(9 , null);
//        ll.insertFirst(8 , null);
//        ll.insertFirst(7 , null);
//        ll.insertFirst(6 , null);
//        ll.display();

//        ll.insertLast(9 , null);
//        ll.insertLast(8 , null);
//        ll.insertLast(7 , null);
//        ll.insertLast(6 , null);
//        ll.insertLast(5 , null);
//        ll.insertLast(4 , null);
//        ll.insertLast(3 , null);
//        ll.display();

//        ll.insert(3 , null , 3);
//        ll.display();
//
//        ll.deleteFirst();
//        ll.display();
//
//
//        ll.deleteLast();
//        ll.display();

//        ll.delete(0);
//        ll.display();

//        System.out.println(ll.find(7));
//        ll.display();


//        DLL dll = new DLL();
//        dll.insertFirst(1);
//        dll.insertFirst(2);
//        dll.insertFirst(3);
//        dll.insertFirst(4);
//        dll.insertFirst(5);
//        dll.display();

//        dll.insertLast(6);
//        dll.insertLast(7);
//        dll.insertLast(8);
//        dll.insertLast(9);
//        dll.insertLast(10);
//        dll.insertLast(100);
//        dll.display();
//        dll.displayBackward();
//
//        dll.find(100);
//        dll.display();

//        for(int i = 0; i < 11; i++) {
//            dll.insertFirst(i);
//            dll.insertLast(i);
//            dll.insert(9, 22);
//        }
//            dll.display();

        CLL obj = new CLL();
        obj.insertFirst(9);
        obj.insertFirst(8);
        obj.insertFirst(7);
        obj.insertFirst(6);
        obj.insertFirst(5);
//        obj.display();

//        for(int i = 1; i < 10; i++){
//            CLL obj2 = new CLL();
//                obj2.insertFirst(11);
//        }

        obj.delete(9);
        obj.display();
    }
}
