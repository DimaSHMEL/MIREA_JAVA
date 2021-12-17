package Exercises.ex_16.orders;

import Exercises.ex_16.items.Item;

public interface Order {
    boolean Add_item(Item item);
    boolean Remove_item(String item_name);
    int Remove_item_all(String item_name);
    Item[] getItems();
    double costTotal();
    int itemQuantaty(String item_name);
}
