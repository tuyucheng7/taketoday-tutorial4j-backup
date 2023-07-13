## 1. 树简介

树是一种广泛使用的数据结构，本质上是非线性的。与其他线性数据结构(如数组、栈、队列和链表等)不同。
树的排序信息并不重要。树包含节点和两个指针。这两个指针是父节点的左子节点和右子节点。让我们详细了解树相关的术语。

+ 根节点：树的根是没有父节点的树的最顶层节点。每个树中只有一个根节点。
+ 边：边充当父节点和子节点之间的链接。
+ 叶节点：没有子节点的节点称为叶子节点。它是树的最后一个节点。一棵树中可以有多个叶子节点。
+ 节点的深度：节点的深度是从根节点到该特定节点的距离。
+ 节点的高度：节点的高度是从该节点到树的最深节点的距离。
+ 树的高度：树的高度是任何节点的最大高度。

```
      tree
      ----
       j    <-- root
     /   
    f      k  
  /         
 a     h      z    <-- leaves
```

## 2. 为什么要使用树？

1. 使用树的一个原因可能是因为你想要存储自然形成层次结构的信息。例如计算机上的文件系统：

```
file system
-----------
      /    <-- root
   /     
...      home
       /      
   ugrad     course
    /      /   |    
  ...    cs101 cs112 cs113
```

2. 树(有一些排序的树，例如BST)提供适度的访问/搜索(比链表快，比数组慢)时间。
3. 树提供适度的插入/删除(比数组快，比无序链表慢)时间。
4. 与链表一样，树节点的数量没有上限，因为节点是使用指针链接的。

树的主要应用包括：

1. 处理分层数据。
2. 使信息易于搜索(参见树的遍历)。
3. 操作已排序的数据列表。
4. 作为合成数字图像以获得视觉效果的工作流。
5. 路由算法。
6. 多阶段决策的形式。

## 3. 二叉树表示

每个节点最多有两个子节点的树称为二叉树。由于二叉树中的每个节点只能有2个子节点，因此我们通常将它们命名为left和right子节点。

树由指向树中最顶层节点(root)的指针表示。如果树为空，则root的值为null。

树节点包含以下部分：

1. 数据
2. 指向左子节点的指针
3. 指向右子节点的指针

在Java及相关面向对象的语言中，我们可以使用类表示树的节点。在C中，我们可以使用结构体。

## 4. 二叉树的基本操作

+ 插入元素
+ 删除元素
+ 搜索元素
+ 遍历元素。二叉树中存在三种类型的遍历，这会在后面讨论。

二叉树上的辅助操作：

+ 查找树的高度
+ 查找树的层级
+ 查找整个树的大小

二叉树的应用：

+ 在编译器中，使用了表达式树，这是二叉树的一个应用。
+ 霍夫曼编码树用于数据压缩算法。
+ Priority Queue是二叉树的另一种应用，用于在O(logN)时间内搜索最大值或最小值。

二叉树遍历：

+ 前序遍历：遍历顺序是root => left => right。这意味着首先遍历根节点，然后是其左子节点，最后是右子节点。
+ 中序遍历：遍历顺序是left => root => right。这意味着首先遍历左子节点，然后是根节点，最后是右子节点。
+ 后序遍历：遍历顺序是left => right => root。这意味着首先遍历左子节点，然后是右子节点，最后是根节点。

让我们用这三种遍历方法遍历以下树：

```
Tree
________________

         1   //Root Node
        / 
       2    3
      /   / 
     4  5  6  7  //Leaf Nodes
```

上述树的前序遍历：1-2-4-5-3-6-7

上述树的中序遍历：4-2-5-1-6-3-7

上述树的后序遍历：4-5-2-6-7-3-1

下面是Java中节点Node类的表示，key表示节点包含的数据。left和right字段分别表示该节点的左子节点和右子节点。

```java
public class Node {
    int key;
    Node left;
    Node right;

    public Node(int key) {
        this.key = key;
        left = null;
        right = null;
    }
}
```

让我们创建一个有4个节点的简单树。创建的树将如下所示：

```
      tree
      ----
       1    <-- root
     /   
    2     3  
   /   
  4
```

```java
// 一个介绍二叉树的Java程序
class BinaryTree {
    Node root; // 二叉树的根节点

    BinaryTree(int key) { // 构造方法, 初始化一个根节点的值为key的二叉树。
        root = new Node(key);
    }

    BinaryTree() {
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        // 创建根节点
        tree.root = new Node(1);
        / 以下是执行上述语句之后的树
        
              1
            /   
          null  null  
        /
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
 
        / 2和3成为1的左右子节点
        
                 1
              /     
            2        3
          /        /  
        null null null null  
        /

        tree.root.left.left = new Node(4);
        / 4成为2的左子节点
        
                   1
               /       
              2          3
            /          /  
           4    null  null  null
          /   
        null  null
      
        /
    }
}
```

## 4. 二叉树的属性

+ 二叉树层级为“l”的最大节点数为2<sup>l</sup>。

