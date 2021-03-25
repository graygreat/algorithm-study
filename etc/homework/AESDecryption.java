import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import static java.util.Base64.*;

public class AESDecryption {
    private static class Data {
        private byte[] key;
        private byte[] iv;
        private byte[] cipherText;

        public Data(byte[] key, byte[] iv, byte[] cipherText) {
            this.key = key;
            this.iv = iv;
            this.cipherText = cipherText;
        }

        public byte[] getKey() {
            return key;
        }

        public byte[] getIv() {
            return iv;
        }

        public byte[] getCipherText() {
            return cipherText;
        }
    }

    public static void main(String[] args) throws NoSuchPaddingException, InvalidAlgorithmParameterException, NoSuchAlgorithmException,
            IllegalBlockSizeException, BadPaddingException, InvalidKeyException {
        AESDecryption aesDecryption = new AESDecryption();
        aesDecryption.solution();
    }

    private static void solution() throws NoSuchPaddingException, InvalidKeyException, NoSuchAlgorithmException, IllegalBlockSizeException,
            BadPaddingException, InvalidAlgorithmParameterException {
        String key = "8iE3bf1se6N76HGPP8S0Xw==";
        String iv = "cHml3oX848/0uBwDJtChOA==";
        String cipherText = "QDr9NZNG9Bgc3TTnfRuqjjzf/kVSYwbP7F9mR4GQZ/IneIh7HTc/" +
                "xnwzEeVBcH3pPlIbLFySKZruedJc9X87CGNDJ1f2Dat8BR3Ypbei5Q42xc306/" +
                "AkSuGsjfqbX9/ELxmdKn7MyvY/Jbc0v0AJHV6odgNzygKRRrFJcUIF/50=";
        Data data = decodeBase64(key, iv, cipherText);

        String plainText = decryptText(data);
        System.out.println(plainText);
    }

    /**
     * Decode Base64
     */
    private static Data decodeBase64(String key, String iv, String cipherText) {
        Decoder decoder = getDecoder();
        byte[] decodedKey = decoder.decode(key);
        byte[] decodedIv = decoder.decode(iv);
        byte[] decodedCipherText = decoder.decode(cipherText);

        return new Data(decodedKey, decodedIv, decodedCipherText);
    }

    /**
     * Decrypt Data
     */
    private static String decryptText(Data data) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException,
            InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        SecretKeySpec keySpec = new SecretKeySpec(data.getKey(), "AES");
        IvParameterSpec ivSpec = new IvParameterSpec(data.getIv());
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");

        cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);
        byte[] plainCipherText = cipher.doFinal(data.getCipherText());
        String plainText = new String(plainCipherText);

        return plainText;
    }
}
