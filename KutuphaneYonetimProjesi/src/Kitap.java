import java.util.ArrayList;
import java.util.Scanner;

public class Kitap {
    private String kitapİsmi;
    private String kitapYazari;
    private boolean kitapÖdünc;

    Scanner scanner= new Scanner(System.in);

    public Kitap (String kitapİsmi){
        this.kitapİsmi=kitapİsmi;
    }

    public Kitap (String kitapİsmi, String kitapYazari){

        this.kitapYazari=kitapYazari;
        this.kitapİsmi=kitapİsmi;

    }


    public void gecikmeÜcretiHesaplama(){

    }

    public void kitapEkle(String kitapİsmi , String kitapYazari ){
        this.kitapİsmi=kitapİsmi;
        this.kitapYazari=kitapYazari;

    }

    public void ödüncVer(){



    }

    public void kitapArama(){
    }

    public void kitapÖdüncVerme(boolean kitapÖdünc){

    }


    public void setKitapİsmi(String kitapİsmi){
        this.kitapİsmi=kitapİsmi;
    }

    public String getKitapİsmi(){
        return kitapİsmi;
    }
    public String getKitapYazari(){
        return kitapYazari;
    }
    public boolean getKitapÖdünc(){
        if(kitapÖdünc==true){
            return true;
        }else{
            return false;
        }
    }



}
