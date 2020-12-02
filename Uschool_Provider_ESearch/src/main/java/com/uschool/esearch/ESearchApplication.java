package com.uschool.esearch;
/**
 * @author ：caomu
 * @date ：Created in 2020/11/25 15:31
 * @description：
 * @modified By：
 * @version:
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *@ClassName ShowPageApplication
 *@Description TODO
 *@aurhor caomu
 *@Date 2020/11/25 15:31
 *@Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient

public class ESearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(ESearchApplication.class, args);
    }
}
