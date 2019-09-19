package com.home_Hillel;

public class Main {

    public static void main(String[] args) {
        String str = " HelloWordToday ";
        String str2 = "HELLOWORDTODAY";

        for (int i = 0; i < str.length(); i++) {     //метод length определяет кол. символов
            //метод charAt разделяет символы
            print(str.charAt(i) + " - Это " + i + " символ");
        }

        //метод substring выводит текст с нужного символа (а если нужно ограничивает текст)
        print(str.substring(5, 9) + " - А это было " + str);//  HelloWordToday -> Word

        //метод split разделяет строку на основании заданного регулярного выражения
        String data = "10-09-2019";
        String[] dataSplit = data.split("-");
        print("Дата: " + dataSplit[0]);
        print("Месяц: " + dataSplit[1]);
        print("Год: " + dataSplit[2]);

        //метод contain говорит если тот или иной фрагмент в строке, выводя true или false
        boolean isContain = str.contains("Word");
        print(isContain + " - Ну как бы да, в" + str + "есть фрагмент " + str.substring(5, 9));

        //метод endWith проверяет, заканчивается ли строка суффиксом который вы указываете
        boolean isComEnding = str.endsWith("Today");
        print(isComEnding + " - как видим таки оно заканчивается с " + str.substring(9));

        //метод endWith проверяет, начинается ли строка суффиксом который вы указываете
        boolean isHello = str.startsWith("Hello");
        print(isHello + " - как видим таки оно начинается с " + str.substring(0, 5));
        boolean isWord = str.startsWith("Hello", 5);
        print(isWord + " - тоже самое, но проверяет с 5 индекса, ответ собственно false, а начинается <типо> с " + str.substring(5, 9));

        //метод indexOf находит указаный символ в строке
        int def = data.indexOf("-");
        print(data.substring(0, def) + " день " + data.substring(def+1));

        //метод toLowerCase все символы будут написаны нижним регистром
        print(str.toLowerCase());
        //метод toUpperCase все символы будут написаны верхним регистром
        print(str.toUpperCase());
        //метод trim отсекает пробелы по бокам от текста, если они есть
        str = str.trim();
        print(str);

        //метод equals сравнивает строки
        System.out.println(str.equals(str2) + " строки разные!");
        //метод equalsIsIgnoreCase возвращает значение true, если аргумент не равен null и строки равны, без учета регистра букв. Иначе false
        System.out.println(str.equalsIgnoreCase(str2) + " ну да они разные, но не в этом случаи");

        //метод format форматирует строку ...
        System.out.printf("%.9s%n", str);

        //метод lastIndexOf находит искомый символ в строке индексация с 0 идет
        System.out.println("По счету символ r - " + str.lastIndexOf('r'));

        //метод isEmpty проверяет пустая ли строка
        System.out.println("Так как строка не пустая, то ответ - " + str.isEmpty());

        //метод valueOf возвращает строковое представление переданного аргумента
        char[] test = { 'H', 'e', 'l', 'l', 'o'};
        print("Преобразуем из char в String - " + String.valueOf(test));

        //метод replace меняет символ в строке на заданный
        print("В слове Word поменяли W на М - " + str.replace('W', 'М'));
    }
    private static void print (String s){
        System.out.println(s);
    }
}
