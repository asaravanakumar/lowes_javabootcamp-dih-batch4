package com.labs.spring.rest.config;

import com.labs.spring.rest.dao.OrderDao;
import com.labs.spring.rest.dao.OrderDaoJpaImpl;
import com.labs.spring.rest.service.OrderService;
import com.labs.spring.rest.service.OrderServiceImpl;
import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan(basePackages = "com.labs.spring.rest")
public class OrderConfig {

    @Bean
    public MysqlDataSource dataSource() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setDatabaseName("training");
        dataSource.setUser("training");
        dataSource.setPassword("training");
        dataSource.setServerName("localhost");
        return dataSource;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
        hibernateJpaVendorAdapter.setShowSql(true);
        hibernateJpaVendorAdapter.setGenerateDdl(true);
        hibernateJpaVendorAdapter.setDatabase(Database.MYSQL);

        return hibernateJpaVendorAdapter;
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        return new JpaTransactionManager( localContainerEntityManagerFactoryBean().getObject() );
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
        LocalContainerEntityManagerFactoryBean lef = new LocalContainerEntityManagerFactoryBean();

        lef.setDataSource(this.dataSource());
        lef.setJpaVendorAdapter(this.jpaVendorAdapter());
        return lef;
    }

    @Bean
    public OrderDao orderDao() {
        return new OrderDaoJpaImpl();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl();
    }

}
