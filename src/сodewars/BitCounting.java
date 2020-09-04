package сodewars;

public class BitCounting {
    public static int countBits(int n) {
        String binaryStr = Integer.toBinaryString(n);
        int bitCounter = 0;
        for (char ch : binaryStr.toCharArray()) {
            if (ch == '1') {
                bitCounter++;
            }
        }
        return bitCounter;
    }
}
