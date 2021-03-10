import java.util.*;

/**
 * 정보보호개론 과제 #1
 */
public class Decryption {
    private String text = "APS ZU BMS THAAMT KB SOP CHAAPJ MQ LPUWHKX. K UHJ SM JMZ SMLHJ VJ QXKPBLU -- UM PCPB SOMZDO TP\n" +
            "QHEP SOP LKQQKEZASKPU MQ SMLHJ HBL SMVMXXMT, K USKAA OHCP H LXPHV. KS KU H LXPHV LPPWAJ XMMSPL\n" +
            "KB SOP HVPXKEHB LXPHV. K OHCP H LXPHV SOHS MBP LHJ SOKU BHSKMB TKAA XKUP ZW HBL AKCP MZS SOP SXZP\n" +
            "VPHBKBD MQ KSU EXPPL: \"TP OMAL SOPUP SXZSOU SM IP UPAQ-PCKLPBS, SOHS HAA VPB HXP EXPHSPL PGZHA.\"\n" +
            "K OHCP H LXPHV SOHS MBP LHJ MB SOP XPL OKAAU MQ DPMXDKH SOP UMBU MQ QMXVPX UAHCPU HBL SOP UMBU\n" +
            "MQ QMXVPX UAHCP MTBPXU TKAA IP HIAP SM UKS LMTB SMDPSOPX HS SOP SHIAP MQ IXMSOPXOMML. K OHCP H\n" +
            "LXPHV SOHS MBP LHJ PCPB SOP USHSP MQ VKUUKUUKWWK, H USHSP UTPASPXKBD TKSO SOP OPHS MQ KBFZUSKEP,\n" +
            "UTPASPXKBD TKSO SOP OPHS MQ MWWXPUUKMB, TKAA IP SXHBUQMXVPL KBSM HB MHUKU MQ QXPPLMV HBL\n" +
            "FZUSKEP. K OHCP H LXPHV SOHS VJ QMZX AKSSAP EOKALXPB TKAA MBP LHJ AKCP KB H BHSKMB TOPXP SOPJ TKAA\n" +
            "BMS IP FZLDPL IJ SOP EMAMX MQ SOPKX URKB IZS IJ SOP EMBSPBS MQ SOPKX EOHXHESPX. K OHCP H LXPHV\n" +
            "SMLHJ. K OHCP H LXPHV SOHS MBP LHJ LMTB KB HAHIHVH, TKSO KSU CKEKMZU XHEKUSU, TKSO KSU DMCPXBMX\n" +
            "OHCKBD OKU AKWU LXKWWKBD TKSO SOP TMXLU MQ KBSPXWMUKSKMB HBL BZAAKQKEHSKMB -- MBP LHJ XKDOS\n" +
            "SOPXP KB HAHIHVH AKSSAP IAHER IMJU HBL IAHER DKXAU TKAA IP HIAP SM FMKB OHBLU TKSO AKSSAP TOKSP\n" +
            "IMJU HBL TOKSP DKXAU HU UKUSPXU HBL IXMSOPXU. K OHCP H LXPHV SMLHJ. K OHCP H LXPHV SOHS MBP LHJ\n" +
            "PCPXJ CHAAPJ UOHAA IP PNHASPL, HBL PCPXJ OKAA HBL VMZBSHKB UOHAA IP VHLP AMT, SOP XMZDO WAHEPU\n" +
            "TKAA IP VHLP WAHKB, HBL SOP EXMMRPL WAHEPU TKAA IP VHLP USXHKDOS, HBL SOP DAMXJ MQ SOP AMXL\n" +
            "UOHAA IP XPCPHAPL HBL HAA QAPUO UOHAA UPP KS SMDPSOPX.";
    private int[] countAlphabet = new int[26];
    private Map<String, Integer> wordCountList = new HashMap<>();

    public static void main(String[] args) {
        Decryption decryption = new Decryption();
        decryption.solution();
    }

    private void solution() {
//        printAlphabetCount();
//        printWordCount();
        decryptText();
    }

    /**
     * 알파벳 개수 센 후 출력
     */
    private void countAlphabet() {
        for (int i = 0; i < text.length(); i++) {
            if ((int) text.charAt(i) >= 65 && (int) text.charAt(i) <= 90) {
                countAlphabet[(int) text.charAt(i) - 65]++;
            }
        }
    }

    private void printAlphabetCount() {
        countAlphabet();
        for (int i = 0; i < countAlphabet.length; i++) {
            System.out.printf("%c: %d\n", (char) 65 + i, countAlphabet[i]);
        }
    }

    /**
     * 단어 개수 센 후 출
     */
    private void countWord() {
        StringTokenizer str = new StringTokenizer(text, " ");

        while (str.hasMoreTokens()) {
            String word = str.nextToken();
            if (wordCountList.containsKey(word)) {
                int count = wordCountList.get(word) + 1;
                wordCountList.put(word, count);
                continue;
            }
            wordCountList.put(word, 1);
        }
    }

    private void printWordCount() {
        countWord();
        List<String> keySetList = new ArrayList<>(wordCountList.keySet());
        Collections.sort(keySetList, (o1, o2) -> (wordCountList.get(o2).compareTo(wordCountList.get(o1))));

        for (String key : keySetList) {
            System.out.println(key + " : " + wordCountList.get(key));
        }
    }

    /**
     * 복호화 알고리즘
     */
    private void decryptText() {
        String[] convertedAlphabet = {"l", "n", "v", "g", "c", "j", "q", "a", "b", "y", "i", "d", "o", "x", "h"
                , "e", "f", "k", "t", "w", "s", "m", "p", "r", "z", "u"};

        for (int i = 0; i < convertedAlphabet.length; i++) {
            text = text.replace(Character.toString((char) 65 + i), convertedAlphabet[i]);
        }
        System.out.println(text);
    }
}
