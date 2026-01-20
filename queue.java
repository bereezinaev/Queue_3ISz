import java.util.LinkedList;

public class SimpleQueue<T> {
    private LinkedList<T> list = new LinkedList<>();

    // Добавление элемента в конец очереди
    public void add(T element) {
        list.addLast(element);
    }

    // Извлечение и удаление первого элемента очереди
    public T remove() {
        return list.removeFirst();
    }

    // Проверка наличия элементов в очереди
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Получение размера очереди
    public int size() {
        return list.size();
    }

    // Преобразование очереди в строку
    @Override
    public String toString() {
        return list.toString();
    }
}

// Пример использования:
public class Main {
    public static void main(String[] args) {
        SimpleQueue<String> queue = new SimpleQueue<>();
        queue.add("Первый");
        queue.add("Второй");
        queue.add("Третий");

        System.out.println(queue); // вывод всех элементов очереди
        System.out.println("Удалили: " + queue.remove());
        System.out.println("Очередь после удаления: " + queue);
    }
}