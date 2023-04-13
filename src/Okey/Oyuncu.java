package Okey;

import java.util.ArrayList;

public class Oyuncu {
    ArrayList<Tas> el = new ArrayList<Tas>();
    private boolean ilkBaslayacakOyuncu;
    private int tasSayisi;
    boolean istakaDolu;
    Oyuncu(boolean ilkBaslayacakMi){
        ilkBaslayacakOyuncu = ilkBaslayacakMi;
    }
    Oyuncu(){
    }
    boolean eleTasEkle(Tas tas){
        boolean saymayaDevam = tasSay();
        if (saymayaDevam){
            el.add(tas);
        }
        return saymayaDevam;
    }
    private boolean tasSay(){
        if (tasSayisi<14){
            tasSayisi++;
            return true;
        }else if ((ilkBaslayacakOyuncu )&& (tasSayisi<15)){
            tasSayisi++;
            return true;
        }else{
            istakaDolu = true;
            return false;
        }
    }
}
