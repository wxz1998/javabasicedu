# Java StringBuffer 和 StringBuilder 类

- 当对字符串进行修改的时候，需要使用 StringBuffer 和 StringBuilder 类。
- 和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。
- 在使用StringBuffer 类时，每次都会对 StringBuffer 对象本身进行操作，而不是生成新的对象，所以如果需要对字符串进行修改推荐使用
  StringBuffer。
- StringBuilder 类在 Java 5 中被提出，它和 StringBuffer 之间的最大不同在于 StringBuilder
  的方法不是线程安全的（不能同步访问）。
- 由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder
  类。然而在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类。

## StringBuffer 方法

- 以下是 StringBuffer 类支持的主要方法：

1. public StringBuffer append(String s)
    - 将指定的字符串追加到此字符序列。
2. public StringBuffer reverse()
    - 将此字符序列用其反转形式取代。
3. public delete(int start, int end)
    - 移除此序列的子字符串中的字符。
4. public insert(int offset, int i)
    - 将 int 参数的字符串表示形式插入此序列中。
5. replace(int start, int end, String str)
    - 使用给定 String 中的字符替换此序列的子字符串中的字符。