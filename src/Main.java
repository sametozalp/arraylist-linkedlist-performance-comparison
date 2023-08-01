import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        zamanHesapla("LinkedList", linkedList); // (92ms) bu duruma göre arraylist linkedlistten daha
        zamanHesapla("ArrayList", arrayList); // (53ms) performanslıdır ekleme açısndan

        zamanHesapla2("LinkedList", linkedList); // (5 ms) burda ise 0ıncı indexe eklenme durumu linked
        zamanHesapla2("ArrayList", arrayList); // (10428ms) listte daha performanslıdır
    }

    public static void zamanHesapla(String veriTipi, List list) {
        long baslangic;
        long bitis;

        baslangic = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        bitis = System.currentTimeMillis();
        System.out.println(veriTipi + " ekleme süresi " + (bitis - baslangic) + " ms");
    }

    public static void zamanHesapla2(String veriTipi, List list) {
        long baslangic;
        long bitis;

        baslangic = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            list.add(0, i);
        }
        bitis = System.currentTimeMillis();
        System.out.println(veriTipi + " ekleme süresi " + (bitis - baslangic) + " ms");
    }
}
