import java.util.Scanner;
import java.util.Arrays;

public class Main
{
    public static int nextPermutation(int num) 
    {
        char[] numArray = Integer.toString(num).toCharArray();
        int i = numArray.length - 2;
        
        while (i >= 0 && numArray[i] >= numArray[i + 1]) 
        {
            i--;
        }
        if (i == -1) 
        {
            return -1; // Если не найдено такой пары, возвращаем -1 (нет следующей перестановки)
        }

        int j = numArray.length - 1;
        while (numArray[j] <= numArray[i]) 
        {
            j--;
        }

        // Меняем местами числа
        char temp = numArray[i];
        numArray[i] = numArray[j];
        numArray[j] = temp;

        // Переворачиваем оставшуюся часть числа
        Arrays.sort(numArray, i + 1, numArray.length);

        int result = Integer.parseInt(new String(numArray));
        return result;
    }

  public static void main(String[] args) 
  {
      Scanner console = new Scanner(System.in);
      System.out.println("Введите число: ");
      int number = console.nextInt();
        int result = nextPermutation(number);
        System.out.println("Следующее большее число, которое можно составить: " + result);
  }
}