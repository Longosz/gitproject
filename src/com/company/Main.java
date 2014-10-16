package com.company;

public class Main {
    public static void main(String[] args) {
        class Box<T> {
            private T t;

            public void add(T t) {
                this.t = t;
            }

            public T get() {
                return t;
            }
        }
        class BoxDemo3 {
            private void main(String[] args) {
                Box<Integer> integerBox;
                integerBox = new Box<Integer>();
                integerBox.add(new Integer(10));
                Integer someInteger = integerBox.get();
                System.out.println(someInteger);
            }
        }
    }
}
