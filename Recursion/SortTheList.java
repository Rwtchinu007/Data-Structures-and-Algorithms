
// import java.util.ArrayList;

// public class SortTheList {
//     public static void placeAtRight(int a,ArrayList<Integer> arr){
//         if(arr.isEmpty()||arr.get(arr.size()-1)<=a){
//              arr.add(a);
//              return;
//         }
//         int x = arr.remove(arr.size()-1);
//         placeAtRight(a, arr);
//         arr.add(x);

//     }

//     public static void sort(ArrayList<Integer> arr) {
//         if (arr.isEmpty()) {
//            return;
//         }
//         int a = arr.remove(arr.size() - 1);
//         sort(arr);
//         placeAtRight(a,arr);

//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(13);
//         list.add(1);
//         list.add(2);
//         list.add(10);
//         list.add(54);
//         list.add(43);
//         list.add(23);
//         sort(list);
//        System.out.println(list);
//     }
// }

import java.util.Stack;

public class SortTheList {

    public static void placeAtRight(int a, Stack<Integer> arr) {
        if (arr.isEmpty() || arr.peek() <= a) {
            arr.push(a);
            return;
        }
        int x = arr.pop();
        placeAtRight(a, arr);
        arr.push(x);
    }

    public static void sort(Stack<Integer> arr) {
        if (arr.isEmpty()) {
            return;
        }
        int a = arr.pop();
        sort(arr);
        placeAtRight(a, arr);
    }

    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        list.push(13);
        list.push(1);
        list.push(2);
        list.push(10);
        list.push(54);
        list.push(43);
        list.push(23);

        sort(list);
        System.out.println(list);
    }
}