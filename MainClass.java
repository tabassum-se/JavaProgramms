public class MainClass {
    public static void main (String[]args){
    CeaserCipher cipher = new CeaserCipher();

    String cipherText = cipher.encryptMessage("ABCDF",13);
        System.out.println(cipherText);
    }
}