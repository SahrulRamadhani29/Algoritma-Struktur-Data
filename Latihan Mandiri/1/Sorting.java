import java.util.Arrays;

public class Sorting {

//### 1. 🫧 **Bubble Sort**

for (int i = 0; i < data.length - 1; i++) {
    for (int j = 0; j < data.length - 1 - i; j++) {
        if (data[j] > data[j + 1]) {
            int temp = data[j];
            data[j] = data[j + 1];
            data[j + 1] = temp;
        }
    }
}

//### 2. 🎯 **Selection Sort**

for (int i = 0; i < data.length - 1; i++) {
    int minIndex = i;
    for (int j = i + 1; j < data.length; j++) {
        if (data[j] < data[minIndex]) {
            minIndex = j;
        }
    }
    int temp = data[i];
    data[i] = data[minIndex];
    data[minIndex] = temp;
}

//### 3. 🃏 **Insertion Sort**

for (int i = 1; i < data.length; i++) {
    int key = data[i];
    int j = i - 1;
    while (j >= 0 && data[j] > key) {
        data[j + 1] = data[j];
        j--;
    }
    data[j + 1] = key;
}


//### 4. ⚡ **Quick Sort** *(pakai rekursi dan pivot)*

static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
        int pi = partition(arr, low, high);
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}

static int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = (low - 1);
    for (int j = low; j < high; j++) {
        if (arr[j] < pivot) {
            i++;
            int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
        }
    }
    int temp = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = temp;
    return i + 1;
}

///### 5. 🧬 **Merge Sort** *(rekursif & gabungkan hasil pecahan)*

static void mergeSort(int[] arr, int left, int right) {
    if (left < right) {
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }
}

static void merge(int[] arr, int left, int mid, int right) {
    int[] leftArray = Arrays.copyOfRange(arr, left, mid + 1);
    int[] rightArray = Arrays.copyOfRange(arr, mid + 1, right + 1);
    int i = 0, j = 0, k = left;
    while (i < leftArray.length && j < rightArray.length) {
        if (leftArray[i] <= rightArray[j]) {
            arr[k++] = leftArray[i++];
        } else {
            arr[k++] = rightArray[j++];
        }
    }
    while (i < leftArray.length) arr[k++] = leftArray[i++];
    while (j < rightArray.length) arr[k++] = rightArray[j++];
}