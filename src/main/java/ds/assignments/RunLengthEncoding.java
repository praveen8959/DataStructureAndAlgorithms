package ds.assignments;

public class RunLengthEncoding {

    public static void main(String[] args) {
        String code = "aaaabcaaade";
        String encode = encode(code);
        System.out.println("Encrypted code is " + encode);
        String decode = decode(encode);
        System.out.println("Decrypted code is " + decode);

    }

    private static String decode(String encode) {
        char[] chars = encode.toCharArray();
        char alphabet = 0;
        StringBuilder sb = new StringBuilder();
        char nextChar;
        int count = 0;
        for (char c : chars) {
            if (count == 0) {
                count = Character.getNumericValue(c);
            } else {
                nextChar = c;
                while (count != 0) {
                    sb.append(nextChar);
                    count--;
                }
            }
        }
        return sb.toString();
    }

    private static String encode(String code) {
        StringBuilder sb = new StringBuilder();
        char[] chars = code.toCharArray();
        char previous = 0;
        int counter = 0;
        for (char c : chars) {
            if (c == previous) {
                counter++;
            } else {
                if (previous != 0) {
                    sb.append(counter).append(previous);
                }
                previous = c;
                counter = 1;
            }
        }
        sb.append(counter).append(previous);
        return sb.toString();
    }
}
