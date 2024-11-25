package pe.edu.i202223055.cl1_jpa_data_ramos_anthony.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConexionesConfig {

    @Value("${DB_WORLD_URL}")
    private String dbWorlddUrl;
    @Value("${DB_ WORLD_USER}")
    private String dbWorldUser;
    @Value("${DB_ WORLD_PASS}")
    private String bdWorldPass;
    @Value("${DB_ WORLD_DRIVER}")
    private String bdWorldDriver;

    @Bean
    public HikariDataSource hikariDataSource() {

        HikariConfig config = new HikariConfig();

        config.setJdbcUrl(dbWorlddUrl);
        config.setUsername(dbWorldUser);
        config.setPassword(bdWorldPass);
        config.setDriverClassName(bdWorldDriver);

        config.setMaximumPoolSize(30);
        config.setMinimumIdle(4);
        config.setIdleTimeout(240000);
        config.setConnectionTimeout(45000);

        return new HikariDataSource(config);

    }
}
