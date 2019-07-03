package com.andycen.base.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author Andy Cen
 */
@SpringBootApplication
@MapperScan(basePackages = "com.andycen.base.core.dao.mapper")
@ComponentScan(basePackages={"com.andycen.base"})
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
