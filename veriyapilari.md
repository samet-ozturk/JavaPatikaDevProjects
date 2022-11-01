---Insertion Sort---
1.Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.
[22, 27, 16, 2, 18, 6] - n
[2, 27, 16,22, 18, 6] - n-1
[2,6, 16, 22, 18, 27] - n-2
[2,6, 16,18, 22, 27] - n-3


2. Big-O gösterimini yazınız.

(n*(n+1)/2) = (n^2 + n)/2 = n^2/2 + n/2

O(n^2)

[7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.

1. 22|,27,16,2,18,6
2. 22,27|,16,2,18,6
3. 22,16,27|,2,18,6
4. 16,22,27|,2,18,6
5. 16,22,2,27|,18,6
6. 16,2,22,27|,18,6
7. 2,16,22,27|,18,6
8. 2,16,22,18,27|,6

4. Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer?
  Average Case
  
  ----Merge Sort---
  [16,21,11,8,12,22] -> Merge Sort
  1.Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.
  Divide -1  [16,21,11] [8,12,22]
  Divide -2  [16] [21,11] [8] [12,22]
  Divide -3  [16] [21] [11] [8] [12] [22]
  Merge -1  [16] [11,21] [8] [12,22]
  Merge -2  [11,16,21] [8,12,22]
  Merge -3  [8,11,12,16,21,22]
  
  2. Big-O gösterimini yazınız.
  O(nlogn)
  
  ------Binary Search Tree------
  
  [7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary-Search-Tree aşamalarını yazınız.
  
  7
  
     7
  /
 5 
 
 
     7
   /
  5
 /
1 


    7
   / \
  5   8
 /
1 

      7
     / \
    5   8
   / \
  1   6
 / \
0   3

      7
     / \
    5   8
   / \   \
  1   6   9
 / \
0   3
     \
      4
      
      
      7
     / \
    5   8
   / \   \
  1   6   9
 / \
0   3
   / \
  2   4
  
  
  
  
