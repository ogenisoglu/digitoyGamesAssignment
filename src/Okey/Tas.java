package Okey;

class Tas {
    private String renk;
    private int numara;
    private boolean buOkeyTasidir;
    Tas(String renk,int numara){
        this.renk = renk;
        this.numara = numara;
    }
    Tas(String renk,int numara,boolean buOkeyTasidir){
        this.renk = renk;
        this.numara = numara;
        this.buOkeyTasidir = buOkeyTasidir;
    }
    public int getNumara() {
        return numara;
    }
    public String getRenk() {
        return renk;
    }
    public boolean getBuBirOkeyTasidir(){
        return buOkeyTasidir;
    }
}
