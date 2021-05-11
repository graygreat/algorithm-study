package etc.godOfJava.chapter26;

import java.io.File;
import java.text.DecimalFormat;

public class FileSizeSummary {
    DecimalFormat formatter = null;

    public FileSizeSummary() {
        String pattern = "#,##0.0#";
        formatter = new DecimalFormat(pattern);
    }

    public static void main(String[] args) {
        FileSizeSummary sample = new FileSizeSummary();
        String path = "/Users/bennie/SourceCode/Algorithm/Algorithm/java-algorithm/src/main/java/etc/godOfJava/chapter26";
        long sum = sample.printFileSize(path);
        System.out.println(path + "'s total size = " + sum);
    }

    public long printFileSize(String dirName) {
        File dir = new File(dirName);
        long sum = 0;
        if (dir.isDirectory()) {
            File[] fileList = dir.listFiles();
            for (File file : fileList) {
                if (file.isFile()) {
                    String tempFileName = file.getAbsolutePath();
                    long fileLength = file.length();
                    System.out.println(tempFileName + " = " + convertFileLength(fileLength));
                    sum += fileLength;
                } else {
                    String tempDirName = file.getAbsolutePath();
                    long fileLength = printFileSize(tempDirName);
                    printInfo(tempDirName, fileLength, true);
                    sum += fileLength;
                }
            }
        }
        return sum;
    }

    public void printInfo(String path, long fileLength, boolean dirFlag) {
        if (dirFlag) {
            path = "[" + path + "] TOTAL";
        }
        System.out.println(path + "= " + convertFileLength(fileLength) + "(" + fileLength + ")");

    }

    private final long KB = 1024;
    private final long MB = 1024 * 1024;
    private final long GB = 1024 * 1024 * 1024;

    private String convertFileLength(long fileLength) {
        if (fileLength < KB) {
            return fileLength + " b";
        } else if (fileLength < MB) {
            return formatter.format(1.0 * fileLength / KB) + " kb";
        } else if (fileLength < GB) {
            return formatter.format(1.0 * fileLength / MB) + " mb";
        } else {
            return formatter.format(1.0 * fileLength / GB) + " gb";
        }
    }
}
