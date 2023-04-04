//Пусть дан произвольный список целых чисел, удалить из него чётные числа


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class zad2 {
   public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Введите размер массива: ");
      int size = scanner.nextInt();
      
      Random random = new Random();
      
      List<Integer> numbers = new ArrayList<>();
      
      for (int i = 0; i < size; i++) {
          int randomNumber = random.nextInt(100); 
          numbers.add(randomNumber);
      }

      
      System.out.println("Исходный список: " + numbers);

     
      for (int i = 0; i < numbers.size(); i++) {
          if (numbers.get(i) % 2 == 0) { 
              numbers.remove(i); 
              i--; 
          }
      }

      
      System.out.println("Список без четных чисел: " + numbers);
   } 
}