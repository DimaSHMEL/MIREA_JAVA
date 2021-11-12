package Labratory.lab_8_1;

import java.util.Scanner;

public class TestCMD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in;
        in = scanner.nextLine();
        CmdOutput cmdout = new CmdOutput(in);
    }
}
