import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array_size = 0, array[];

        System.out.print("Введите размерность массива: ");
        while (true) try {
            array_size = Integer.parseInt(in.next());
            array = new int[array_size];
                break;
        } catch (NegativeArraySizeException ex) {
            System.out.println("Число должно быть положительным. Попробуйте снова. ");
        }catch (NumberFormatException e) {
            System.out.println("Что-то не так. Попробуйте снова.");
        }

        for(int i=0; i < array_size; i++) {
            while (true) {
                System.out.print("Введите " + i + " элемент массива: ");
                try {
                    array[i] = Integer.parseInt(in.next());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Что-то не так. Попробуйте снова.");
                }
            }
        }
        System.out.print("Изначальный массив: ");
        for(int elem : array) {
            System.out.print(elem + " ");
        }
        for(int j = 0; j < array_size / 2; j++) {
            int tmp = array[j];
            array[j] = array[array_size - 1 - j];
            array[array_size - 1 - j] = tmp;
        }

        System.out.print("Итог: ");
        for(int elem : array)
            System.out.print(elem + " ");

        in.close();
    }
}