## 查找(Searching)  
#### 二分查找(Binary Search)  
1. 問題：給定**有序數組**，返回查找值得所有index  
2. 實現：[BinarySearch](BinarySearch.java)  
#### 插值查找(Interpolation search)  
1. 思路：類似二分查找，但 mid 值使用以下公式  
    `mid = low + (high - low) * (key -arr[low]) / (arr[high] - arr[low])`  
2. 實現：[InterpolationSearch](InterpolationSearch.java)  
