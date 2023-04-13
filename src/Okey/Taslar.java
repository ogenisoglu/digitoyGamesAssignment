package Okey;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

class Taslar {
    ArrayList<Tas> taslar = new ArrayList<Tas>();
    private int tasSayisi;
    private boolean yuzAltiTasaUlasildi;
    private Tas okeyTasi;
    Oyuncu[] oyuncular = new Oyuncu[4];

    boolean tasYarat(){
        int saymaSayisi = tasSayisi/2;
        if (yuzAltiTasaUlasildi){
            return false;
        }// 106 yı 2 ye bölerek 53 taşın sırasıne göre numaralandırıyorum
        taslar.add(new Tas(tasinRenginiSoyle(saymaSayisi),saymaSayisi%13));
        taslar.add(new Tas(tasinRenginiSoyle(saymaSayisi),saymaSayisi%13));
        tasSayisi += 2;
        if(tasSayisi == 106){
            yuzAltiTasaUlasildi = true;
        }
        return true;
    }
    private String tasinRenginiSoyle(int saymaSayisi){
        if (saymaSayisi<13){
            return "sarı";
        }else if (saymaSayisi<26){
            return "mavi";
        }else if (saymaSayisi<39){
            return "siyah";
        }else if (saymaSayisi<52){
            return "kırmızı";   
        }else{
            return "sahte okey";
        }
    }
    void taslariKaristir(){
        Collections.shuffle(taslar);
    }
    void okeyTasiniBelirle(){
        Random rand = new Random();
        int okeyTasiNumara = rand.nextInt(104);
        okeyTasi = new Tas(tasinRenginiSoyle(okeyTasiNumara),okeyTasiNumara,true);
        taslar.remove(okeyTasiNumara);
    }
    void taslariDagit(){
        int tasEklemeSirasi = 0;
        boolean istakayaTasEklenecek = true;
        for(int oyuncuNumara = 0;oyuncuNumara<4;oyuncuNumara++){
            boolean tasEklemeyeDevamEt = true;
            if (oyuncuNumara == 0){
                 //ilk başlayacak oyuncuya 15 taş ekleniyor
                oyuncular[oyuncuNumara] = new Oyuncu(true);
                while (tasEklemeyeDevamEt){
                    tasEklemeyeDevamEt=  oyuncular[oyuncuNumara].eleTasEkle(taslar.get(tasEklemeSirasi));
                    tasEklemeSirasi++;
                }
            }else{
                //diğerlerine 14
                oyuncular[oyuncuNumara] = new Oyuncu();
                while (tasEklemeyeDevamEt){
                    tasEklemeyeDevamEt=  oyuncular[oyuncuNumara].eleTasEkle(taslar.get(tasEklemeSirasi));
                    tasEklemeSirasi++;
                }
            }

        }
    }
}
