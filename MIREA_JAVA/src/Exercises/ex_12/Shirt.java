package Exercises.ex_12;

public class Shirt {
    private String id, item_name, color, size;
    public Shirt(String data)
    {
        //разделение строчки на нужные данные
        String[] dataset = data.split(",");
        this.id = dataset[0];
        this.item_name = dataset[1];
        this.color = dataset[2];
        this.size = dataset[3];
    }
    public String toString() {
        return "Shirt info by the id " + id + " is: \n" +
                "This is a " + item_name + '\n' +
                "It has " + color + " color \n" +
                "It has " + size + " size \n";
    }
}
//Класс создающий массив Shirt
class creator_Shirts
{
    public Shirt[] create_shirt_arr(String[] data)
    {
        Shirt[] answ = new Shirt[data.length];
        for(int i = 0; i < data.length; i++)
        {
            answ[i] = new Shirt(data[i]);
        }
        return answ;
    }
}


