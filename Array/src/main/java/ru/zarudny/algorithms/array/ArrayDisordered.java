package ru.zarudny.algorithms.array;

public class ArrayDisordered extends AbstractArray {

  public ArrayDisordered(int arraySize) {
    super(arraySize);
  }

  public void bubbleSort() {
    int out, in;
    for (out = countElements - 1; out > 1; out--) {
      for (in = 0; in < out; in++) {
        if (array[in] > array[in + 1]) {
          swap(in, in + 1);
        }
      }
    }
  }

  public void selectionSort() {
    int out, in, min;
    for (out = 0; out < countElements - 1; out++) {
      min = out;
      for (in = out + 1; in < countElements; in++) {
        if (array[in] < array[min]) {
          min = in;
        }
        swap(out, min);
      }
    }
  }

  public void insertionSort() {
    int in, out;
    for(out = 1; out < countElements; out++) {
      long temp = array[out];
      in = out;
      while(in > 0 && array[in - 1] >= temp) {
        array[in] = array[in - 1];
        --in;
      }
      array[in] = temp;
    }
  }

  private void swap(int one, int two) {
    long temporary = array[one];
    array[one] = array[two];
    array[two] = temporary;
  }
}
