import javax.xml.crypto.Data;

public class Searching {
    Tentu Rama! 🔍 Yuk kita bahas **searching (pencarian data)** dalam struktur data.

---

## 📌 Apa Itu *Searching*?

**Searching** adalah proses mencari **data tertentu** di dalam sebuah struktur data (seperti array, list, dll).  
Contohnya: cari angka **90** di dalam array `{20, 40, 60, 90, 100}`.

---

## Jenis-Jenis Searching

### 1. **Linear Search** (Pencarian Linear)  
Cari satu per satu dari awal hingga akhir.  
➡ Cocok untuk data **acak** atau **tidak terurut**.

```java
public static int linearSearch(int[] data, int target) {
    for (int i = 0; i < data.length; i++) {
        if (data[i] == target) {
            return i; // ditemukan di indeks ke-i
        }
    }
    return -1; // tidak ditemukan
}
```

🧠 Contoh:
```java
int[] arr = {10, 30, 50, 20};
int index = linearSearch(arr, 20); // hasil: 3
```

---

### 2. **Binary Search** (Pencarian Biner)  
Cocok untuk data yang **sudah terurut**.  
➡ Prosesnya: bagi 2, cek tengah, lalu fokus ke kiri/kanan.

```java
public static int binarySearch(int[] data, int target) {
    int low = 0, high = data.length - 1;
    while (low <= high) {
        int mid = (low + high) / 2;
        if (data[mid] == target) {
            return mid;
        } else if (data[mid] < target) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return -1;
}
```

🧠 Contoh:
```java
int[] arr = {10, 20, 30, 40, 50};
int index = binarySearch(arr, 40); // hasil: 3
```

---

## 🔎 Perbandingan

| Algoritma        | Syarat Data      | Kecepatan Worst-case | Cocok untuk           |
|------------------|------------------|------------------------|------------------------|
| Linear Search     | Tidak harus urut | O(n)                  | Data acak / kecil      |
| Binary Search     | Harus urut       | O(log n)              | Data besar & terurut   |

---

Kalau kamu mau, aku bisa buatin contoh **searching nama mahasiswa** atau **cari jadwal kuliah berdasarkan hari** dari data yang kamu punya juga. Mau? 😄
}
