package Exercises.ex_14;

import java.text.SimpleDateFormat;
import java.util.*;

public class ex_13_14 {
}
class Task_1
{
    private String Surname;
    SimpleDateFormat dateFormater = new SimpleDateFormat("HH:mm:ss dd-MM-yy");
    Calendar r_calendar = Calendar.getInstance();
    Calendar s_calendar = Calendar.getInstance();
    Date recived = new Date();
    Date sent = new Date();
    public Task_1()
    {
        recived.setDate(15);
        recived.setYear(2021);
        recived.setHours(0);
        recived.setMinutes(0);
        recived.setSeconds(0);
        r_calendar.set(2021, Calendar.NOVEMBER, 15, 0, 0, 0 );

    }
    public Task_1(String Name)
    {
        this();
        this.Surname = Name;

    }

    @Override
    public String toString() {
        return "Surname=" + Surname + "\n" +
                "recived= " + dateFormater.format(recived) + "\n"+
                "sent= " + dateFormater.format(sent) + "\n" +
                "r_calendar= " + dateFormater.format(r_calendar.getTime()) + "\n" +
                "s_calendar= " + dateFormater.format(s_calendar.getTime());
    }
}

class task_2 {
    Calendar calendar = Calendar.getInstance();
    SimpleDateFormat forma = new SimpleDateFormat("dd.MM.yyyy");

    public task_2() {
        Calendar calendar = Calendar.getInstance();
        Calendar user = Calendar.getInstance();
        System.out.println(forma.format(calendar.getTime()) + " " + forma.format(user.getTime()) );
        if(calendar.compareTo(user) > 0)
            System.out.println("Левая дата больше");
        else if(calendar.compareTo(user) == 0)
            System.out.println("Даты равны больше");
        else
            System.out.println("Правая дата больше больше");

    }

    public task_2(int year, int month, int day)
    {
        Calendar calendar = Calendar.getInstance();
        Calendar user = Calendar.getInstance();
        user.set(year, month, day);
        System.out.println(forma.format(calendar.getTime()) + " " + forma.format(user.getTime()) );
        if(calendar.compareTo(user) > 0)
            System.out.println("Левая дата больше");
        else if(calendar.compareTo(user) == 0)
            System.out.println("Даты равны");
        else
            System.out.println("Правая дата больше больше");

    }
}
class  Student
{
    private String name = "", Surname ="'";
    private Calendar birth = Calendar.getInstance();
    private SimpleDateFormat us = new SimpleDateFormat( "dd:MM:yy");
    public Student(String name, String Surname, int year, int month, int day)
    {
        this.Surname = Surname; this.name = name;
        this.birth.set(year, month - 1, day);
    }
     public void setformat(String form) {
         if (form == "short")
             us = new SimpleDateFormat( "dd.MM.yy");
         else if(form == "medium")
             us = new SimpleDateFormat( "d MMM yyyy");
         else
             us = new SimpleDateFormat( "d MMMMMMMMMM yyyy");
     }
    public String getdate()
    {
        return us.format(birth.getTime());
    }
    @Override
    public String toString() {
        return "name= " + name + '\n' +
                "Surname= " + Surname + '\n' +
                "birth= " + getdate();
    }
}
class task_4
{
    private Date date = new Date();
    private Calendar calendar =  Calendar.getInstance();
    private SimpleDateFormat forma = new SimpleDateFormat("HH:mm dd:MM:yyyy");
    public task_4()
    {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt(); int month = scan.nextInt(); int day = scan.nextInt();
        int hour = scan.nextInt(); int minutes = scan.nextInt();
        calendar.set(year, month-1, day, hour, minutes);
        date.setYear(year); date.setMonth(month-1); date.setDate(day);
        date.setHours(hour); date.setMinutes(minutes);
    }

    @Override
    public String toString() {
        return "date_DATE = " + forma.format(date) + "\n" +
                "data_CALENDER = " +forma.format( calendar.getTime()) + "\n";
    }
}

class task_5
{
   private ArrayList<Integer> arr = new ArrayList<>();
   private LinkedList<Integer> larr = new LinkedList<>();
   public  task_5()
   {
       long start_time = System.nanoTime();
       arr.add(1); arr.add(2); arr.add(3); arr.add(4); arr.add(5);
       Long estimated_time = System.nanoTime() - start_time;
       System.out.println("Time to insert 5 elemts in ArrayList " + estimated_time+ "ns");
       start_time = System.nanoTime();
       larr.add(1); larr.add(2); larr.add(3); larr.add(4); larr.add(5);
       estimated_time = System.nanoTime() - start_time;
       System.out.println("Time to insert 5 elemts in LinkedList " + estimated_time+ "ns \n");

       start_time = System.nanoTime();
       arr.remove(2);
       estimated_time = System.nanoTime() - start_time;
       System.out.println("Time to delete elemt in ArrayList " + estimated_time+ "ns ");
       start_time = System.nanoTime();
       larr.remove(2);
       estimated_time = System.nanoTime() - start_time;
       System.out.println("Time to delete elemt in LinkedList " + estimated_time+ "ns \n");

       start_time = System.nanoTime();
       arr.indexOf(4);
       estimated_time = System.nanoTime() - start_time;
       System.out.println("Time to finding elemt in ArrayList " + estimated_time+ "ns");
       start_time = System.nanoTime();
       larr.indexOf(4);
       estimated_time = System.nanoTime() - start_time;
       System.out.println("Time to finding elemt in LinkedList " + estimated_time + "ns \n");

   }
}