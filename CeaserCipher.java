//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CeaserCipher {

    public String encryptMessage(String pText, int eKey)
    {
        //string to store encrypted message
        StringBuilder encrypted = new StringBuilder(pText);
        //alphabets
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // shifted alphabets
        String shiftedAlpha = alphabets.substring(eKey) + alphabets.substring(0,eKey);

        // loop to run upto length of encrypted message
        for (int i = 0; i < encrypted.length() ; i++) {
            //get ith character of encrypted var.
            char curChar = encrypted.charAt(i);
            //get index of character from aphabet string
            int indx = alphabets.indexOf(curChar);
            //check if character is found or not
            if (indx != -1) {
                //find character from shiftedalphabets using the above index
                char newChar = shiftedAlpha.charAt(indx);
                //replace the ith character from shiftedAlpha
                encrypted.setCharAt(i, newChar);
            }
        }
        return encrypted.toString();
    }

}
