package blockMethods;

import java.util.Arrays;

public class Task3 {
    //Тут йде ваш код, цю функцію будуть перевіряти тести
    //Тест для цього завдання знаходиться src/main/test/blockMethodsTests/Task3Test.java
    //Функція має повернути середнє значення чисел в массиві(res)
    public double averageArray(int[] arr) {
        double res = 0;

        for (int i = 0; i < arr.length; i++) {
            res += arr[i];

        }
        if (arr.length != 0) {
            res = res / arr.length;
        }


        return res;
    }
}
