import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class TOP20ForTest {

    @Test

    @DisplayName("Напишите программу на Java для переворачивания строки")
    @Description("изменив расположение символов в строке задом наперёд без использования встроенных в String функций")
    public void flippingLine() {
        // ITVDN.com 1 из ТОП 20 тестовых заданий на интервью для Java разработчика

        String st = "Задача1";

        StringBuilder stB = new StringBuilder();

        stB.append(st);

        stB.reverse();// используем StringBuilder для переворота строки

        System.out.println(stB);
    }

    @DisplayName("Напишите программу на Java для переворота последовательности символов")
    @Description("Без использования встроенной в String функции reverse()")
    @Test
    public void inverting_Sequence_Of_Characters() {
        //ITVDN.com 2 из ТОП 20 тестовых заданий на интервью для Java разработчика

        String st = "Учимся программировать";

        char[] symbols = st.toCharArray();  // конвертируем строку в массив символов, затем выводим символы на экран в обратном порядке

        for (int x = symbols.length - 1; x >= 0; x--) {

            System.out.print(symbols[x]);

        }
    }


    // ITVDN.com 2 из ТОП 20 тестовых заданий на интервью для Java разработчика
    @DisplayName("Напишите программу на Java для переворота последовательности символов")
    @Description("Без использования встроенной в String функции reverse()")
    @Test
    public void inverting_Sequence_Of_Characters2() {
        /*
         * Способ 2:
         * Это еще один способ выполнить задачу с переворотом последовательности символов в строке.
         * В этом способе вы объявляете строковую переменную st, а затем используете класс Scanner,
         * объявляя объект scannerQ для работы со стандартным потоком ввода данных.
         * В данном случае программа примет строковое значение через командную строку (при ее выполнении).
         * Далее мы использовали метод nextLine(), который прочитал нашу строку при вводе ее через консоль
         * с пробелами между словами строки. После этого мы использовали метод split() для разделения строки
         * на ее подстроки (здесь не указывается разделитель). Затем, мы выводим строку в обратном порядке,
         * используя цикл for.
         */

        // ITVDN.com 2 из ТОП 20 тестовых заданий на интервью для Java разработчика

        String st;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите вашу строку:");

        st = scanner.nextLine();

        String[] temp = st.split("");    //используем метод split для вывода строки в обратном порядке

        for (int x = temp.length - 1; x >= 0; x--) {

            System.out.print(temp[x]);

        }
    }


}
