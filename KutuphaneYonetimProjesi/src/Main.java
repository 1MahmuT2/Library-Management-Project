import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kütüphane kütüphane1 = new Kütüphane(null, null);


        System.out.println("********************************");
        System.out.println("KÜTÜPHANE SİSTEMİNE HOŞGELDİNİZ");
        System.out.println("********************************");


        while(true){
            String islemLer= "Kitap Ekleme: '1'\n"
                    +"Kitap Arama: '2'\n"
                    +"Kitap Ödünç Verme: '3'\n"
                    +"Geçikme Ücreti Hesaplama: '4'\n"
                    +"Uygulamadan Çıkmak için: '5'";

            System.out.println(islemLer);
            System.out.println("-------------------------------------------");
            System.out.print("Yapmak istediğiniz İşlemi tuşlayın: ");
            String tuslama= scanner.nextLine();
            System.out.println("-------------------------------------------");







            if(tuslama.equals("1")){
                kütüphane1.kitapEkle(islemLer, tuslama);
                System.out.println("-----------------------------------------------");

            }else if( tuslama.equals("2")){
                kütüphane1.kitapArama();
                System.out.println("-------------------------------------------");


            }else if(tuslama.equals("3")){
                kütüphane1.kitapÖdüncVerme(true);
                System.out.println("-------------------------------------------");


            }else if(tuslama.equals("4")){
                kütüphane1.gecikmeÜcretiHesaplama();
                System.out.println("-------------------------------------------");
            }else if(tuslama.equals("5")){
                System.out.println("Sistemden Çıkılıyor...");
                System.out.println("Çıkış Başarılı.");
                System.out.println("-------------------------------------------");
                break;
            }else{
                System.out.println("Geçersiz Karakter");
                System.out.println("Sistemden çıkılıyor...");
                System.out.println("-------------------------------------------");

                break;
            }


        }
    }



}
