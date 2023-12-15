//package ex2;
///*
//В классе MyQueue реализуйте очередь для типа данных Integer с помощью LinkedList
//со следующими методами:
//
//enqueue() - помещает элемент в конец очереди
//dequeue() - возвращает первый элемент из очереди и удаляет его
//first() - возвращает первый элемент из очереди, не удаляя
//getElements() - возвращает все элементы в очереди
// */
//
///*
//Идеальное решение
// */
////class MyQueueInt {
////    private LinkedList<Integer> elements = new LinkedList<>();
////
////    public void enqueue(int element) {
////        elements.add(element);
////    }
////
////    public int dequeue() {
////        return elements.removeFirst();
////    }
////
////    public int first() {
////        return elements.getFirst();
////    }
////
////    public LinkedList<Integer> getElements() {
////        return elements;
////    }
////}
//
///*
//Идеальное решение
// */
//import java.util.LinkedList;
//import java.util.Queue;
//
//class MyQueue<Integer> {
//    // Напишите свое решение ниже
//LinkedList<Integer> list = new LinkedList<>();
//    public void enqueue(Integer element){
//        // Напишите свое решение ниже
//        list.add(list.size(), element);
//    }
//
//    public Integer dequeue(){
//        // Напишите свое решение ниже
//return list.pop();
//    }
//
//    public Integer first(){
//        // Напишите свое решение ниже
//return list.get(0);
//    }
//
//    public LinkedList<Integer> getElements() {
//        // Напишите свое решение ниже
//        return list;
//
//    }
//}
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//public class Printer {
//    public static void main(String[] args) {
//        MyQueue<Integer> queue;
//        queue = new MyQueue<>();
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            queue.enqueue(1);
//            queue.enqueue(10);
//            queue.enqueue(15);
//            queue.enqueue(5);
//        } else {
//            queue.enqueue(Integer.parseInt(args[0]));
//            queue.enqueue(Integer.parseInt(args[1]));
//            queue.enqueue(Integer.parseInt(args[2]));
//            queue.enqueue(Integer.parseInt(args[3]));
//        }
//
//        System.out.println(queue.getElements());
//
//        queue.dequeue();
//        queue.dequeue();
//        System.out.println(queue.getElements());
//
//        System.out.println(queue.first());
//    }
//}