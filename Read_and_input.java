/*Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму. 
Пример 1: а = 3, b = 2, ответ: 9 
Пример 2: а = 2, b = -2, ответ: 0.25
Пример 3: а = 3, b = 0, ответ: 1
Пример 4: а = 0, b = 0, ответ: не определено
Пример 5
входные данные находятся в файле input.txt в виде
b 3
a 10
Результат нужно сохранить в файле output.txt
1000*/

import java.io.*;
import java.util.stream.Collectors;

public class Read_and_input {

    String tempB;
    String tempA;
    int a;
    int b;

    public int inputReader(String variable) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String str;

        while ((str = br.readLine()) != null) {
            if (str.contains("a")) {
                tempA = str.chars()
                        .filter(c -> !Character.isLetter(c))
                        .mapToObj(c -> String.valueOf((char) c))
                        .collect(Collectors.joining())
                        .trim();

            } else if (str.contains("b")) {
                tempB = str.chars()
                        .filter(c -> !Character.isLetter(c))
                        .mapToObj(c -> String.valueOf((char) c))
                        .collect(Collectors.joining())
                        .trim();

            } else {
                System.out.println("Неверный формат!\n запишите в виде:\nb [число]\na [число]");
                break;
            }

        }
        br.close();

        if (variable == "a"){
            return a = Integer.parseInt(tempA);
        }else {
            return b = Integer.parseInt(tempB);
        }
    }

}