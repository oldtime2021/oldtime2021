package com.oldtime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SecurityDomeApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SecurityDomeApplication.class, args);

        SpringApplication app = new SpringApplication(SecurityDomeApplication.class);
        Environment env = app.run(args).getEnvironment();

        System.out.println("启动成功");
        System.out.println("根地址：\t\thttp://127.0.0.1:"+env.getRequiredProperty("server.port"));



    }

}
