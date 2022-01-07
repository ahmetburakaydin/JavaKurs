package gun33Tekrar.task1;

public class MyMath {
    public static int getMax(int x , int y){
        return Math.max(x,y);
    }
    public static int getMax(int x,int y,int z){
        return Math.max(Math.max(x,y),z);
    }
    public static int getMin(int x , int y){
        return Math.min(x,y);
    }
    public static int getMin(int x,int y,int z){
        return Math.min(Math.min(x,y),z);
    }
    public static int getMutlak(int x) {
        return Math.abs(x);
    }
    public static double getUs(int x,int y){
        return Math.pow(x,y);
    }
    public static double getKarakök(int x ){
        return Math.sqrt(x);
    }
    public static int getToplam(int...x){
        int toplam=0;
        for (int sayi :x) {
            toplam+=sayi;
        }
        return toplam;
    }
    public static int getCarpım(int...x){
        int carpim=1;
        for(int sayi : x){
            carpim*=sayi;
        }
        return carpim;
    }

}
