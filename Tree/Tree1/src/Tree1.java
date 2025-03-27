// Java ile tek yönlü bağlı listeyi çift yönlü bağlı listeye dönüştüren ve listeyi yazdıran bir programdır. 

public class Tree1 {
    public class Node {
        int data; // Düğümün içinde bulunan veri.
        Node next; // Düğümde ileri gitmek için.
        Node prev; // Düğümde geri gitmek için.
        public Node(int data){  // Kullanıcı "Node" sınıfını çağırırken veriyi girmek zorunda.
            this.data =data;
            next = null;
            prev = null;
        }
    }
    public static void main(String[] args){

        Tree1 bagliListe = new Tree1();

        bagliListe.ekle(11);
        bagliListe.ekle(22);
        bagliListe.ekle(33);
        bagliListe.ekle(44);
        bagliListe.ekle(55);

        bagliListe.yazdir();  // Tek Yönlü Listeyi Başta Yazdır.
        bagliListe.ciftYonList();  // Cift Yönlü Listeye Dönüştürmeyi Çağır.
        bagliListe.tersYazdir();  // Çift Yönlü Oluşan Listeyi Ters Yazdır.

    }
    Node head = null; // Listenin başında henüz eleman yok
    Node tail = null; // Listenin sonuda da eleman olmadığı için "null".

    public void ekle(int veri) { // Listeye eleman eklemek için metod oluşturduk.

        Node data = new Node(veri); // "data" adında yeni bir eleman oluşturuyoruz.

        if(head == null){  // listede hiç eleman yoksa uygula.
            head = data;   // yeni eleman "head" olarak güncelle.
            tail = data;   // listede tek eleman olduğu için "head" ve "tail" yeni elmandır.
            System.out.println("Liste yapısı oluşturuldu, ilk eleman eklendi!");
        }
        else{   // eğer listede eleman varsa uygula.
            tail.next = data;  // Listenin sonuna "tail" elemanını ekle
            tail = data;  // listenin sonu "tail" artık güncellendi.
            System.out.println("Listeye yeni eleman eklendi!");
        }
    }
    public void ciftYonList(){  // Tek Yönlü Bağlı Listeyi , Çift Yönlü Bağlı Listeye dönüştürmek için bir metod oluşuturduk.

        Node temp1 = head;
        Node temp2 = null;

        System.out.print("null <-> ");
        while (temp1 != null){ // Tek Yönllü Listedeki geri bağları oluşturmak döngü oluşturuyoruz.

            temp1.prev= temp2; // Düğümü bir önceki düğüme bağla.
            temp2 = temp1;
            temp1= temp1.next;

            System.out.print(temp2.data + " <-> ");

        }

        System.out.println("null");
        System.out.println("");
        System.out.println("Tek Yönlü Bağlı Liste, Çift Yönlü Bağlı Listeye Dönüştürüldü!");
        System.out.println("");
        System.out.println(" ---> "+"head.next:"+head.next.data);
        System.out.println(" ---> "+"tail.prev:"+tail.prev.data);
    }

    public void yazdir(){

        Node temp = head;

        System.out.println("");

        while (temp != null){

            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

        System.out.println("");
        System.out.println(" ---> "+"head:"+head.data);
        System.out.println(" ---> "+"tail:"+tail.data);
        System.out.println("");

    }

    public void tersYazdir(){

        Node temp = tail;

        System.out.println("");
        System.out.println("Çift Yönlü Listenin Tersi:");
        System.out.println("");
        System.out.print("null <-> ");

        while (temp != null){

            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
        System.out.println("");

    }
}
