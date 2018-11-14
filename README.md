# Serializable- 序列化详解

**1.serialVersionUID-->适用于Java的序列化机制:**

    1.Java的序列化机制是通过判断类的serialVersionUID来验证版本一致性的
    2.反序列化时，JVM会把传来的字节流中的serialVersionUID与本地相应实体类的serialVersionUID进行比较，如果相同就认为是一致的，可以进行反序列化
    3.就会出现序列化版本不一致的异常，即是InvalidCastException
    
**2.具体化序列化过程:**

    1.序列化:当前类的serialVersionUID写入到序列化文件中
    2.反序列化:检测文件中的serialVersionUID，判断是否与当前类的serialVersionUID一致
        --1.serialVersionUID一致：可以反序列化成功
        --2.serialVersionUID不一致：InvalidCastException

**3.serialVersionUID有两种显示的生成方式:**

    1.指定值:private static final long serialVersionUID = 1L; 
    2.默认值:-->根据类名、接口名、成员方法及属性等来生成一个64位的哈希字段
        --1.因此，要想反序列化成功，且不指定serialVersionUID，则包名，类名等均要一致

**4.序列化测试:**

    1.A-:显式指定序列化Id --同类同包
        success
    2.B-:将序列化id的创建交由jvm(根据类名等元素)，-->同类同包
        success
    3.C-:显式指定序列化Id相同,不同类不同包
        fail:ClassCastException: pers.li.seri.entity.CPerson cannot be cast to pers.li.seri.entity2.CPerson2
    4.D-:显式指定序列化Id相同,同类名不同包
        fail:ClassCastException: pers.li.seri.entity.DPerson cannot be cast to pers.li.seri.entity2.DPerson
        