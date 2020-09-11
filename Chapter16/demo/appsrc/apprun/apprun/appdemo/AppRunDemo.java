package Chapter16.demo.appsrc.apprun.apprun.appdemo;

import Chapter16.demo.appsrc.appfunc.appfunc.simplefunc.SimpleMathFuncs;

// Продемонстрировать простое модульное приложение
public class AppRunDemo {
    public static void main(String[] args) {
        System.out.println("Число (2) является множителем числа (10): " + SimpleMathFuncs.isFactor(2, 10));
        System.out.println("Число (3) является множителем числа (10): " + SimpleMathFuncs.isFactor(3, 10));
        System.out.println("Haимeньший общий множитель чисел (35) и (105): " + SimpleMathFuncs.lcf(35, 105));
        System.out.println("Haибoльший общий множитель чисел (35) и (105): " + SimpleMathFuncs.hcf(35, 105));
    }
}
/*
Число (2) является множителем числа (10): true
Число (3) является множителем числа (10): false
Haимeньший общий множитель чисел (35) и (105): 5
Haибoльший общий множитель чисел (35) и (105): 7
 */