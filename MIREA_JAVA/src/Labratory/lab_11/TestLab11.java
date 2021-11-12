package Labratory.lab_11;

public class TestLab11 {
    public static void main(String[] args) {
        GenericMap<String, Integer> NewMap = new GenericMap<>();
        NewMap.Insert("ALOHA", 123);
        System.out.println(NewMap.getValue("ALOHA"));
        System.out.println(NewMap);
    }
}
