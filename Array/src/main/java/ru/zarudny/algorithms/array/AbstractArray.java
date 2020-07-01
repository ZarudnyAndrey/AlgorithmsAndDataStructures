package ru.zarudny.algorithms.array;

public abstract class AbstractArray {

  protected int countElements;
  protected long[] array;

  protected AbstractArray(int arraySize) {
    array = new long[arraySize];
    countElements = 0;
  }

  public void insert(long value) {
    array[countElements] = value;
    countElements++;
  }

  public boolean delete(long value) {
    int j;
    for (j = 0; j < countElements; j++) {
      if (value == array[j]) {
        break;
      }
    }

    if (j == countElements) {
      return false;
    } else {
      for (int k = j; k < countElements - 1; k++) {
        array[k] = array[k + 1];
      }
      countElements--;
      return true;
    }
  }

  /**
   * LinearSearch
   *
   * @param searchKey
   * @return boolean
   */
  public Object search(long searchKey) {
    int j;
    for (j = 0; j < countElements; j++) {
      if (array[j] == searchKey) {
        break;
      }
    }

    if (j == countElements) {
      return false;
    } else {
      return true;
    }
  }

  public int size() {
    return countElements;
  }

  public void display() {
    for (int j = 0; j < countElements; j++) {
      System.out.print(array[j] + " ");
    }
    System.out.println("");
  }
}
