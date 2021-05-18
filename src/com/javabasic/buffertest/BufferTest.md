## 缓冲
作用： 协调上下层应用之间的差异

上层应用：流量大，流速快   
缓冲区：缓冲  
下层应用：流量小，流速慢

通过缓冲区的缓冲，当上层组件的性能优于下层组件的时候，缓冲可以有效减少上层组件对下层组件等待的时间。。

基于这样的结构，上层组件不需要等待下层组件完全接受全部数据，即可返回进行其他操作，加快了上层组件的处理速度，从而提升整个系统的性能

如：  
Test 不使用缓冲区向文件中写入10_0000个数  
耗时：71 ms

BufferTest：使用缓冲区方式向文件中写入10_0000个数  
耗时：34 ms

BufferedWriter 有两个构造函数
> BufferedWriter(Writer writer);  
> BufferedWriter(Writer writer,int size);

BufferedWriter 默认构造函数是创建 8 KB 的缓冲区

BufferedWriter(Writer writer, int size) 可以指定缓冲区的大小，缓冲区的大小要适中，太小起不到缓冲作用，太大会浪费系统资源，增加GC（Garbage Collection）负担
