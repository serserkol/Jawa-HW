public class MyLinkedList {

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

    public boolean hasLoop() {
        Link slow = head;
        Link fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; // Обнаружена петля
            }
        }

        return false; // Петли не найдено
    }

    // ... (другие методы класса)
}
