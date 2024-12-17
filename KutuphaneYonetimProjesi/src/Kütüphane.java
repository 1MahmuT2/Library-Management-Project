import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;



public class Kütüphane extends Kitap{

    private ArrayList<Kitap> kitap2;

    public Kütüphane(String kitapİsmi,String kitapYazari){
        super(kitapİsmi, kitapYazari);
        kitap2 = new ArrayList<>(); //kitap nesnesini oluşturduk...
    }


    @Override
    public void kitapEkle(String kitapİsmi,String kitapYazari) {

        while(true){


            String islemler= "Kitap eklemek için: 1\n"
                    +"Kitap Listesini görmek için: 2\n"
                    +"İşlemden çıkmak için: 3";



            System.out.println(islemler);
            System.out.println("-------------------------------------------");
            System.out.print("Yapmak istediğiniz işlemi tuşlayın: ");
            String islem1= scanner.nextLine();
            System.out.println("-------------------------------------------");


            if(islem1.equals("1")){
                System.out.print("Kitap İsmi: ");
                kitapİsmi =scanner.nextLine();

                System.out.print("Kitabın Yazarı: ");
                kitapYazari = scanner.nextLine();


                Kitap kitap3 = new Kitap(kitapİsmi, kitapYazari);
                kitap2.add(kitap3);

                System.out.println("Kitap eklendi işlem başarılı...");
                System.out.println("-------------------------------------------");


            }else if(islem1.equals("2")){

                System.out.println("Kitap Listesi: ");

                for(Kitap kitap3 :kitap2){
                    System.out.println("KİTAP İSMİ= "+kitap3.getKitapİsmi()+" KİTAP YAZARI=  "+ kitap3.getKitapYazari());
                }

                System.out.println("-------------------------------------------");


            } else if(islem1.equals("3")){
                System.out.println("İşlemden çıkılıyor...");
                break;
            }
        }
    }

    @Override
    public void gecikmeÜcretiHesaplama() {
        String bilgilendirme="Kitabı getirmediğiniz günler için cezalar şu şekildir\n"
                +"*******************************************************\n"
                +"1-14 gün arası herhangi bir ceza bulunmamaktadır...\n"
                +"14-21 gün arası getirmediğiniz her gün için 2TL ceza uygulanır...\n"
                +"21-30 gün arası getirmediğiniz her gün için 4 tl ceza uygulanır...\n"
                +"30 günden itibaren getirilmeyen hergün için 10tl ceza uygulanır\n";



        System.out.println(bilgilendirme);
        System.out.println("-------------------------------------------");
        System.out.print("Kitap Kaçıncı gününde teslim edilmiştir: ");
        int günSayisi=scanner.nextInt();
        System.out.println("-------------------------------------------");


        if(günSayisi<14){
            System.out.println("Geçikme ücreti bulunmamaktadır...");
            System.out.println("-------------------------------------------");



        }else if(günSayisi<=21){
            int hesapla1 = günSayisi* 2;
            System.out.println("Ödenmesi gereken ceza: "+hesapla1);
            System.out.println("-------------------------------------------");



        }else if(günSayisi<=30){
            int hesapla1 = günSayisi*4;
            System.out.println("Ödenmesi gereken ceza: "+hesapla1);
            System.out.println("-------------------------------------------");

        }else if(günSayisi>30){
            int hesapla1 = günSayisi*10;
            System.out.println("Ödenmesi gereken ceza: "+hesapla1);
            System.out.println("-------------------------------------------");

        }
    }

    @Override
    public void kitapArama() {
        System.out.print("Aranan kitap İsmi: ");
        String kitapİsmi3232= scanner.nextLine();

        Kitap foundKitap = kitapArama1(kitap2, kitapİsmi3232);
        if(foundKitap!=null){
            System.out.println("Kitap Bulundu: "+ foundKitap.getKitapİsmi()+" Yazarı : "+ foundKitap.getKitapYazari());
        }else{
            System.out.println("Kitap bulunamadı...");
        }

    }





    public static Kitap kitapArama1(ArrayList<Kitap> kitap2 ,String kitapİsmi) {
        for( Kitap kitap3:kitap2 ){
            if(kitap3.getKitapİsmi().equalsIgnoreCase(kitapİsmi)){
                return kitap3;
            }
        }
        return null ;
    }



    @Override
    public void kitapÖdüncVerme(boolean kitapÖdünc) {

        System.out.println("----------HOŞGELDİNİZ--------");

        while(kitapÖdünc){
            String islemler232="Kitap Ödünç Vermek= '1'\n"
                    +"Kitap Geri alma= '2'\n"
                    +"Programdan Çıkış= '3'";


            System.out.println(islemler232);
            System.out.println("---------------------------------");
            System.out.print("Yapmak istediğiniz İşlem nedir (1/2/3)= ");
            int secim= scanner.nextInt();
            scanner.nextLine();

            switch(secim){
                case 1:
                    System.out.println("---------------------------------");

                    System.out.print("Ödünç Vermek istediğiniz kitap İsmi: ");
                    String Oduncİsim=scanner.nextLine();

                    boolean bulunuyormu= false;

                    for(Kitap kitap3: kitap2 ){

                        if(kitap3.getKitapİsmi().equals(Oduncİsim)){
                            kitap3.ödüncVer();
                            bulunuyormu = true;
                            System.out.println(Oduncİsim+"'İsimli Kitap ödünc verildi...");
                            System.out.println("---------------------------------");

                            break;
                        }

                    }if (!bulunuyormu){
                    System.out.println("Kitap Bulunmuyor...");
                    System.out.println("---------------------------------");

                }
                    break;


                case 2:
                    System.out.print("Geri alınan kitap ismi: ");
                    String geriAlİsim= scanner.nextLine();
                    bulunuyormu= false;

                    for(Kitap kitap3: kitap2){
                        if(kitap3.getKitapİsmi().equals(geriAlİsim)){
                            bulunuyormu = true;
                            System.out.println(geriAlİsim+" İsimli Kitap geri Alındı...");
                            System.out.println("---------------------------------");

                            break;
                        }
                    }
                    if(!bulunuyormu){
                        System.out.println("Kitap bulunamadı...");
                        System.out.println("---------------------------------");

                    }
                    break;
                case 3:
                    kitapÖdünc=false;
                    break;
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin....");

            }
        }







    }




}
