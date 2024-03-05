package DSA100;

import java.util.ArrayList;
import java.util.Collections;

public class Heap {
    public static void main(String[] args) {
        // assume that heap is already created
        ArrayList<Integer> heap = new ArrayList<>();
        heap.add(0);
        heap.add(40);
        heap.add(20);
        heap.add(30);
        heap.add(15);
        heap.add(10);
        heap.add(25);
        heap.add(20);
        System.out.println("heap : " + heap);
        deleteElement(heap);
        System.out.println("heap after delete : " + heap);
//        insertElement(heap,heap.size(),50);
//        System.out.println("heap after insert : "+heap);
    }

    static void insertElement(ArrayList<Integer> heap, int n, int value) {
        // left i*2, right i*2+1
        int i = n;
        heap.add(value); // will set at index n
        System.out.println("element added : " + heap);


        while (i > 1) {
            int parentIndex = i / 2;
            if (heap.get(parentIndex) < heap.get(i)) {
                // swap with parent
                Collections.swap(heap, i, parentIndex);
                i = i / 2;
            } else {
                return;
            }
        }
    }


// TODO: Need to solve bug of index out of bound

//    static void deleteElement(ArrayList<Integer> heap){
//        // delete root element
//        int n = heap.size();
//        int i = 1;
//        // remove first elment
//        heap.set(1,-1);
//        while(i < n){
//            int left = i*2;
//            int right = i*2+1;
//            int larger = heap.get(left) > heap.get(right) ? left : right;
//            if(heap.get(i) < heap.get(larger)){
//                Collections.swap(heap,i,larger);
//                i = larger;
//            }else{
//                return;
//            }
//        }
//    }
}
