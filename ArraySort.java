public class ArraySort {

  // Returns a new array that is sorted
  static int[] reversed(int[] arr) {
    int[] newArr = new int[arr.length];
    int before = arr[0];
    
    for (int i = 1; i < arr.length; i++) {
      if (curr > i) {
        newArr[i - 1] = i;
        newArr[i] = curr;
      }

      curr = i;
    }
    
    return newArr;
  }

}

