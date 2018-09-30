> 学习资源来自 http://www.itmayiedu.com/front/couinfo/87/851

# 一、 Spring介绍

## 1.1、SpringBoot简介

在您第1次接触和学习Spring框架的时候，是否因为其繁杂的配置而退却了？在你第n次使用Spring框架的时候，是否觉得一堆反复黏贴的配置有一些厌烦？那么您就不妨来试试使用Spring Boot来让你更易上手，更简单快捷地构建Spring应用！

SpringBoot让我们的Spring应用变的更轻量化。比如：你可以仅仅依靠一个Java类来运行一个Spring引用。你也可以打包你的应用为jar并通过使用java -jar来运行你的Spring Web应用。

SpringBoot的主要优点：

为所有Spring开发者更快的入门

开箱即用，提供各种默认配置来简化项目配置

内嵌式容器简化Web项目

没有冗余代码生成和XML配置的要求

本章主要目标完成Spring Boot基础项目的构建，并且实现一个简单的Http请求处理，通过这个例子对Spring Boot有一个初步的了解，并体验其结构简单、开发快速的特性。

## 1.2、系统要求：

Java1.8及以上

SpringFramework 4.1.5及以上

**本文采用**Java 1.8.0_73**、**Spring Boot 1.3.2**调试通过。**

# 二、快速入门

## 2.1、创建一个Maven工程

**名为”springboot-helloworld” 类型为Jar工程项目**

