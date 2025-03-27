
public class Odev01 {
    public class Node{
        int sayi;
        Node next;
        Node prev;
    }
    Node bas = null;
    Node son = null;

    public void add(int n){
        Node eleman = new Node();
        eleman.sayi = n;

        if (bas == null){
            bas = eleman;
            son = eleman;
        }
        else{
            son.next = eleman;
            son = eleman;
        }
    }
    public void convert() {

        Node deger1 = bas;
        Node deger2 = null;

        System.out.println("Çift Bağlı Liste:");
        System.out.print("bas <>  ");

        while (deger1 != null) {

            deger1.prev = deger2;
            deger2 = deger1;
            deger1 = deger1.next;

            System.out.print(deger2.sayi + "  <>  ");
        }
        System.out.println("son");
    }

    public void printList(){
        Node temp = bas;

        System.out.println("Tek Bağlı Liste:");
        System.out.print("bas > ");
        while (temp != null){

            System.out.print(temp.sayi +" > ");
            temp = temp.next;
        }
        System.out.println("son");
    }

    public static void main(String[] args){

        Odev01 list = new Odev01();

        list.add(5);
        list.add(7);
        list.add(11);
        list.add(13);

        list.printList();

        list.convert();

    }






















}
