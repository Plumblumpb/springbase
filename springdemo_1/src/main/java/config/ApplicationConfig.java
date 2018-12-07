package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.sql.DataSource;

/**
 * @Auther: cpb
 * @Date: 2018/12/7 16:12
 * @Description:
 */
@Configuration
@ComponentScan(basePackages = { "dao","service" })
//开启AOP
@EnableAspectJAutoProxy
//启动定时任务
@EnableScheduling
public class ApplicationConfig {
    @Autowired
    public DataSource dataSource;

//    @Bean
//    public IDBI database() {
//        IDBI dbi = new DBI(dataSource);
//        logger.debug("dbi : {}", dbi);
//        return dbi;
//    }
}
