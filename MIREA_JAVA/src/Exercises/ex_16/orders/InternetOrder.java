package Exercises.ex_16.orders;

import Exercises.ex_16.items.Item;

public class InternetOrder implements Order {
    private  int size = 0;
    private DobleLinked<Item> first = null;
    public boolean Add_item(Item item)
    {
        if(first == null) {
            first = new DobleLinked<Item>();
            first.setCurrent(item);
            first.setPrev(first);
            first.setNext(first);
            size++;
        }
        else
        {
            DobleLinked<Item> last = first.getPrev();
            DobleLinked<Item> second = new DobleLinked<>();
            second.setCurrent(item);
            second.setNext(first);
            second.setPrev(last);
            first.setPrev(second);
            last.setNext(second);
            size++;
        }
        return true;
    }
    public InternetOrder(Item[] items)
    {
        for(int i = 0; i < items.length; i++)
        {
            Add_item(items[i]);
        }
    }
    public boolean Remove_item(String item_name)
    {
        if(first.getCurrent().getName() == item_name)
        {
            first.getNext().setPrev(first.getPrev());
            first.getPrev().setNext(first.getNext());
            first = first.getNext();
            return true;
        }
        DobleLinked<Item> temp = first.getNext();
        for(int i = 0; i < size; i++)
        {
            if(temp.getCurrent().getName() == item_name)
            {
                temp.getPrev().setNext(temp.getNext());
                temp.getNext().setPrev(temp.getPrev());
                temp = temp.getNext();
                size--;
                return true;
            }
        }
        if(size == 1 && temp.getCurrent().getName() == item_name)
        {
            size = 0;
            first = null;
            return true;
        }
        return false;
    }
    public int Remove_item_all(String item_name)
    {
        int freq = 0;
        if(first.getCurrent().getName() == item_name)
        {
            first.getNext().setPrev(first.getPrev());
            first.getPrev().setNext(first.getNext());
            first = first.getNext();
            freq++;
        }
        DobleLinked<Item> temp = first.getNext();
        for(int i = 0; i < size; i++)
        {
            if(temp.getCurrent().getName() == item_name)
            {
                temp.getPrev().setNext(temp.getNext());
                temp.getNext().setPrev(temp.getPrev());
                temp = temp.getNext();
                size--;
                freq++;
            }
        }
        if(size == 1 && temp.getCurrent().getName() == item_name)
        {
            size = 0;
            first = null;
            freq++;
        }
        return freq;
    }

    public int getSize() {
        return size;
    }
    public Item[] getItems()
    {
        Item[] items = new Item[size];
        DobleLinked<Item> temp = first;
        for(int i = 0; i < size; i++)
        {
            items[i] = first.getCurrent();
            first = first.getNext();
        }
        return items;
    }
    public double costTotal()
    {
        Item[] items = getItems();
        double sum = 0;
        for(int i = 0; i < items.length; i++)
            sum+=items[i].getCost();
        return sum;
    }
    public int itemQuantaty(String item_name) {
        Item[] items = getItems();
        int all = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].getName() == item_name)
                all++;
        }
        return all;
    }
}
