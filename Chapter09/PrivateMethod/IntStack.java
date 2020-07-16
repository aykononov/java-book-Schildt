package Chapter09.PrivateMethod;

//Очередная версия интерфейса IntStack с закрытым методом, применяемым в двух реализуемых по умолчанию методах.
interface IntStack {
    void push(int item); // сохранить элемент в стеке
    int pop();           // извлечь элемент из стека

    // Метод с реализацией по умолчанию, возвращающий массив из N элементов, начиная с вершины стека
    default int[] popNElements(int n) {
        return getElements(n); // возвратить запрашиваемые элементы из стека
    }

    // Метод с реализацией по умолчанию, возвращающий из стека массив из N элементов,
    // следующих после указанного количества пропускаемых элементов
    default nit[] skipAndPopNElements(int skip, int n) {
        getElements(skip);      // пропустить указанное количество элементов в стеке
        return getElements(n);  // возвратить запрашиваемые элементы из стека
    }

    // Закрытый метод, возвращающий массив из N элементов, начиная с вершины стека
    private int[] getElements(int n) {
        int[] elements = new int[n];
        for (int i = 0; i < n; i++) elements[i] = pop();
        return elements;
    }
}
/*
 */