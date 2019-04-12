import java.util.Scanner;

public class KTC {
    public static void main(String[] args) {
        char[] buffer1 = new char[1503];
        char[] buffer2 = new char[buffer1.length + 501];
        char[] buffer3 = new char[buffer1.length+1002];

        Scanner sc = new Scanner(System.in);

        buffer1 = sc.nextLine().toCharArray();
        buffer2 = sc.nextLine().toCharArray();

        int length1 = buffer1.length;
        int length2 = buffer2.length;
        int minLength = length1 < length2 ? length1 : length2;

        int in = 0;
        int out = 0;

        for (int i = 0; i < minLength; i++) {
            buffer3[in++] = (char)(((buffer1[i] - buffer2[i] + 26) % 26) + 65);
        }

        for (int i = length2; i < length1; i++) {
            buffer3[in++] = (char)(((buffer1[i] - buffer3[out++] + 26) % 26) + 65);
        }

        //buffer3[in] = '\0';
        System.out.println(buffer3);
    }
}
