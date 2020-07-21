package Chapter10;

// Исключения
class ExampleException {
    public static void main (String[] args) {
        try { // Отслеживаем код с возможной ошибкой
            System.out.println("try {... Сгенерируем исключение NullPointerException()");
            throw new NullPointerException(); // Сгенерируем исключение
        } catch (NullPointerException e1) { // Перехватим исключение
            System.out.println("catch() {... Перхватываем и Выводим исключение: " + e1);

            try { // Вложенный блок try
                System.out.println("\ttry {... Сгенерируем исключение SecurityException()");
                throw new SecurityException(); // Сгенерируем исключение
            } catch (Exception e2) { // Перехватим исключение
                System.out.println("\tcatch() {... Перхватываем и Выводим исключение: " + e2);
            }

         } finally { // Выполнить в любом случае после try/catch
            System.out.println("finally {... Этот блок кода выполняется в любом случае после try/catch");
        }
     }
}
/* ----------------------------------------------------------------------------
try {... Сгенерируем исключение NullPointerException()
catch() {... Перхватываем и Выводим исключение: java.lang.NullPointerException
	try {... Сгенерируем исключение SecurityException()
	catch() {... Перхватываем и Выводим исключение: java.lang.SecurityException
finally {... Этот блок кода выполняется в любом случае после try/catch
 */