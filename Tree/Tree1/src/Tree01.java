
public class Tree01 {
    public class Node{
        int sayi;
        Node next;
        Node prev;
    }
    Node bas = null;
    Node son = null;

    public void add(int n){  
        Node eleman = new Node();  // Yeni düğüm oluştur
        eleman.sayi = n;

        if (bas == null){  // Liste boşsa
            bas = eleman;
            son = eleman;
        }
        else{  // Liste boş değilse
            son.next = eleman;  // Mevcut son düğümün next'ini güncelle
            son = eleman;  // Yeni düğümü son olarak ata
        }
    }
    public void convert() {  // Tek bağlı listeyi çift bağlı listeye çevirir ve ekrana yazdırır.

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

    public void printList(){ // Tek bağlı listeyi ekrana yazdırır.
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

        Tree01 list = new Tree01();

        list.add(5);
        list.add(7);
        list.add(11);
        list.add(13);

        list.printList(); // Tek bağlı listeyi yazdır

        list.convert(); // Çift bağlı listeyi yazdır

    }






















}
