package com.wones.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//引导类。 SpringBoot项目的入口
@SpringBootApplication
//指定扫描dao接口类的路径，将dao接口类注入到spring中
@MapperScan("com.wones.blog.dao")
public class BlogApplication {
    public static void main(String[] args){
       SpringApplication.run(BlogApplication.class,args);
    }
}
