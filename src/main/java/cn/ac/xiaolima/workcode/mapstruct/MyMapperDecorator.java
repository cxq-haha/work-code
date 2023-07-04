package cn.ac.xiaolima.workcode.mapstruct;

import cn.ac.xiaolima.workcode.mapstruct.bean.MyService;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class MyMapperDecorator implements MyMapper {
    /**
     * 通过在装饰类中声明静态Bean，Mapper接口中访问这个Bean
     */
    private static MyService myService;

    @Autowired
    public void setMyService(MyService myService) {
        MyMapperDecorator.myService = myService;
    }

    public static void speak() {
        myService.speak();
    }

}
