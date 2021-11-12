package Exercises.ex_12;

import java.util.StringTokenizer;

public class Adressgetter {
    //Позиции в которые вставить инфу
    String Country = "", Region = "", City = "", Street = "", Home = "", Build = "", Flat = "";
    //Метод записывающий при помощи сплита
    public void setall_split(String data) {
        String[] Data = data.split(",");
        if (Data.length >= 4) {
            Country = Data[0];
            Region = Data[1];
            City = Data[2];
            Street = Data[3];
            if (Data.length > 4)
                Home = Data[4];
            if (Data.length > 5)
                Build = Data[5];
            if (Data.length > 6)
                Flat = Data[6];
        } else
            System.out.println("Not enoghu items");
    }
    //Метод записывающий при помощи токенайзера
    public void setall_token(String data)
    {
        StringTokenizer Data = new StringTokenizer(data, ",.;-");
        if (Data.countTokens() >= 4) {
            Country = Data.nextToken();
            Region = Data.nextToken();
            City = Data.nextToken();
            Street = Data.nextToken();
            if (Data.hasMoreTokens())
                Home = Data.nextToken();
            if (Data.hasMoreTokens())
                Build = Data.nextToken();
            if (Data.hasMoreTokens())
                Flat = Data.nextToken();
        } else
            System.out.println("Not enoghu items");
    }
    //Вывод полученной информации
    public String toString() {
        return "Adress " + Country  + Region
                + City  + Street  + Home +
                Build  + Flat;
    }
}
