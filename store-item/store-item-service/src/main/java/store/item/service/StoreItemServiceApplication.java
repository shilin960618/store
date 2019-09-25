package store.item.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("store.item.service.mapper")
public class StoreItemServiceApplication {
    public static void main(String[] args){
        SpringApplication.run(StoreItemServiceApplication.class,args);
    }
}
