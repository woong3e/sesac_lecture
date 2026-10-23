select category_code,category_name from tbl_category where category_code is not null order by category_name desc;

select menu_name,menu_price from tbl_menu where menu_name like '%밥%' and menu_price between 20000 and 30000;
-- 미만과 초과일때는 어떻게 사용할까? -> where menu_price >20000 and menu_price < 30000;
/* BETWEEN A AND B → A 이상 B 이하
   > A AND < B → A 초과 B 미만 */

select * from tbl_menu where menu_price < 10000 or menu_name like '%김치%' order by menu_price asc,menu_name desc;
-- like menu_name = '%김치%' xxx
-- menu_name like '%김치%' ooo

select * 
from tbl_menu 
where category_code 
not in (8,9,10)
and menu_price = 13000 
and orderable_status 
not in ('N');
-- in과 not in은 값을 반드시 괄호 안에 넣어야 한다.

-- -----------------------------------

select emp_id,emp_name,phone,hire_date,ent_yn 
from employee 
where ent_yn = 'N' 
and phone 
like '%2' 
order by hire_date desc 
limit 3;

select emp_name,job_name,salary,emp_id,email,phone,hire_date 
from employee e 
join job j on e.job_code = j.job_code
where j.job_name ='대리'
and e.ent_yn ='N' 
order by salary desc;

select * from employee;
select * from job;

select
    d.dept_title as '부서명',
    count(*) as '인원',
    sum(e.salary) as '급여합계',
    avg(e.salary) as '급여평균'
from employee e
join department d on e.dept_code = d.dept_id
where e.ent_yn = 'N'
group by d.dept_title with rollup;

select e.emp_name,e.emp_no,e.phone,d.dept_title,j.job_name 
from employee e 
left join department d on e.dept_code = d.dept_id 
right join job j on e.job_code = j.job_code 
order by e.hire_date asc;

-- 2-5-1
select count(*) from employee where manager_id is not null;
-- 2-5-2
select count(*)
from employee e
join employee m on e.manager_id = m.emp_id;
-- 2-5-3
select
    e.emp_name,
    m.emp_name
from employee e
left join employee m on e.manager_id = m.emp_id
order by e.emp_name asc;
-- 2-5-4
select
    e.emp_name,
    d1.dept_title,
    m.emp_name,
    d2.dept_title
from employee e
join employee m on e.manager_id = m.emp_id
left join department d1 on e.dept_code = d1.dept_id
left join department d2 on m.dept_code = d2.dept_id
order by e.emp_name asc;

-- 3-1 부서별 직원 급여의 총합 중 가장 큰 액수를 출력하세요/ 부서별로 직원급여의 총합을 그룹짓고 그 중 가장 큰 걸 출력
select sum(salary)
from employee
group by dept_code
order by sum(salary) desc
limit 1;

-- 3-2 
select emp_id, emp_name, dept_code, salary
from employee
where dept_code in (
    select dept_id
    from department
    where dept_title like '%영업%'
)
order by 
dept_code asc,
salary asc;

-- 3-3
select
    e.emp_id,
    e.emp_name,
    d.dept_title,
    e.salary
from employee e
join department d on e.dept_code = d.dept_id
where e.dept_code in (
    select dept_id
    from department
    where dept_title like '%영업%'
)
order by
dept_title asc;

