## 稀疏數組(Sparse Array)和隊列(Queue)  
####一、稀疏數組(Sparse Array)  
1. 實際需求
![image1](image/sparsearray1.png)  
我們想要保存圖中2D-array的狀態，但array中太多不必要資訊(ex:0)，如果也把那些保存下來就太浪費資源了。  
2. 基本介紹  
定義：當數組中，大部分元素為0(或同一個值)，則可以用稀疏數組(sparse array)來保存。  
處理方法：  
    1. sparseArray[0] 紀錄數組有幾行(row)幾列(column)，有多少個值  
    2. 將不同元素值的 **行與列與值** 記錄在一個小規模的數組中，這小規模的數組就為*稀疏數組*  
    ![image2](image/sparsearray2.png)  
3. 實現  
程式：[SparseArray](SparseArray.java)  
結果：  
    ```
    原始二維數組
    0 0 0 0 0 0 0 0 0 0 0 
    0 0 1 0 0 0 0 0 0 0 0 
    0 0 0 2 0 0 0 0 0 0 0 
    0 0 0 0 0 0 0 0 0 0 0 
    0 0 0 0 0 0 0 0 0 0 0 
    0 0 0 0 0 0 0 0 0 0 0 
    0 0 0 0 0 0 0 0 0 0 0 
    0 0 0 0 0 0 0 0 0 0 0 
    0 0 0 0 0 0 0 0 0 0 0 
    0 0 0 0 0 0 0 0 0 0 0 
    0 0 0 0 0 0 0 0 0 0 0 
   
    二維數組轉稀疏數組
    11 11 2 
    1 2 1 
    2 3 2 
   
    稀疏數組轉二維數組
    0 0 0 0 0 0 0 0 0 0 0 
    0 0 1 0 0 0 0 0 0 0 0 
    0 0 0 2 0 0 0 0 0 0 0 
    0 0 0 0 0 0 0 0 0 0 0 
    0 0 0 0 0 0 0 0 0 0 0 
    0 0 0 0 0 0 0 0 0 0 0 
    0 0 0 0 0 0 0 0 0 0 0 
    0 0 0 0 0 0 0 0 0 0 0 
    0 0 0 0 0 0 0 0 0 0 0 
    0 0 0 0 0 0 0 0 0 0 0 
    0 0 0 0 0 0 0 0 0 0 0
    ```  


