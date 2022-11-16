import java.util.LinkedList;

public class linkedList {
    /*
    You are given two non-empty linked lists representing two non-negative integers.
    The digits are stored in reverse order, and each of their nodes contains a single digit.
    Add the two numbers and return the sum as a linked list.
    You may assume the two numbers do not contain any leading zero, except the number 0 itself.

    to see question => https://leetcode.com/problems/add-two-numbers/
     */
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        LinkedList<Integer> l3 = new LinkedList<Integer>();

        l1.add(9);
        l1.add(8);
        l1.add(7);

        l2.add(8);
        l2.add(9);
        l2.add(5);

        System.out.println(l1);
        System.out.println(l2);
        int maxlength = findMaxLength(l1,l2);

        if (l1.size()>l2.size()){
            l2 = synchronizeListLengths(l1,l2);

        } else if (l1.size()<l2.size()) {
            l1 = synchronizeListLengths(l1,l2);
        }

        addTwoNumbers(l1, l2, l3, maxlength);

        System.out.println(l3);
    }
    private static LinkedList<Integer> synchronizeListLengths(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> l4 = new LinkedList<Integer>();
        if (l1.size()>=l2.size()){
            while (l1.size()>l4.size()){
                l4 = l2;
                l4.add(0);
            }
        }

        else {
            while (l2.size()>l4.size()){
                l4 = l1;
                l4.add(0);
            }
        }
    return l4;
    }

    private static void addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2, LinkedList<Integer> l3, int maxBoyut) {
        int sagaAktar = 0;
        for (int i = 0; i < maxBoyut; i++) {
            int geciciToplam = 0;
            int ayniIndekseBas = 0;

            geciciToplam = l1.get(i) + l2.get(i) + sagaAktar;
            sagaAktar-=sagaAktar;
            if (geciciToplam>=10){

                sagaAktar = geciciToplam / 10;
                ayniIndekseBas = geciciToplam % 10;
                l3.add(ayniIndekseBas);
            }
            else {
                ayniIndekseBas = geciciToplam;
                l3.add(ayniIndekseBas);
            }

        }
        if (sagaAktar>0){
            l3.add(sagaAktar);
        }
    }

    private static int findMaxLength(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        int maxlength = 0;
        if (l2.size()>l1.size()){
            maxlength =l2.size();
        } else if (l1.size()>l2.size()) {
            maxlength = l1.size();
        }
        else {
            maxlength = l1.size();
        }
    return maxlength;
    }
}
