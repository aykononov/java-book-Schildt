package Chapter18.Package02;

// Продемонстрировать применение метода ехес() для  запуска приложения Notepad в Windows
class ExecNotepad {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try {
            p = r.exec("Notepad");
            p.waitFor(); // Ожидать завершения работы  запущенного процесса.
        } catch (Exception e) {
            System.out.println(e.getMessage() + "\nOшибкa запуска Notepad!!!");
        }
        System.out.println("Peдaктop Notepad возвратил: " + p.exitValue());
    }
}
/* --------------------------
Peдaктop Notepad возвратил 0

 */