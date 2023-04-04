//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.


import java.util.ArrayList;
import java.util.Scanner;


public class zad3 {
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
         System.out.print("Введите размер списка: ");
         int size = scanner.nextInt();
 
         
         ArrayList<Integer> list = new ArrayList<Integer>();
         for (int i = 0; i < size; i++) {
             int number = (int) (Math.random() * 100);
             list.add(number);
         }
 
         
         System.out.println("Список: " + list);
 
         
         int min = list.get(0);
         for (int i = 1; i < list.size(); i++) {
             if (list.get(i) < min) {
                 min = list.get(i);
             }
         }
         System.out.println("Минимальное значение: " + min);
 
         
         int max = list.get(0);
         for (int i = 1; i < list.size(); i++) {
             if (list.get(i) > max) {
                 max = list.get(i);
             }
         }
         System.out.println("Максимальное значение: " + max);
 
         
         int sum = 0;
         for (int i = 0; i < list.size(); i++) {
             sum += list.get(i);
         }
         double avg = (double) sum / list.size();
         System.out.println("Среднее значение: " + avg);
    }
}