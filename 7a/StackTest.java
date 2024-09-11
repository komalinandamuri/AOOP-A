public class StackTest {
    public static void main(String[] args) {
        // Test with integers
        Stack<Integer> intStack = new LinkedListStack<>();
        intStack.push(10);
        intStack.push(20);
        System.out.println("Peek: " + intStack.peek()); // Output: 20
        System.out.println("Pop: " + intStack.pop());   // Output: 20
        System.out.println("Is empty: " + intStack.isEmpty()); // Output: false

        // Test with strings
        Stack<String> stringStack = new ArrayStack<>(5);
        stringStack.push("Hello");
        stringStack.push("World");
        System.out.println("Peek: " + stringStack.peek()); // Output: World
        System.out.println("Pop: " + stringStack.pop());   // Output: World
        System.out.println("Is empty: " + stringStack.isEmpty()); // Output: false
    }

    // Stack interface with generic type T
    interface Stack<T> {
        void push(T element);
        T pop();
        T peek();
        boolean isEmpty();
    }

    // LinkedList-based stack implementation
    static class LinkedListStack<T> implements Stack<T> {
        private Node<T> head;

        private static class Node<T> {
            T data;
            Node<T> next;

            Node(T data) {
                this.data = data;
            }
        }

        @Override
        public void push(T element) {
            Node<T> newNode = new Node<>(element);
            newNode.next = head;
            head = newNode;
        }

        @Override
        public T pop() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            T data = head.data;
            head = head.next;
            return data;
        }

        @Override
        public T peek() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            return head.data;
        }

        @Override
        public boolean isEmpty() {
            return head == null;
        }
    }

    // Array-based stack implementation
    static class ArrayStack<T> implements Stack<T> {
        private T[] elements;
        private int size;

        @SuppressWarnings("unchecked")
        public ArrayStack(int capacity) {
            elements = (T[]) new Object[capacity];
        }

        @Override
        public void push(T element) {
            if (size == elements.length) {
                throw new IllegalStateException("Stack is full");
            }
            elements[size++] = element;
        }

        @Override
        public T pop() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            return elements[--size];
        }

        @Override
        public T peek() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            return elements[size - 1];
        }

        @Override
        public boolean isEmpty() {
            return size == 0;
        }
    }
}
