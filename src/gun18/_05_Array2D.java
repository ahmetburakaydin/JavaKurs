package gun18;

public class _05_Array2D {
    public static void main(String[] args) {
        String [][] fiyatlar = {{"15$","56€","33$"},{"67$,78€"},{"100€"}};


        int toplam=0; // toplam değişkeni dışarda olduğu için burada tanımlıyoruz.
        String fiyat="";

        for (int i = 0; i < fiyatlar.length; i++) {
            for (int j = 0; j < fiyatlar[i].length; j++) {
                if(fiyatlar[i][j].contains("$")){
                    fiyat=fiyatlar[i][j].replaceAll("\\$","");
                    toplam+= Integer.parseInt(fiyat)*3;
                }else {
                    fiyat=fiyatlar[i][j].replaceAll("€","");
                    toplam+= Integer.parseInt(fiyat)*5;
                }

            }

        }
        System.out.println(toplam);
    }
}