![mark](http://omi0o6pp2.bkt.clouddn.com/blog/180323/cc039CH73k.png)

## 2.2、pom文件引入依赖

```java
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>1.3.3.RELEASE</version>
	</parent>
	<dependencies>
	  <!—SpringBoot web 组件 -->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
	</dependencies>	
```

```
spring-boot-starter-parent作用
在pom.xml中引入spring-boot-start-parent,spring官方的解释叫什么stater poms,它可以提供dependency management,也就是说依赖管理，引入以后在申明其它dependency的时候就不需要version了，后面可以看到。
spring-boot-starter-web作用
springweb 核心组件
spring-boot-maven-plugin作用
 如果我们要直接Main启动spring，那么以下plugin必须要添加，否则是无法启动的。如果使用maven 的spring-boot:run的话是不需要此配置的。（我在测试的时候，如果不配置下面的plugin也是直接在Main中运行的。）
```

## 2.3、编写HelloWorld服务

创建package命名为com.itmayiedu.controller（根据实际情况修改）

创建HelloController类，内容如下

```java
@RestController
@EnableAutoConfiguration
public class HelloController {
	@RequestMapping("/hello")
	public String index() {
		return "Hello World";
	}	
public static void main(String[] args) {
		SpringApplication.run(HelloController.class, args);
	}
}
```

## 2.4、@RestController

**在上加上RestController 表示修饰该Controller所有的方法返回JSON格式,直接可以编写**
**Restful接口**

## 2.5、@EnableAutoConfiguration

注解:作用在于让 Spring Boot   根据应用所声明的依赖来对 Spring 框架进行自动配置

​        这个注解告诉Spring Boot根据添加的jar依赖猜测你想如何配置Spring。由于spring-boot-starter-web添加了Tomcat和Spring MVC，所以auto-configuration将假定你正在开发一个web应用并相应地对Spring进行设置。

## 2.6 SpringApplication.*run*(HelloController.class, args);

标识为启动类

## 2.7、SpringBoot启动方式1

Springboot默认端口号为8080

```java

@RestController
@EnableAutoConfiguration
public class HelloController {
	@RequestMapping("/hello")
	public String index() {
		return "Hello World";
	}	
public static void main(String[] args) {
		SpringApplication.run(HelloController.class, args);
	}
}
```

启动主程序，打开浏览器访问http://localhost:8080/index，可以看到页面输出Hello
World

## 2.8、SpringBoot启动方式2

@ComponentScan(basePackages = "com.itmayiedu.controller")---控制器扫包范围

```java
@ComponentScan(basePackages = "com.itmayiedu.controller")
@EnableAutoConfiguration
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
```

# 三、 Web开发

## 3.1、静态资源访问

在我们开发Web应用的时候，需要引用大量的js、css、图片等静态资源。

默认配置

SpringBoot默认提供静态资源目录位置需置于classpath下，目录名需符合如下规则：

/static

/public

/resources          

/META-INF/resources

举例：我们可以在src/main/resources/目录下创建static，在该位置放置一个图片文件。启动程序后，尝试访问http://localhost:8080/D.jpg。如能显示图片，配置成功。

## 3.2、全局捕获异常

@ExceptionHandler表示拦截异常

·        @ControllerAdvice 是 controller 的一个辅助类，最常用的就是作为全局异常处理的切面类

·        @ControllerAdvice 可以指定扫描范围

·        @ControllerAdvice 约定了几种可行的返回值，如果是直接返回 model 类的话，需要使用 @ResponseBody 进行 json 转换

o    			返回 String，表示跳到某个 view

o    			返回 modelAndView

o    			返回 model +@ResponseBody

```java
@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public Map<String, Object> exceptionHandler() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("errorCode", "101");
		map.put("errorMsg", "系統错误!");
		return map;
	}
}
```

## 3.3、渲染Web页面

渲染Web页面

在之前的示例中，我们都是通过@RestController来处理请求，所以返回的内容为json对象。那么如果需要渲染html页面的时候，要如何实现呢？

模板引擎

在动态HTML实现上Spring Boot依然可以完美胜任，并且提供了多种模板引擎的默认配置支持，所以在推荐的模板引擎下，我们可以很快的上手开发动态网站。

SpringBoot提供了默认配置的模板引擎主要有以下几种：

·        Thymeleaf

·        FreeMarker

·        Velocity

·        Groovy

·        Mustache

SpringBoot建议使用这些模板引擎，避免使用JSP，若一定要使用JSP将无法实现SpringBoot的多种特性，具体可见后文：支持JSP的配置

当你使用上述模板引擎中的任何一个，它们默认的模板配置路径为：src/main/resources/templates。当然也可以修改这个路径，具体如何修改，可在后续各模板引擎的配置属性中查询并修改。

## 3.4、[使用Freemarker模板引擎渲染web视图](http://blog.didispace.com/springbootweb/)

### 3.4.1、pom文件引入:

```java
<!-- 引入freeMarker的依赖包. -->
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-freemarker</artifactId>
</dependency>
```

### 3.4.2、后台代码

在src/main/resources/创建一个templates文件夹,后缀为*.ftl

```java
@RequestMapping("/index")
	public String index(Map<String, Object> map) {
	    map.put("name","美丽的天使...");
		return "index";
	}
```

### 3.4.3、前台代码

```html
<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8" />
<title></title>
</head>
<body>
	  ${name}
</body> 
</html>
```

### 3.4.4、Freemarker其他用法

```heml
@RequestMapping("/freemarkerIndex")
	public String index(Map<String, Object> result) {
		result.put("name", "yushengjun");
		result.put("sex", "0");
		List<String> listResult = new ArrayList<String>();
		listResult.add("zhangsan");
		listResult.add("lisi");
		listResult.add("itmayiedu");
		result.put("listResult", listResult);
		return "index";
	}

<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8" />
<title>首页</title>
</head>
<body>
	  ${name}
<#if sex=="1">
            男
      <#elseif sex=="2">
            女
     <#else>
        其他      
	  
	  </#if>	  
	 <#list userlist as user>
	   ${user}
	 </#list>
</body> 
</html>
```

### 3.4.5、Freemarker配置

新建application.properties文件

```
########################################################
###FREEMARKER (FreeMarkerAutoConfiguration)
########################################################
spring.freemarker.allow-request-override=false
spring.freemarker.cache=true
spring.freemarker.check-template-location=true
spring.freemarker.charset=UTF-8
spring.freemarker.content-type=text/html
spring.freemarker.expose-request-attributes=false
spring.freemarker.expose-session-attributes=false
spring.freemarker.expose-spring-macro-helpers=false
#spring.freemarker.prefix=
#spring.freemarker.request-context-attribute=
#spring.freemarker.settings.*=
spring.freemarker.suffix=.ftl
spring.freemarker.template-loader-path=classpath:/templates/
#comma-separated list
#spring.freemarker.view-names= # whitelist of view names that can be resolved
```

## 3.5、使用JSP渲染Web视图

### 3.5.1、pom文件引入以下依赖

```java
<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>1.3.3.RELEASE</version>
	</parent>
	<dependencies>
		<!-- SpringBoot 核心组件 -->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-tomcat</artifactId>
		</dependency>
		<dependency>
			<groupId>org.apache.tomcat.embed</groupId>
			<artifactId>tomcat-embed-jasper</artifactId>
		</dependency>
	</dependencies>
```

### 3.5.2、在application.properties创建以下配置

```
spring.mvc.view.prefix=/WEB-INF/jsp/
spring.mvc.view.suffix=.jsp
```

### 3.5.3、后台代码

```java
@Controller
public class IndexController {
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
}
```



注意:创建SpringBoot整合JSP，一定要为war类型，否则会找不到页面.

# 四、 数据访问

### 4.1、springboot整合[使用JdbcTemplate](http://blog.didispace.com/springbootdata1/)

#### 4.1.1 pom文件引入

```xml
<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>1.5.2.RELEASE</version>
	</parent>
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-jdbc</artifactId>
		</dependency>
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>5.1.21</version>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
	</dependencies>
```



#### 4.1.2 application.properties新增配置

```
spring.datasource.url=jdbc:mysql://localhost:3306/test
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
```

#### 4.1.3 UserService类

```
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void createUser(String name, Integer age) {
		System.out.println("ssss");
		jdbcTemplate.update("insert into users values(null,?,?);", name, age);
	}
}
```

#### 4.1.4 App类

```
@ComponentScan(basePackages = "com.itmayiedu")
@EnableAutoConfiguration
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}	
```

**注意: spring-boot-starter-parent****要在1.5****以上**

### 4.2、springboot整合[使用](http://blog.didispace.com/springbootdata1/)mybatis

#### 4.2.1、pom文件引入

```xml
<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>1.3.2.RELEASE</version>
		<relativePath /> <!-- lookup parent from repository -->
	</parent>
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.mybatis.spring.boot</groupId>
			<artifactId>mybatis-spring-boot-starter</artifactId>
			<version>1.1.1</version>
		</dependency>
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>5.1.21</version>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
	</dependencies>
```

#### 4.2.2、配置文件引入

```
spring.datasource.url=jdbc:mysql://localhost:3306/test
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
```

#### 4.2.3、Mapper代码

```
public interface UserMapper {
	@Select("SELECT * FROM USERS WHERE NAME = #{name}")
	User findByName(@Param("name") String name);
	@Insert("INSERT INTO USERS(NAME, AGE) VALUES(#{name}, #{age})")
	int insert(@Param("name") String name, @Param("age") Integer age);
}
```

#### 4.2.4、启动方式

```java
@ComponentScan(basePackages = "com.itmayiedu")
@MapperScan(basePackages = "com.itmayiedu.mapper")
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
```

### 4.3、springboot整合[使用](http://blog.didispace.com/springbootdata1/)springjpa

#### 4.3.1 pom文件引入依赖

```java
<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>1.4.2.RELEASE</version>
	</parent>
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>5.1.21</version>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
	</dependencies>
```

#### 4.3.2 创建User实体类

```java
@Entity(name = "users")
public class User {
	@Id
	@GeneratedValue
	private Integer id;
	@Column
	private String name;
	@Column
	private Integer age;
      // ..get/set方法
}
```

#### 4.3.3 创建UserDao

```java
public interface UserDao extends JpaRepository<User, Integer> {
}
```

#### 4.3.4 创建IndexController

```java
@RestController
public class IndexController {
	@Autowired
	private UserDao userDao;
	@RequestMapping("/index")
	public String index(Integer id) {
		User findUser = userDao.findOne(id);
		System.out.println(findUser.getName());
		return "success";
	}
}
```

#### 4.3.5 启动项目

```java
@ComponentScan(basePackages = { "com.itmayiedu" })
@EnableJpaRepositories(basePackages = "com.itmayiedu.dao")
@EnableAutoConfiguration
@EntityScan(basePackages = flightentity)
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
```

### 4.4、springboot整合多数据源

同学们思考下，你们在项目中有使用到多数据源吗？

#### 4.4.1配置文件中新增两个数据源

```
spring.datasource.test1.driverClassName = com.mysql.jdbc.Driver
spring.datasource.test1.url = jdbc:mysql://localhost:3306/test01?useUnicode=true&characterEncoding=utf-8
spring.datasource.test1.username = root
spring.datasource.test1.password = root

spring.datasource.test2.driverClassName = com.mysql.jdbc.Driver
spring.datasource.test2.url = jdbc:mysql://localhost:3306/test02?useUnicode=true&characterEncoding=utf-8
spring.datasource.test2.username = root
spring.datasource.test2.password = root
```

#### 4.4.2配置文件中新增两个数据源

```java
@Configuration // 注册到springboot容器中
@MapperScan(basePackages = "com.itmayiedu.user1", sqlSessionFactoryRef = "test1SqlSessionFactory")
public class DataSource1Config {

	/**
	 * 
	 * @methodDesc: 功能描述:(配置test1数据库)
	 * @author: 余胜军
	 * @param: @return
	 * @createTime:2017年9月17日 下午3:16:44
	 * @returnType:@return DataSource
	 * @copyright:上海每特教育科技有限公司
	 * @QQ:644064779
	 */
	@Bean(name = "test1DataSource")
	@Primary
	@ConfigurationProperties(prefix = "spring.datasource.test1")
	public DataSource testDataSource() {
		return DataSourceBuilder.create().build();
	}

	/**
	 * 
	 * @methodDesc: 功能描述:(test1 sql会话工厂)
	 * @author: 余胜军
	 * @param: @param
	 *             dataSource
	 * @param: @return
	 * @param: @throws
	 *             Exception
	 * @createTime:2017年9月17日 下午3:17:08
	 * @returnType:@param dataSource
	 * @returnType:@return
	 * @returnType:@throws Exception SqlSessionFactory
	 * @copyright:上海每特教育科技有限公司
	 * @QQ:644064779
	 */
	@Bean(name = "test1SqlSessionFactory")
	@Primary
	public SqlSessionFactory testSqlSessionFactory(@Qualifier("test1DataSource") DataSource dataSource)
			throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
//		bean.setMapperLocations(
//				new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/test1/*.xml"));
		return bean.getObject();
	}

	/**
	 * 
	 * @methodDesc: 功能描述:(test1 事物管理)
	 * @author: 余胜军
	 * @param: @param
	 *             dataSource
	 * @param: @return
	 * @param: @throws
	 *             Exception
	 * @createTime:2017年9月17日 下午3:17:08
	 * @returnType:@param dataSource
	 * @returnType:@return
	 * @returnType:@throws Exception SqlSessionFactory
	 * @copyright:上海每特教育科技有限公司
	 * @QQ:644064779
	 */
	@Bean(name = "test1TransactionManager")
	@Primary
	public DataSourceTransactionManager testTransactionManager(@Qualifier("test1DataSource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean(name = "test1SqlSessionTemplate")
	public SqlSessionTemplate testSqlSessionTemplate(
			@Qualifier("test1SqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}

}
```

#### 4.4.2创建分包Mapper 

```java
public interface User1Mapper {
	@Insert("insert into users values(null,#{name},#{age});")
	public int addUser(@Param("name") String name, @Param("age") Integer age);
}
```

#### 4.4.3启动项目

```java
@ComponentScan(basePackages = "com.itmayiedu")
@EnableAutoConfiguration
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
```



No qualifying
bean of type [javax.sql.DataSource] is defined: expected single matching bean
but found 2: test1DataSource,test2DataSource

# 五、 事物管理

### 5.1.1springboot整合事物管理

 springboot默认集成事物,只主要在方法上加上@Transactional即可

### 5.1.2SpringBoot分布式事物管理

使用springboot+jta+atomikos 分布式事物管理

#### 5.1.2.1新增配置文件信息

```xml
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-jta-atomikos</artifactId>
</dependency>
```

#### 5.1.2.2新增配置文件信息

```xml
# Mysql 1
mysql.datasource.test.url = jdbc:mysql://localhost:3306/test01?useUnicode=true&characterEncoding=utf-8
mysql.datasource.test.username = root
mysql.datasource.test.password = root

mysql.datasource.test.minPoolSize = 3
mysql.datasource.test.maxPoolSize = 25
mysql.datasource.test.maxLifetime = 20000
mysql.datasource.test.borrowConnectionTimeout = 30
mysql.datasource.test.loginTimeout = 30
mysql.datasource.test.maintenanceInterval = 60
mysql.datasource.test.maxIdleTime = 60
mysql.datasource.test.testQuery = select 1


# Mysql 2
mysql.datasource.test2.url =jdbc:mysql://localhost:3306/test02?useUnicode=true&characterEncoding=utf-8
mysql.datasource.test2.username =root
mysql.datasource.test2.password =root

mysql.datasource.test2.minPoolSize = 3
mysql.datasource.test2.maxPoolSize = 25
mysql.datasource.test2.maxLifetime = 20000
mysql.datasource.test2.borrowConnectionTimeout = 30
mysql.datasource.test2.loginTimeout = 30
mysql.datasource.test2.maintenanceInterval = 60
mysql.datasource.test2.maxIdleTime = 60
mysql.datasource.test2.testQuery = select 1
```

#### 5.1.2.3 读取配置文件信息

```java
package com.itmayiedu.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "mysql.datasource.test")
public class DBConfig1 {

	private String url;
	private String username;
	private String password;
	private int minPoolSize;
	private int maxPoolSize;
	private int maxLifetime;
	private int borrowConnectionTimeout;
	private int loginTimeout;
	private int maintenanceInterval;
	private int maxIdleTime;
	private String testQuery;
}
package com.itmayiedu.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "mysql.datasource.test1")
public class DBConfig2 {

	private String url;
	private String username;
	private String password;
	private int minPoolSize;
	private int maxPoolSize;
	private int maxLifetime;
	private int borrowConnectionTimeout;
	private int loginTimeout;
	private int maintenanceInterval;
	private int maxIdleTime;
	private String testQuery;
}
```

#### 5.1.2.4 创建多数据源

```java
@Configuration
// basePackages 最好分开配置 如果放在同一个文件夹可能会报错
@MapperScan(basePackages = "com.itmayiedu.test1", sqlSessionTemplateRef = "testSqlSessionTemplate")
public class TestMyBatisConfig1 {

	// 配置数据源
	@Primary
	@Bean(name = "testDataSource")
	public DataSource testDataSource(DBConfig1 testConfig) throws SQLException {
		MysqlXADataSource mysqlXaDataSource = new MysqlXADataSource();
		mysqlXaDataSource.setUrl(testConfig.getUrl());
		mysqlXaDataSource.setPinGlobalTxToPhysicalConnection(true);
		mysqlXaDataSource.setPassword(testConfig.getPassword());
		mysqlXaDataSource.setUser(testConfig.getUsername());
		mysqlXaDataSource.setPinGlobalTxToPhysicalConnection(true);

		AtomikosDataSourceBean xaDataSource = new AtomikosDataSourceBean();
		xaDataSource.setXaDataSource(mysqlXaDataSource);
		xaDataSource.setUniqueResourceName("testDataSource");

		xaDataSource.setMinPoolSize(testConfig.getMinPoolSize());
		xaDataSource.setMaxPoolSize(testConfig.getMaxPoolSize());
		xaDataSource.setMaxLifetime(testConfig.getMaxLifetime());
		xaDataSource.setBorrowConnectionTimeout(testConfig.getBorrowConnectionTimeout());
		xaDataSource.setLoginTimeout(testConfig.getLoginTimeout());
		xaDataSource.setMaintenanceInterval(testConfig.getMaintenanceInterval());
		xaDataSource.setMaxIdleTime(testConfig.getMaxIdleTime());
		xaDataSource.setTestQuery(testConfig.getTestQuery());
		return xaDataSource;
	}

	@Primary
	@Bean(name = "testSqlSessionFactory")
	public SqlSessionFactory testSqlSessionFactory(@Qualifier("testDataSource") DataSource dataSource)
			throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		return bean.getObject();
	}

	@Primary
	@Bean(name = "testSqlSessionTemplate")
	public SqlSessionTemplate testSqlSessionTemplate(
			@Qualifier("testSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}

// basePackages 最好分开配置 如果放在同一个文件夹可能会报错
@Configuration
@MapperScan(basePackages = "com.itmayiedu.test2", sqlSessionTemplateRef = "test2SqlSessionTemplate")
public class TestMyBatisConfig2 {

	// 配置数据源
	@Bean(name = "test2DataSource")
	public DataSource testDataSource(DBConfig1 testConfig) throws SQLException {
		MysqlXADataSource mysqlXaDataSource = new MysqlXADataSource();
		mysqlXaDataSource.setUrl(testConfig.getUrl());
		mysqlXaDataSource.setPinGlobalTxToPhysicalConnection(true);
		mysqlXaDataSource.setPassword(testConfig.getPassword());
		mysqlXaDataSource.setUser(testConfig.getUsername());
		mysqlXaDataSource.setPinGlobalTxToPhysicalConnection(true);

		AtomikosDataSourceBean xaDataSource = new AtomikosDataSourceBean();
		xaDataSource.setXaDataSource(mysqlXaDataSource);
		xaDataSource.setUniqueResourceName("test2DataSource");

		xaDataSource.setMinPoolSize(testConfig.getMinPoolSize());
		xaDataSource.setMaxPoolSize(testConfig.getMaxPoolSize());
		xaDataSource.setMaxLifetime(testConfig.getMaxLifetime());
		xaDataSource.setBorrowConnectionTimeout(testConfig.getBorrowConnectionTimeout());
		xaDataSource.setLoginTimeout(testConfig.getLoginTimeout());
		xaDataSource.setMaintenanceInterval(testConfig.getMaintenanceInterval());
		xaDataSource.setMaxIdleTime(testConfig.getMaxIdleTime());
		xaDataSource.setTestQuery(testConfig.getTestQuery());
		return xaDataSource;
	}

	@Bean(name = "test2SqlSessionFactory")
	public SqlSessionFactory testSqlSessionFactory(@Qualifier("test2DataSource") DataSource dataSource)
			throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		return bean.getObject();
	}

	@Bean(name = "test2SqlSessionTemplate")
	public SqlSessionTemplate testSqlSessionTemplate(
			@Qualifier("test2SqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}
```

#### 5.1.2.4 启动加载配置

**@EnableConfigurationProperties(value= { DBConfig1.class, DBConfig2.class })**

# 六、 日志管理

### 6.1[使用log4j记录日志](http://blog.didispace.com/springbootlog4j/)

#### 6.1.2新建log4j配置文件

```
#log4j.rootLogger=CONSOLE,info,error,DEBUG
log4j.rootLogger=info,error,CONSOLE,DEBUG
log4j.appender.CONSOLE=org.apache.log4j.ConsoleAppender     
log4j.appender.CONSOLE.layout=org.apache.log4j.PatternLayout     
log4j.appender.CONSOLE.layout.ConversionPattern=%d{yyyy-MM-dd-HH-mm} [%t] [%c] [%p] - %m%n     
log4j.logger.info=info
log4j.appender.info=org.apache.log4j.DailyRollingFileAppender
log4j.appender.info.layout=org.apache.log4j.PatternLayout     
log4j.appender.info.layout.ConversionPattern=%d{yyyy-MM-dd-HH-mm} [%t] [%c] [%p] - %m%n  
log4j.appender.info.datePattern='.'yyyy-MM-dd
log4j.appender.info.Threshold = info   
log4j.appender.info.append=true   
#log4j.appender.info.File=/home/admin/pms-api-services/logs/info/api_services_info
log4j.appender.info.File=/Users/dddd/Documents/testspace/pms-api-services/logs/info/api_services_info
log4j.logger.error=error  
log4j.appender.error=org.apache.log4j.DailyRollingFileAppender
log4j.appender.error.layout=org.apache.log4j.PatternLayout     
log4j.appender.error.layout.ConversionPattern=%d{yyyy-MM-dd-HH-mm} [%t] [%c] [%p] - %m%n  
log4j.appender.error.datePattern='.'yyyy-MM-dd
log4j.appender.error.Threshold = error   
log4j.appender.error.append=true   
#log4j.appender.error.File=/home/admin/pms-api-services/logs/error/api_services_error
log4j.appender.error.File=/Users/dddd/Documents/testspace/pms-api-services/logs/error/api_services_error
log4j.logger.DEBUG=DEBUG
log4j.appender.DEBUG=org.apache.log4j.DailyRollingFileAppender
log4j.appender.DEBUG.layout=org.apache.log4j.PatternLayout     
log4j.appender.DEBUG.layout.ConversionPattern=%d{yyyy-MM-dd-HH-mm} [%t] [%c] [%p] - %m%n  
log4j.appender.DEBUG.datePattern='.'yyyy-MM-dd
log4j.appender.DEBUG.Threshold = DEBUG   
log4j.appender.DEBUG.append=true   
#log4j.appender.DEBUG.File=/home/admin/pms-api-services/logs/debug/api_services_debug
log4j.appender.DEBUG.File=/Users/dddd/Documents/testspace/pms-api-services/logs/debug/api_services_debug

log4j代码
private static Logger log = Logger.getLogger(IndexController.class);
```

### 6.2[使用AOP统一处理Web请求日志](http://blog.didispace.com/springbootaoplog/)

#### 6.2.1POM文件新增依赖

```
	<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-aop</artifactId>
	</dependency>
```

#### 6.2.2POM文件新增依赖

```java
@Aspect
@Component
public class WebLogAspect {
	private Logger logger = LoggerFactory.getLogger(getClass());
	@Pointcut("execution(public * com.itmayiedu.controller..*.*(..))")
	public void webLog() {
	}
	@Before("webLog()")
	public void doBefore(JoinPoint joinPoint) throws Throwable {
		// 接收到请求，记录请求内容
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = attributes.getRequest();
		// 记录下请求内容
		logger.info("URL : " + request.getRequestURL().toString());
		logger.info("HTTP_METHOD : " + request.getMethod());
		logger.info("IP : " + request.getRemoteAddr());
		Enumeration<String> enu = request.getParameterNames();
		while (enu.hasMoreElements()) {
			String name = (String) enu.nextElement();
			logger.info("name:{},value:{}", name, request.getParameter(name));
		}
	}
	@AfterReturning(returning = "ret", pointcut = "webLog()")
	public void doAfterReturning(Object ret) throws Throwable {
		// 处理完请求，返回内容
		logger.info("RESPONSE : " + ret);
	}
}
```

# 七、 缓存支持

### 7.1[注解配置与EhCache使用](http://blog.didispace.com/springbootcache1/)

#### 7.1.1 pom文件引入

```java
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-cache</artifactId>
</dependency>
```

#### 7.1.2新建ehcache.xml 文件

```xml
<?xml version="1.0" encoding="UTF-8"?>
<ehcache xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:noNamespaceSchemaLocation="http://ehcache.org/ehcache.xsd"
	updateCheck="false">
	<diskStore path="java.io.tmpdir/Tmp_EhCache" />

	<!-- 默认配置 -->
	<defaultCache maxElementsInMemory="5000" eternal="false"
		timeToIdleSeconds="120" timeToLiveSeconds="120"
		memoryStoreEvictionPolicy="LRU" overflowToDisk="false" />

	<cache name="baseCache" maxElementsInMemory="10000"
		maxElementsOnDisk="100000" />

</ehcache>
```

**配置信息介绍**

```
 <!--  
2.	       name:缓存名称。  
3.	       maxElementsInMemory：缓存最大个数。  
4.	       eternal:对象是否永久有效，一但设置了，timeout将不起作用。  
5.	       timeToIdleSeconds：设置对象在失效前的允许闲置时间（单位：秒）。仅当eternal=false对象不是永久有效时使用，可选属性，默认值是0，也就是可闲置时间无穷大。  
6.	       timeToLiveSeconds：设置对象在失效前允许存活时间（单位：秒）。最大时间介于创建时间和失效时间之间。仅当eternal=false对象不是永久有效时使用，默认是0.，也就是对象存活时间无穷大。  
7.	       overflowToDisk：当内存中对象数量达到maxElementsInMemory时，Ehcache将会对象写到磁盘中。  
8.	       diskSpoolBufferSizeMB：这个参数设置DiskStore（磁盘缓存）的缓存区大小。默认是30MB。每个Cache都应该有自己的一个缓冲区。  
9.	       maxElementsOnDisk：硬盘最大缓存个数。  
10.	       diskPersistent：是否缓存虚拟机重启期数据 Whether the disk store persists between restarts of the Virtual Machine. The default value is false.  
11.	       diskExpiryThreadIntervalSeconds：磁盘失效线程运行时间间隔，默认是120秒。  
12.	       memoryStoreEvictionPolicy：当达到maxElementsInMemory限制时，Ehcache将会根据指定的策略去清理内存。默认策略是LRU（最近最少使用）。你可以设置为FIFO（先进先出）或是LFU（较少使用）。  
13.	       clearOnFlush：内存数量最大时是否清除。  
14.	    --> 
```

#### 7.1.3代码使用Cacheable

```java
@CacheConfig(cacheNames = "baseCache")
public interface UserMapper {
	@Select("select * from users where name=#{name}")
	@Cacheable
	UserEntity findName(@Param("name") String name);
}
```

#### 7.1.4清除缓存

```java
@Autowired
private CacheManager cacheManager;
@RequestMapping("/remoKey")
public void remoKey() {
	cacheManager.getCache("baseCache").clear();
}
```

#### 7.1.5 启动加入缓存

@EnableCaching// 开启缓存注解

### [使用Redis做集中式缓存](http://blog.didispace.com/springbootcache2/)



# 八、 其他内容

### 8.1、[使用@Scheduled创建定时任务](http://blog.didispace.com/springbootscheduled/)

在Spring Boot的主类中加入@EnableScheduling注解，启用定时任务的配置

```java
@Component
public class ScheduledTasks {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("现在时间：" + dateFormat.format(new Date()));
    }
}
```

### 8.2、[使用@Async实现异步调用](http://blog.didispace.com/springbootasync/)

启动加上@EnableAsync ,需要执行异步方法上加入   @Async

### 8.3、自定义参数

配置文件值

```
name=itmayiedu.com
```

配置文件值

```java
	@Value("${name}")
	private String name;
@ResponseBody
	@RequestMapping("/getValue")
	public String getValue() {
		return name;
	}
```

### 8.4、多环境配置

```
spring.profiles.active=pre

application-dev.properties：开发环境
application-test.properties：测试环境
application-prod.properties：生产环境
```

### 8.5、修改端口号

server.port=8888 

server.context-path=/itmayiedu

### 8.6、SpringBoot yml 使用

创建application.yml

```yml
server:
  port:  8090
  context-path: /itmayiedu
```

### 8.7、发布打包

使用mvnpackage 打包

使用java–jar 包名

如果报错没有主清单,在pom文件中新增

```xml
<build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<configuration>
					<source>1.8</source>
					<target>1.8</target>
				</configuration>
			</plugin>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
				<configuration>
					<maimClass>com.itmayiedu.app.App</maimClass>
				</configuration>
				<executions>
					<execution>
						<goals>
							<goal>repackage</goal>
						</goals>
					</execution>
				</executions>

			</plugin>
		</plugins>
	</build>
```

