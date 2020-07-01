package ru.zarudny.algorithms.array;

public class ArrayOrdered extends AbstractArray {

  public ArrayOrdered(int arraySize) {
    super(arraySize);
  }

  @Override
  public void insert(long value) {
    int j;
    for (j = 0; j < countElements; j++) {
      if (array[j] > value) {
        break;
      }
    }

    for (int k = countElements; k > j; k--) {
      array[k] = array[k - 1];
    }
    array[j] = value;
    countElements++;
  }

  @Override
  public boolean delete(long value) {
    int j = (int) search(value);
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
   * BinarySearch
   *
   * @param searchKey
   * @return int (index)
   */
  @Override
  public Object search(long searchKey) {
    int lowerBound = 0;
    int upperBound = countElements - 1;
    int currentIndex;

    while (true) {
      currentIndex = (lowerBound + upperBound) / 2;

      if (array[currentIndex] == searchKey) {
        return currentIndex;
      } else if (lowerBound > upperBound) {
        return countElements;
      } else {
        if (array[currentIndex] < searchKey) {
          lowerBound = currentIndex + 1;
        } else {
          upperBound = currentIndex - 1;
        }
      }

    }
  }
}
