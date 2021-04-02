package etc;

import java.math.BigInteger;

class PublicKey {
    private BigInteger n;
    private BigInteger e;

    public PublicKey(BigInteger n, BigInteger e) {
        this.n = n;
        this.e = e;
    }

    public BigInteger getN() {
        return n;
    }

    public BigInteger getE() {
        return e;
    }
}

class EncryptedMessage {
    private BigInteger c;

    public EncryptedMessage(BigInteger c) {
        this.c = c;
    }

    public BigInteger getC() {
        return c;
    }
}

class PAndQ {
    private BigInteger p;
    private BigInteger q;

    public PAndQ(BigInteger p, BigInteger q) {
        this.p = p;
        this.q = q;
    }

    public BigInteger getP() {
        return p;
    }

    public BigInteger getQ() {
        return q;
    }
}

public class Rsa {
    private PublicKey publicKey;
    private EncryptedMessage encryptedMessage;

    public Rsa(PublicKey publicKey, EncryptedMessage encryptedMessage) {
        this.publicKey = publicKey;
        this.encryptedMessage = encryptedMessage;
    }

    public static void main(String[] args) {
        Rsa rsa = new Rsa(new PublicKey(new BigInteger("3174654383"), new BigInteger("65537")), new EncryptedMessage(new BigInteger("2487688703")));
        rsa.decryptRsa();
    }

    private PAndQ findPAndQ(BigInteger p, BigInteger q) {
        while (p.compareTo(q) == 1) {
            if (p.remainder(q) == BigInteger.ZERO) {
                p = p.divide(q);
                break;
            }
            q = q.add(BigInteger.ONE);
        }
        System.out.println("p : " + p);
        System.out.println("q : " + q);

        return new PAndQ(p, q);
    }

    private void decryptRsa() {
        PAndQ pAndQ = findPAndQ(publicKey.getN(), new BigInteger("2"));
        BigInteger d;
        BigInteger m;
        int k = 1;

        while (true) {
            d = pAndQ.getP().subtract(BigInteger.ONE).multiply(pAndQ.getQ().subtract(BigInteger.ONE)).multiply(BigInteger.valueOf(k)).add(BigInteger.ONE);
            if (d.remainder(publicKey.getE()) == BigInteger.ZERO) {
                d = d.divide(publicKey.getE());
                break;
            }
            k++;
        }
        m = encryptedMessage.getC().modPow(d, publicKey.getN());
        System.out.println("privateKey 'd': " + d);
        System.out.println("PlainText 'M' : " + encryptedMessage.getC() + "^" + d + " mod " + publicKey.getN() + " = " + m);
    }
}
