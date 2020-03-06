public class Board {

    public static void main(String[] args) {

        BizimLL list = new BizimLL();

        list.basaEkle(2);
        list.basaEkle(4);
       list.basaEkle(6);
        list.indexeEkle(55, 4);
       list.sonaEkle(8);
       list.basaEkle(11);
list.listeyiYazdir();
        list.indexeEkle(-1,0);
        list.indexeEkle(-4, 33);
        list.indexeEkle(0, 6);
        list.listeyiYazdir();
        System.out.println("HAHAHAHHA");
    }
}
