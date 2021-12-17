package Labratory.lab_12;

public class Testlab12 {
    public static void main(String[] args) {
        String date = "29/02/2000";
        RegularString reg = new RegularString();
        reg.ex_1_2("One,Two,Three", ",");

        reg.ex_1("3455.20 EU 145.10 RUB 2334 rfd");
        System.out.println(reg.ex_2(" abcdefghijklmnoasdfasdpqrstuv18340"));
        System.out.println(reg.ex_3_2(""));
        System.out.println(reg.ex_3(date));
        System.out.println(reg.ex_4(("aza@ks.tert.ggggg.ru")));
        System.out.println(reg.ex_5("Aa1das2112"));
    }
}
