## 鏈表(Linked List)  
![image1](image/linkedlist1.png)
1. 鏈表是以節點方式儲存，鏈式儲存  
2. 每個節點包含data域、next域(指向下一個節點)  
3. 鏈表的各個節點 **不一定是連續的**  
4. 鏈表有分：帶頭節點、不帶頭節點  
#### 單鏈表(帶頭節點)  
![image2](image/linkedlist2.png)  
1. 單鏈表應用實例  
有個場景：使用帶頭(head)的單向鏈表，實現傳說對決英雄排行  
    * 完成對英雄人物的 **增刪改查**  
    * 添加英雄時，可以選擇直接添加志尾部或根據排行添加  
2. 實現  
    * [SingleLinkedList](SingleLinkedList.java)  
#### 雙向鏈表  
1. 單向鏈表的缺點  
    * 查找元素時，只能單向進行  
    * 不能自我刪除節點，需找到上一節點才能完成刪除  
2. 雙向鏈表能雙向查找、能自我刪除節點  
3. 雙向鏈表修改處  
    * 每個節點新增`pre`去紀錄上個節點  
    * 查找方式可**向前**或**向後**  
    * 可自刪節點  
4. 實現  
    * [DoubleLinkedList](DoubleLinkedList.java)  
