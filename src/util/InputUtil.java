package atmApp.util;

import java.util.Scanner;

public class InputUtil {
    public static int inputTypeInt(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
            int input = scanner.nextInt();
        return input;
    }

    public static String inputTypeString(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        String input = scanner.nextLine();
        return input;
    }

    public static long inputTypeLong(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        long input = scanner.nextInt();
        return input;
    }
}
