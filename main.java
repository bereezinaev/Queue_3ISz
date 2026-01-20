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