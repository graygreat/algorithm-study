package etc.godOfJava.chapter20;

public class NumberObjects {

    public static void main(String[] args) {
        NumberObjects numberObjects = new NumberObjects();
//        numberObjects.parseLong("1");
        numberObjects.printOtherBase(1024);
    }

    public long parseLong(String data) {
        try {
            long l = Long.parseLong(data);
            System.out.println(l);
            return l;
        } catch (NumberFormatException e) {
            System.out.println(data + " is not a number.");
            return -1;
        }
    }

    public void printOtherBase(long value) {
        System.out.println("Original:" + value);
        System.out.println("Binary  :" + Long.toBinaryString(value));
        System.out.println("Hex     :" + Long.toHexString(value));
        System.out.println("Octal   :" + Long.toOctalString(value));
    }
}
