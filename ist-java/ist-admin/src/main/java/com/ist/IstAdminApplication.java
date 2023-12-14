package com.ist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @className IstAdminApplication
 * @Description TODO
 * @Author ich
 */
@SpringBootApplication(scanBasePackages = {"com.ist"})
@EnableTransactionManagement
@EnableScheduling
@EnableAsync
public class IstAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(IstAdminApplication.class, args);
    }
}
