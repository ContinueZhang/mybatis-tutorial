package com.godsend;

import com.godsend.config.Config;
import com.godsend.mapper.InquiryMapper;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(Config.class);
        System.out.println(acac.getBean(InquiryMapper.class));
        System.out.println(acac.getBean("&inquiryMapper"));

    }

}
