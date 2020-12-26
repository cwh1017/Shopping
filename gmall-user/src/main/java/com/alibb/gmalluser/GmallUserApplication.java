package com.alibb.gmalluser;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;


@MapperScan(basePackages = "com.alibb.gmalluser.mapper")
// (basePackages = "com.alibb.gmalluser.controller")
@Slf4j
@SpringBootApplication
public class GmallUserApplication {

    public static void main(String[] args) {
        log.info("这是 boot 的启动  >>>>>>>>>>>>>>>>>>>>>    gmallUserApplication---------startUp-------------");
        SpringApplication.run(GmallUserApplication.class, args);
        log.info("这是 boot 的结束  >>>>>>>>>>>>>>>>>>>>>     gmallUserApplication---------startEnd-------------");
    }

}
