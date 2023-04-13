package Okey;

class Program {

    Program(){
        Taslar yeniTaslar = new Taslar();
        boolean tasEklenmeli = true;
        while(tasEklenmeli){
            tasEklenmeli = yeniTaslar.tasYarat();
        }
        yeniTaslar.okeyTasiniBelirle();
        yeniTaslar.taslariKaristir();
        yeniTaslar.taslariDagit();
        int oyuncuNumara=0;
        for (Oyuncu oyuncu:yeniTaslar.oyuncular){
            System.out.println("\nOyuncu"+" "+oyuncuNumara);
            for(Tas tas:oyuncu.el){
                System.out.print(" "+tas.getRenk()+" "+tas.getNumara());
            }
            oyuncuNumara++;
        }
    }
}