这里的层级是从根到节点(包括根和节点)的路径上的节点数。根的层级为0。这可以通过归纳法来证明。

对于根节点，l=0，节点数=2<sup>0</sup>=1。

假设“l”层的最大节点数为2<sup>l</sup>,由于在二叉树中每个节点最多有2个子节点，因此每个节点下一层将有两个节点，即2  2<sup>l</sup>

+ 高度为“h”的二叉树中的最大节点数为2<sup>h</sup>–1。

这里树的高度是根节点到叶节点路径上的最大节点数。具有单个节点的树的高度被认为是1。

这个结果可以从上面的第2点推导出来。如果所有层级都有最大节点，则树具有最大节点。
因此，高度为h的二叉树中的最大节点数为1 + 2 + 4 + .. + 2<sup>h-1</sup>。
这是一个具有h项的简单几何级数，该级数的总和为2<sup>h</sup>–1。

有一些书中，根节点的高度被认为是0。在这种情况下，上述公式变为2<sup>h+1</sup>–1。

+ 在具有N个节点的二叉树中，最小可能高度或最小层级数为log<sub>2</sub>(N+1)。

每一层应该至少有一个元素，所以高度不能超过N。高度为h的二叉树最多可以有2<sup>h</sup> - 1 个节点。
所以节点的数量将小于或等于这个最大值。

> N <= 2<sup>h</sup>-1

> 2<sup>h</sup> >= N+1

> h >= log<sub>2</sub>(N+1)

> h >= |log<sub>2</sub>(N+1)| ，h是一个整数

因此，树可能的最小高度为|log<sub>2</sub>(N+1)|。

+ 具有L个叶子节点的二叉树至少有|log<sub>2</sub>L|+1个层级。

当所有层级都被完全填充时，二叉树的叶节点数最大(层级数最小)。假设所有叶节点都在l层，那么下面的叶节点数L是正确的。

> L <= 2<sup>l-1</sup>

> l = |Log<sub>2</sub>L| + 1 , l是最小层数。

+ 在每个节点有0或2个子节点的二叉树中，叶子节点的数量总是比有两个子节点的节点多1

```
L = T + 1
其中 L = 叶节点数
T = 有两个子节点的内部节点数
```

证明：

叶节点数L(即存在于树底部的总元素树) = 2<sup>h-1</sup>(h是树的高度)

内部节点数 = 节点总数 - 叶节点 = (2<sup>h</sup> - 1) - (2<sup>h-1</sup>) = 2<sup>h-1</sup>(2-1) - 1 = 2<sup>h-1</sup>-1

+ 在非空二叉树中，如果n是节点的总数，e是边的总数，则e = n-1

二叉树中的每个节点都只有一个父节点，根节点除外。所以如果n是节点总数，那么n-1个节点正好有一个父节点。
任何一个子节点和它的父节点只有一条边，所以边的总数是n-1。

## 5. 二叉树的类型

### 5.1 满二叉树

如果每个节点都有0或2个子节点，则二叉树就是满二叉树。以下是满二叉树的示例。
我们也可以说一个满二叉树是一个二叉树，其中除叶节点外的所有节点都有两个子节点。

```
               18
           /         
         15         30  
        /          /  
      40    50    100   40

             18
           /       
         15     20    
        /         
      40    50   
    /   
   30   50

               18
            /       
          40       30  
                   /  
                 100   40
```

### 5.2 完全二叉树

如果除了最后一层之外所有层都被完全填满，则二叉树是完全二叉树并且最后一层的所有键都尽可能保留。

以下是完全二叉树的示例：

```
               18
           /         
         15         30  
        /          /  
      40    50    100   40


               18
           /         
         15         30  
        /          /  
      40    50    100   40
     /     /
    8   7  9 
```

### 5.3 完美二叉树

如果所有内部节点都有两个子节点，并且所有叶节点都在同一级别。则二叉树为完美二叉树。
以下是完美二叉树的示例：

```
               18
           /         
         15         30  
        /          /  
      40    50    100   40


               18
           /         
         15         30  
```

在完美二叉树中，叶子节点的数量是内部节点的数量加1。

L = I + 1 其中 L = 叶节点数，I = 内部节点数。

高度为h(其中二叉树的高度是从根节点到树中任何叶节点的最长路径中的边数，根节点的高度为0)的完美二叉树具有2<sup>h+1</sup>–1个节点。

### 5.4 平衡二叉树

如果二叉树的高度为O(Log n)，其中n是节点数，则二叉树是平衡的。例如，AVL树通过确保左子树和右子树的高度差最大为1来保持O(Log n)高度。
红黑树通过确保每个根到叶路径上的黑色节点数量相同并且没有相邻的红色节点来保持O(Log n)高度。
平衡二叉搜索树在性能方面很好，因为它们为搜索、插入和删除提供了O(Log n)时间。

### 5.5 退化树

每个内部节点都有一个子节点的树称为退化树。此类树在性能方面与链表相同。

```
      10
      /
    20
     
     30
      
      40
```