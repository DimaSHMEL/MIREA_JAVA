package Exercises.ex_16.orders;

import Exercises.ex_16.items.Item;

public final class RestaurantOrder implements Order{

    private int capacity = 0;
    private final int size = 100;
    private final Item[] items = new Item[size];

    public boolean Add_item(Item item)
    {
        if(capacity == size)
            return false;
        this.items[capacity] = item;
        this.capacity += 1;
        return true;
    }
    public boolean Remove_item(String item_name)
    {
        boolean trig = false;
        for(int i = 0; i < capacity; i++)
        {
            if(trig)
                this.items[i] = this.items[i + 1];
            if(this.items[i].getName() == item_name && !trig) {
                this.items[i] = this.items[i + 1];
                trig = true;
            }
        }
        if(trig) {
            this.capacity--;
            return true;
        }
        return false;
    }
    public int Remove_item_all(String item_name)
    {
        int trig = 0;
        for(int i = 0; i < capacity; i++)
        {
            if(this.items[i].getName() == item_name) {
                this.items[i] = this.items[i + 1];
                i--;
                trig++;
            }
        }
        return  trig;
    }
    public Item[] getItems()
    {
        return items;
    }
    public double costTotal()
    {
        double sum = 0;
        for(int i = 0; i < this.capacity; i++)
            sum+=this.items[i].getCost();
        return sum;
    }
    public int itemQuantaty(String item_name)
    {
        int all = 0;
        for(int i = 0; i <this.capacity; i++)
        {
            if(this.items[i].getName() == item_name)
                all++;
        }
        return all;
    }

}
