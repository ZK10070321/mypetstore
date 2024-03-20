package org.csu.mypetstore01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.csu.mypetstore01.persistence")
public class Mypetstore01Application {

    public static void main(String[] args) {
        SpringApplication.run(Mypetstore01Application.class, args);
    }

}
