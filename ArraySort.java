public class ArraySort {

  // Returns array that is sorted
  static int[] sort(int[] arr) {
    if (arr.length <= 1) {
      return arr;
    }

    int before = arr[0];
    
    for (int i = 1; i < arr.length; i++) {
      if (before > i) {
        arr[i - 1] = arr[i];
        arr[i] = before;
      }

      before = i;
    }
    
    return arr;
  }

}

