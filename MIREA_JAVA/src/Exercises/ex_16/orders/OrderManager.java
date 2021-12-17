package Exercises.ex_16.orders;

import Exercises.ex_16.items.Item;

public class OrderManager {
    private int cap = 0;
    private final int size = 100;
    private final RestaurantOrder[] orders = new RestaurantOrder[size];
    public void add(RestaurantOrder order, int table_number)
    {
        if(cap < size) {
            this.orders[table_number - 1] = order;
            cap++;
        }
    }
    public RestaurantOrder getOrder(int table_number)
    {
        return this.orders[table_number - 1];
    }
    public void addItem(Item item, int table_number)
    {
        this.orders[table_number - 1].Add_item(item);
    }
    void removeOrder(int table_number)
    {
        this.orders[table_number - 1] = null;
    }
    public int freeTableNumber()
    {
        for(int i = 0; i < this.size; i++)
        {
            if(this.orders[i] == null)
                return i + 1;
        }
        return -1;
    }
    public int[] freeTableNumbers()
    {
        int[] temp = new int[this.cap];
        for(int i = 0; i < this.size; i++)
        {
            if(this.orders[i] == null) {
                temp[i] = i + 1;
            }
        }
        return temp;
    }
    public RestaurantOrder[] getOrders()
    {
        RestaurantOrder[] temp = new RestaurantOrder[this.cap];
        for(int i = 0; i < this.size; i++)
        {
            if(this.orders[i] == null) {
                temp[i] = orders[i];
            }
        }
        return temp;
    }
    public double ordersCostSummary()
    {
        double sum = 0;
        RestaurantOrder[] all = getOrders();
        for(int i = 0; i < all.length; i++)
        {
            sum += all[i].costTotal();
        }
        return sum;
    }
    public int orderQuantity(String item_name)
    {
        int quant = 0;
        RestaurantOrder[] all = getOrders();
        for(int i = 0; i < all.length; i++)
        {
            quant+=all[i].itemQuantaty(item_name);
        }
        return quant;
    }
}
