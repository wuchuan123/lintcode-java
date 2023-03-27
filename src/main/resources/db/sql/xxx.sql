select department,  avg(salary) as average_salary from employee
group by department
order by average_salary desc
# // avg 平均数函数  group by 对相同数据进行分组   order by 排序 desc 降序排序，默认升序

select id from sales
where sales_sum=(select max(sales_sum) from sales)
# // select 选择什么才展示什么  where条件查询， max 返回这列的最大值，要配合select使用

select id from sales
order by sales_sum desc limit 1
# // limit返回几条数据

select student_count from courses
where name="Web"
#     // where

# https://www.jianshu.com/p/7b2d74701ccd  存储过程详解
create procedure GetTotalTeacher()  # 创建一个存储过程 存储过程就是一个方法，为了复用
begin
    declare totalTeacher int default 0;
    SELECT count(*) into totalTeacher FROM teachers;# into 是数据库的值赋给变量
    SELECT totalTeacher;
end;

create procedure UpdateTeacherAge(INOUT age int,IN inc int)
begin
    set age=age+inc; # 设置变量
    update teachers set age=age; # update 语句， 结合set使用
end;

DROP PROCEDURE getTeachers; # 删除一个存储过程

DROP PROCEDURE if exists getTeachers_2; # exists EXISTS 运算符用于判断查询子句是否有记录，如果有一条或多条记录存在返回 True，
# 否则返回 False。

-- 写法1：使用INNER JOIN
SELECT A.学号, A.姓名, A.籍贯, A.年龄, B.专业, B.班级
FROM student A # 表别名 A 只能在select时使用
         INNER JOIN major B
                    ON  A.学号=B.学号

alter table courses add FOREIGN KEY (teacher_id)  REFERENCES teachers (id) # 为表格添加外键

select * from employees where hire_date=(select max(hire_date) from employees);

# 找倒数第3个 https://www.runoob.com/note/28032 limit的用法
select * from employees order by hire_date desc
limit 2,1;