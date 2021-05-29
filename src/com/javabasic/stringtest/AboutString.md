# String StringBuilder StringBuffer

## 1. 简介
1. String 是 final 修饰的，不可变，每次操作都会产生新的 String 对象
2. StringBuilder  StringBuffer 都是原对象上进行操作
 - StringBuffer 是线程安全的
 - StringBuilder 是线程不安全的
3. StringBuffer 是 synchronized 修饰的

## 2. 性能比较
StringBuilder > StringBuffer > String
使用场景： 
 - 经常需要改变字符串内容使用 StringBuffer 和 StringBuilder
 - 优先使用 StringBuilder，如果是多线程共享变量时使用 StringBuffer

