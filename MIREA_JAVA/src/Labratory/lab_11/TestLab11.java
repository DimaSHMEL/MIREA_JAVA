package Labratory.lab_11;

public class TestLab11 {
    public static void main(String[] args) {
        GenericMap<String, Integer> NewMap = new GenericMap<>();
        NewMap.Insert("ALOHA", 123);
        System.out.println(NewMap.getValue("ALOHA"));
        NewMap.Insert("ALOHA", 321);
        NewMap.Insert("A", 2);
        NewMap.Insert("B", 1);
        NewMap.Insert("C", 3);
        System.out.println(NewMap.checkkey("ALOHA"));
        System.out.println(NewMap.getValue("ALOHA"));
        System.out.println(NewMap);
        NewMap.clear();
        System.out.println(NewMap);
    }
}
