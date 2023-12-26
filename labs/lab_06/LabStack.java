// package source.lab_06;

import java.util.EmptyStackException;

public class LabStack {
    private int[] stackArray;
    private int currentSize;

    // Конструктор стека
    public LabStack() {
        this.stackArray = new int[0];
        this.currentSize = 0;
    }

    // Добавление элемента в стек
    public void push(int value) {
        int[] newStack = new int[currentSize + 1];
        System.arraycopy(stackArray, 0, newStack, 0, currentSize);
        newStack[currentSize] = value;
        stackArray = newStack;
        currentSize++;
    }

    public int pop() {
        if (currentSize == 0) {
            throw new EmptyStackException();
        }
        int[] newStack = new int[currentSize - 1];
        System.arraycopy(stackArray, 0, newStack, 0, currentSize - 1);
        int poppedValue = stackArray[currentSize - 1];
        stackArray = newStack;
        currentSize–;
        return poppedValue;
    }

    public int peek() {
        if (currentSize == 0) {
            throw new EmptyStackException();
        }
        return stackArray[currentSize - 1];
    }

    public boolean isEmpty() {
        return (currentSize == 0);
    }

    public int size() {
        return currentSize;
    }