**需求**
    一个bitMap的实现:
    0 0 0 0 0 0 0 0
    0 0 0 0 0 0 0 0
    0 0 0 0 0 0 0 0
    0 0 0 0 0 0 0 0
    0 0 0 0 0 0 0 0
    0 0 0 0 0 0 0 0
    其中,每一位可以是0或者1.
    
**思路**
    使用int数组来存储数据,Java中int数值占用32位,所以,存储n位共需要n/32个int数值.
    
**功能简介**
    public BitMap(int n)
        构造函数,初始值为需要统计的位的个数n.
    public void clear(int n)
        将第n位的值设置为0.(无论原来的值是0还是1)
    public int get(int n)
        获取第n位的值.返回结果是0或者1.
    public int getSize()
        获取bitMap共存储几位的信息.
    public void set(int n)
        将第n位的值设置为1.(无论原来的值是0还是1)
    public String toString()
        以字符串的形式返回所有位的值.