# 第一章 java多线程技能
## 1.3currentThread方法
1. run方法自动执行

## 1.7
### 1.7.2判断线程是否是停止状态
1. interrupted:判断线程是否停止,清除标记
2. isInterrupted:判断线程是否停止,不清除标记
## 1.8 暂停线程
1. suspend方法暂停线程独占
2. suspend方法暂停线程,如果线程里有println打印,当程序运行到println方法内部会停止,同步锁未被释放
3. suspend方法暂停线程不同步

# 第二章 对象及其变量的并发访问
## 2.1 synchronized同步方法
1. synchronized声明的方法一定是排队运行的
2. 同一个类中,不同的方法加synchronized,调用的类的对象锁,是同一把锁
