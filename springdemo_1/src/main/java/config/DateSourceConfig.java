package config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @Auther: cpb
 * @Date: 2018/12/7 16:26
 * @Description:
 */
@Configuration
@Profile("data")
public class DateSourceConfig {

    /* 此处我用了properties文件的方式进行数据库的定义，也可直接在代码中书写 */
    private static final String databaseConfig = "datasource.properties";

    @Bean(name = "dataSource")
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        InputStream inStream = null;
        try {
            Properties prop = new Properties();
            inStream = getClass().getClassLoader().getResourceAsStream(databaseConfig);
            prop.load(inStream);
            String datastyle = prop.getProperty("data.style");
            dataSource.setUrl(
                    prop.getProperty(datastyle + ".data.url") + ":" + prop.getProperty(datastyle + ".data.database"));
            dataSource.setUsername(prop.getProperty(datastyle + ".data.user"));
            dataSource.setPassword(prop.getProperty(datastyle + ".data.password"));
            /* 配置过滤 */
            dataSource.setFilters(prop.getProperty(datastyle + ".data.filters"));
            /* 配置初始化大小、最小、最大 */
            dataSource.setInitialSize(Integer.parseInt(prop.getProperty(datastyle + ".data.initialSize")));
            dataSource.setMinIdle(Integer.parseInt(prop.getProperty(datastyle + ".data.minIdle")));
            dataSource.setMaxActive(Integer.parseInt(prop.getProperty(datastyle + ".data.maxActive")));
            /* 配置获取连接等待超时的时间 */
            dataSource.setMaxWait(Integer.parseInt(prop.getProperty(datastyle + ".data.maxWait")));
            /* 配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒 */
            dataSource.setTimeBetweenEvictionRunsMillis(
                    Integer.parseInt(prop.getProperty(datastyle + ".data.timeBetweenEvictionRunsMillis")));
            /* 配置一个连接在池中最小生存的时间，单位是毫秒 */
            dataSource.setMinEvictableIdleTimeMillis(
                    Integer.parseInt(prop.getProperty(datastyle + ".data.minEvictableIdleTimeMillis")));
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException iOException) {
            iOException.printStackTrace();
        } catch (SQLException sQLException) {
            sQLException.printStackTrace();
        }
        return dataSource;
    }
}
