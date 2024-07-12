package com.examples.empapp.config;

import com.examples.empapp.dao.EmployeeDao;
import com.examples.empapp.dao.EmployeeDaoJdbcImpl;
import com.examples.empapp.service.EmployeeService;
import com.examples.empapp.service.EmployeeServiceJdbcImpl;
import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.examples.empapp.model.Employee;
import com.examples.empapp.service.EmployeeServiceColImpl;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Configuration("com.examples.empapp")
public class EmployeeConfig {

		@Bean
		@Scope(scopeName="prototype")
		public Employee employee()
		{
			return new Employee();
		}
		
		@Bean
		public EmployeeService empService()
		{
			return new EmployeeServiceColImpl();
//			return new EmployeeServiceJdbcImpl();
		}

		@Bean
		public Connection connection() throws SQLException {
			MysqlDataSource datasource = new MysqlDataSource();
			datasource.setServerName("localhost");
			datasource.setDatabaseName("training");
			datasource.setUser("training");
			datasource.setPassword("training");
			return datasource.getConnection();
		}

		@Bean
		public EmployeeDao employeeDao() {
			return new EmployeeDaoJdbcImpl();
		}
}
