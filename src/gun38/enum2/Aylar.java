package gun38.enum2;

public enum Aylar {
    OCAK(31),
    SUBAT(28),
    MART(31),
    NISAN(30),
    MAYIS(31),
    HAZIRAN(30),
    TEMMUZ(30),
    AGUSTOS(31),
    EYLUL(30),
    EKIM(31),
    KASIM(30),
    ARALIK(31)
    ;
    private int gunSayısı;
    Aylar(int gunSayısı) {
        this.gunSayısı=gunSayısı;
    }

    public int getGunSayısı() {
        return gunSayısı;
    }

    @Override
    public String toString() {
        return "gunSayısı: " + gunSayısı+","+(this.ordinal()+1)+". ay ,"
                ;
    }
}
