package cn.ac.xiaolima.workcode.mapstruct;

import cn.ac.xiaolima.workcode.WorkCodeApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MainTest {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(WorkCodeApplication.class, args);
        MainTest bean = context.getBean(MainTest.class);
        bean.run();
    }

    private void run() {
        Source source = new Source();
        source.setId(1);
        source.setIps(Arrays.asList("0.0.0.0", "127.0.0.1"));
        Target convert = mapper.convert(source);
        System.out.println(convert.getIps());
    }

    @Autowired
    private MyMapper mapper;
}
