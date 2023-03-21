select department,  avg(salary) as average_salary from employee
group by department
order by average_salary desc
// avg 平均数函数  group by 对相同数据进行分组   order by 排序 desc 降序排序，默认升序

select id from sales
where sales_sum=(select max(sales_sum) from sales)
// select 选择什么才展示什么  where条件查询， max 返回这列的最大值，要配合select使用

select id from sales
order by sales_sum desc limit 1
// limit返回几条数据

select student_count from courses
where name="Web"  // where