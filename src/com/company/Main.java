package com.company;

public class Main {

    public static void main(String[] args) {
	// Создать массив дробных (не целых) чисел размером 15 элементов и наполнить его положительными и отрицательными числами;
        //● Затем через цикл “for each” посчитать среднее арифметическое положительных чисел расположенных после первого
        // отрицательного числа и вывести его на экран (8,-2,-4,2,3,6)= 11/3
        //ДЗ на сообразительность:
        //● Вам необходимо написать следующий алгоритм сортировки массива по возрастанию: каждую итерацию выбирать
        // самый минимальный элемент и смещать его в начало. При этом каждую новую итерацию начинать сдвигаясь вправо,
        // то есть первый проход — с первого элемента, второй проход — со второго и т.д.
        //● И при каждой итерации распечатывать текущее состояние массива
        //Дедлайн 05.03.2021 23:49
        double[] anArrayOfDouble = new double[15];
        anArrayOfDouble[0] = 8;
        anArrayOfDouble[1] = -2;
        anArrayOfDouble[2] = -4;
        anArrayOfDouble[3] = 2;
        anArrayOfDouble[4] = 3;
        anArrayOfDouble[5] = 6;


//          цикл for
//        for (int i = 0; i < anArrayOfDouble.length; i++) {
//            System.out.print("["+anArrayOfDouble[i]+"]");
//        }

        double sum = 0;
        double average = 0;
        boolean isNegative = false;
        int count = 0;

        System.out.print("Array = { ");
        for (double i : anArrayOfDouble) {
            System.out.print(i + ", ");
            if (i < 0) {
                isNegative = true;
            } else if (isNegative && i > 1 ) {
                count++;
                sum = sum + i;
            }

        }
        average = sum / count;
        System.out.println("}");
        System.out.println("Кол-во положительных чисел после первого отрицательного: " + count);
        System.out.println("Сумма массива положительных чисел после первого отрицательного =  " + sum);
        System.out.println("Среднее арифметическое = " + average);
    }
}
