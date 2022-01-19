package gun38.enum3;

public enum Kitap {
    YERALTINDANNOTLAR("Dostoyevski",1864,160),
    TUTUNAMAYANLAR("Oguz Atay",1972,724),
    AMAT("Ihsan Oktay Anar",2008,300),
    SEFILLER("Victor Hugo",1910,400)
    ;



    private String yazari;
    private int basimYili;
    private int sayfaSayısı;

    Kitap(String yazari, int basimYili, int sayfaSayısı) {

        this.yazari = yazari;
        this.basimYili = basimYili;
        this.sayfaSayısı = sayfaSayısı;
    }

    @Override
    public String toString() {
        return
                "yazari='" + yazari + '\'' +
                ", basimYili=" + basimYili +
                ", sayfaSayısı=" + sayfaSayısı
                ;
    }

    public String getYazari() {
        return yazari;
    }

    public int getBasimYili() {
        return basimYili;
    }

    public int getSayfaSayısı() {
        return sayfaSayısı;
    }
}
