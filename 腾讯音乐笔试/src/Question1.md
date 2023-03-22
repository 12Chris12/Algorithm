# 字符串操作

给定一个只包含小写字母字符串，每次可以选择两个相同的字符删除，并在字符串结尾新增任意一个小写字母。
请问最少多少次操作后，所有的字母都不相同？

```
时间限制：C/C++ 1秒，其他语言2秒
空间限制：C/C++ 256M，其他语言512M
```

## 示例1
```
输入例子："abab"
输出例子：2

例子说明：
第一次操作将两个'a'变成一个'f'，字符串变成"bbf"。
第二次操作将两个'b'变成一个'b'，字符串变成"fb"。
操作方式不是唯一的，但可以证明，最少操作次数为2。
```

<https://www.nowcoder.com/exam/test/67348375/detail?pid=43184608&examPageSource=Company&testCallback=https%3A%2F%2Fwww.nowcoder.com%2Fexam%2Fcompany&testclass=%E8%BD%AF%E4%BB%B6%E5%BC%80%E5%8F%91>