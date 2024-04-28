public class MyLinkedList_1 {

    private static class Link {
        private final int value; // Значение элемента
        private Link next; // Ссылка на следующий элемент

        public Link(int value) {
            this.value = value;
            this.next = null;
        }

        public Link(int value, Link next) {
            this.value = value;
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public Link getNext() {
            return next;
        }

        public boolean hasNext() {
            return next != null;
        }

        public void setNext(Link p) {
            this.next = p;
        }
    }

    private Link head = null; // Головной элемент списка

    // ... (другие методы класса)

    public int getValueFromTail(int positionFromTail) {
        if (positionFromTail < 0) {
            throw new IllegalArgumentException("Позиция должна быть неотрицательным числом");
        }

        Link slow = head;
        Link fast = head;

        // Перемещаем быстрый указатель на K позиций вперед
        for (int i = 0; i < positionFromTail; i++) {
            if (fast == null) {
                throw new IndexOutOfBoundsException("Список короче, чем " + positionFromTail + " элементов");
            }
            fast = fast.next;
        }

        // Перемещаем оба указателя до конца списка
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        if (slow == null) {
            throw new IndexOutOfBoundsException("Список короче, чем " + positionFromTail + " элементов");
        }

        return slow.value;
    }

    // ... (другие методы класса)
}
