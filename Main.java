package Java.h_w_4.work;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
        LinkedList<String> data = new LinkedList<>();
        Collection<String> dataColl = new ArrayList<String>();
        dataColl.add("Ваш заказ принят!");
        dataColl.add("Калифорния");
        dataColl.add("Унаги");
        dataColl.add("Кани маки");
        dataColl.add("Акита");
        data.addAll(dataColl);

        System.out.println("Ответ на задание 1: " + h_w_4.task1(data));
        System.out.println("Ответ на задание 2: ");
        h_w_4.task2(data);

        System.out.println("Ответ на задание 3: ");
        h_w_4.task3(data);
    }
}
