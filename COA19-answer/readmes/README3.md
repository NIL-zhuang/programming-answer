## COA2019

在ALU类中实现整数的二进制乘法(要求使用布斯乘法实现)
输入和输出均为32位二进制补码，计算结果直接截取低32位作为最终输出

``` java
 String mul(String src, String dest)
```

---

在FPU类中实现浮点数的二进制乘法
输入和输出均为32位IEEE-754标准的单精度二进制数，分数部分(23 bits)的计算结果直接截取前23位

``` java
 String mul(String a, String b)
```
