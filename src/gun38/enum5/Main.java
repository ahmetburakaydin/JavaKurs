package gun38.enum5;

public class Main {
    /*
    user classı tanımlayın
    name statu  role
    mainde  3 adet user tanımlayın
     */

    public static void main(String[] args) {
        User u1 = new User("Ahmet",Role.CEO,Statu.CALISIYOR);
        User u2 = new User("Mehmet",Role.GENELMUDUR,Statu.RAPORLU);
        User u3 = new User("Ali",Role.BOLGEMUDURU,Statu.IZINDE);
    }

}

