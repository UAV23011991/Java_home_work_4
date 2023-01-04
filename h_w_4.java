package Java.h_w_4.work;

import java.util.LinkedList;

public class h_w_4 {
    
    /*
    Пусть дан LinkedList с несколькими элементами. 
    Реализуйте метод, который вернет “перевернутый” список.
    */

    static LinkedList task1(LinkedList<String> input) {
        LinkedList<String> output = new LinkedList<String>();
        for (int i = input.size() - 1; i >= 0; i--) {
            output.add(input.get(i));
        }
        return output;
    }

    /* В шаблоне MyStack с урока реализовать методы. */

    static void task2(LinkedList<String> input) {
        MyStack.push(input, "К оплате: 1000р.");
        System.out.print("Метод MyStack_push: ");System.out.println(input);
        String res = MyStack.peek(input);
        System.out.println("Метод MyStack_peek: " + res);
        res = MyStack.pop(input);
        System.out.print("Метод MyStack_pop: " + res); System.out.println(" | Popped LinkedList: " + input);
    }

    /* В шаблоне MyQueue с урока реализовать методы. */

    static void task3(LinkedList<String> input){
        MyQueue.add(input, "Заказ доставит: Максим.");
        System.out.print("Метод MyQueue_add: ");System.out.println(input);
        String res = MyQueue.top(input);
        System.out.println("Метод MyQueue_top: " + res);
        res = MyQueue.remove(input);
        System.out.print("Метод MyQueue_remove: " + res); System.out.println(" | Resulted LinkedList: " + input);

    }
}