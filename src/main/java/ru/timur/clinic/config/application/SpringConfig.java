//package main.java.ru.timur.clinic.config.application;
//
//import main.java.ru.timur.clinic.bean.Client;
//import main.java.ru.timur.clinic.mapper.ClientMapper;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Import;
//import org.springframework.core.io.ClassPathResource;
//
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.jdbc.datasource.init.DatabasePopulator;
//import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
//import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//import org.springframework.web.servlet.view.JstlView;
//
///**
// * Created by Tester on 16/08/2017.
// */
//@EnableWebMvc
//@Configuration
//@ComponentScan({"main.java.ru.timur.clinic" })
////@Import({ SecurityConfig.class }) //class where spring security configuration are set up
//@MapperScan({"main.java.ru.timur.clinic.mapper"})
//public class SpringConfig {
//
//    @Bean
//    public InternalResourceViewResolver viewResolver() {
//        InternalResourceViewResolver viewResolver
//                = new InternalResourceViewResolver();
//        viewResolver.setViewClass(JstlView.class);
//        viewResolver.setPrefix("/WEB-INF/views/");
//        viewResolver.setSuffix(".jsp");
//        return viewResolver;
//    }
//
//    @Bean(name = "dataSource")
//    public DriverManagerDataSource dataSource() {
//        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
//        driverManagerDataSource.setDriverClassName("org.hsqldb.jdbc.JDBCDriver");
//        driverManagerDataSource.setUrl("jdbc:hsqldb:hsql://localhost/clinic");
//        driverManagerDataSource.setUsername("SA");
//        driverManagerDataSource.setPassword("");
//        //DatabasePopulatorUtils.execute(createDatabasePopulator(), driverManagerDataSource);
//        return driverManagerDataSource;
//    }
//
////    private DatabasePopulator createDatabasePopulator() {
////        ResourceDatabasePopulator databasePopulator = new ResourceDatabasePopulator();
////        databasePopulator.setContinueOnError(true);
////        databasePopulator.addScript(new ClassPathResource("main/resources/sql/clients.sql"));
////        System.out.println("DB created");
////        databasePopulator.addScript(new ClassPathResource("main/resources/sql/populate.sql"));
////        System.out.println("DB populated");
////        return databasePopulator;
////    }
//
////    @Bean(name = "sqlSessionFactory")
////    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
////        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
////        sqlSessionFactory.setDataSource(dataSource());
////        sqlSessionFactory.setTypeAliasesPackage("main.java.ru.timur.clinic.bean");
////        return sqlSessionFactory;
////    }
//
//    @Bean
//    public SqlSessionFactory sqlSessionFactory() throws Exception {
//        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
//        sqlSessionFactory.setDataSource(dataSource());
//        sqlSessionFactory.setMapperLocations( "main/resources/.xml"));
//        return (SqlSessionFactory) sqlSessionFactory.getObject();
//    }
//
//    @Bean
//    public ClientMapper ClientMapper() throws Exception {
//        SqlSessionTemplate sessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
//        return sessionTemplate.getMapper(ClientMapper.class);
//    }
//
//
//    @Bean
//    public DataSourceTransactionManager transactionManager() {
//        return new DataSourceTransactionManager(dataSource());
//    }
//
//}
