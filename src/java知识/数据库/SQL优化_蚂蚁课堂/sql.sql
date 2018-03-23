
/*部门表*/
CREATE TABLE dept(
deptno MEDIUMINT   UNSIGNED  NOT NULL  DEFAULT 0,  /*编号*/
dname VARCHAR(20)  NOT NULL  DEFAULT "", /*名称*/
loc VARCHAR(13) NOT NULL DEFAULT "" /*地点*/
) ENGINE=MyISAM DEFAULT CHARSET=utf8 ;
/*员工表*/
CREATE TABLE emp
(empno  MEDIUMINT UNSIGNED  NOT NULL  DEFAULT 0, /*编号*/
ename VARCHAR(20) NOT NULL DEFAULT "", /*名字*/
job VARCHAR(9) NOT NULL DEFAULT "",/*工作*/
mgr MEDIUMINT UNSIGNED NOT NULL DEFAULT 0,/*上级编号*/
hiredate DATE NOT NULL,/*入职时间*/
sal DECIMAL(7,2)  NOT NULL,/*薪水*/
comm DECIMAL(7,2) NOT NULL,/*红利*/
deptno MEDIUMINT UNSIGNED NOT NULL DEFAULT 0 /*部门编号*/
)ENGINE=MyISAM DEFAULT CHARSET=utf8 ;



/*薪水*/
CREATE TABLE salgrade
(
grade MEDIUMINT UNSIGNED NOT NULL DEFAULT 0,
losal DECIMAL(17,2)  NOT NULL,
hisal DECIMAL(17,2)  NOT NULL
)ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*测试数据*/

INSERT INTO salgrade VALUES (1,700,1200);
INSERT INTO salgrade VALUES (2,1201,1400);
INSERT INTO salgrade VALUES (3,1401,2000);
INSERT INTO salgrade VALUES (4,2001,3000);
INSERT INTO salgrade VALUES (5,3001,9999);

create function rand_string(n INT)
returns varchar(255) #该函数会返回一个字符串
begin
#chars_str定义一个变量 chars_str,类型是 varchar(100),默认值'abcdefghijklmnopqrstuvwxyzABCDEFJHIJKLMNOPQRSTUVWXYZ';
 declare chars_str varchar(100) default
   'abcdefghijklmnopqrstuvwxyzABCDEFJHIJKLMNOPQRSTUVWXYZ';
 declare return_str varchar(255) default '';
 declare i int default 0;
 while i < n do
   set return_str =concat(return_str,substring(chars_str,floor(1+rand()*52),1));
   set i = i + 1;
   end while;
  return return_str;
  end


create FUNCTION rand_num()
RETURNS int(5)
BEGIN
 DECLARE i int default 0;
 set i =floor(10+RAND()*500);
 return i;
END


delimiter $$
create procedure insert_emp(in start int(10),in max_num int(10))
begin
declare i int default 0;
#set autocommit =0 把autocommit设置成0
 set autocommit = 0;
 repeat
 set i = i + 1;
 insert into emp values ((start+i) ,rand_string(6),'SALESMAN',0001,curdate(),2000,400,rand_num());
  until i = max_num
 end repeat;
   commit;
 end $$

select * from emp;

call insert_emp (100001,4000000);



show status like 'connections';


-- 查询慢查询次数
show status like 'slow_queries';
-- 查询慢查询时间
show variables like 'long_query_time';
-- 修改为1秒
set long_query_time=1;


-- 没有索引查询时间 15.797.s 3.123s
select * from emp where empno='123456';

-- 加上主键索引 时间：0.006s 时间：0.003 时间：0.001s 时间：0.004s
alter table emp add primary key (empno);

select * from emp where empno='123456';