public class BizimLL {

    Eleman bas;
    Eleman son;

    public BizimLL() {
        bas = null;
        son = null;
    }

    public boolean DoluMu() {
        if (bas != null) {
            return true;

        } else {
            return false;
        }
    }

    public void basaEkle(int sayi) {
        Eleman yeniEleman = new Eleman(sayi);

        if (DoluMu()) {
            // liste doluysa
            yeniEleman.siradaki = bas;
            bas = yeniEleman;

        } else {
            //  liste bossa
            bas = yeniEleman;
            son = yeniEleman;
        }

    }

    public void sonaEkle(int sayi) {
        Eleman yeniEleman = new Eleman(sayi);

        // liste doluysa
        son.siradaki = yeniEleman;
        son = yeniEleman;


    }


    public void indexeEkle(int sayi, int index) {

    }

    public void listeyiYazdir() {

        Eleman isaretci = bas;
        int elemanSayisi =0;
        while (isaretci != null) {
            System.out.print(isaretci.sayi + " ");
            isaretci = isaretci.siradaki;
            elemanSayisi ++;
        }
        System.out.println();
        System.out.println("Eleman sayisi=" + elemanSayisi);
    }

}











