package blockMethods;

public class Task2 {


    //Функція має повернути вашу строку(str)
    public String reverseString(String str) {

        String reversedStr = "";

        for (int i = 0; i < str.length(); i++) {
            reversedStr = str.charAt(i) + reversedStr;

        }




        return reversedStr;
    }

}
