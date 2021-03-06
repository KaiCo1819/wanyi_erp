package com.wanyiErp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author ruoyi
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class WanyiErpApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(WanyiErpApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  万一ERP启动成功   ლ(´ڡ`ლ)ﾞ  \n");
    }
}