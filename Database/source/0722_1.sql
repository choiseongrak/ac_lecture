-- sys �������� soctt���� view ���� ���� �Ҵ�
-- grant create view to scott;

create view emp_view
as 
select empno, ename, sal, hiredate
from emp
where deptno = 10;

select * from emp_view;

create view dept_view
as 
select deptno no, dname name
from dept;

select view_name
from user_views;

create or replace view dept_view  --������ ������ ����, ������ ����
as 
select deptno no, dname name, loc
from dept;

create view emp_dept_view -- ���� �� (join�ؼ� Ȯ���ؾ� �ϴ� ����� ��� ����)
as
select empno, ename, dname
from emp e, dept d
where e.deptno = d.deptno
and d.deptno = 30;

select * from emp_dept_view;

create or replace view emp_view
as
select * from emp
where deptno=10
with check option constraint emp_view10_check;

update emp_view
set deptno = 20 where ename = 'KING'; -- check �������� ���褤

create or replace view dept_view
as
select * from emp
where deptno=10
with read only;

drop view dept_view;

-- emp�� dept���̺��� �μ��� sal ���հ� ����� ���
-- �ζ��� ��
select e.deptno, total_sum, total_avg, cnt
from ( select deptno, sum(sal) total_sum, avg(sal) total_avg, count(*) cnt
from emp
group by deptno ) e, dept d
where e.deptno = d.deptno;

-- �μ��� ��� �޿����� ���� �޿��� �޴� ����� ����
-- �ζ��� ��
select e.ename, e.sal, e.deptno, d.salavg
from emp e
, (select deptno, avg(sal) salavg       
   from emp 
   group by deptno) d
where e.deptno = d.deptno
and e.sal > d.salavg;

create sequence emp_seq -- ������ ����
start with 100  --���۹�ȣ
increment by 1 --���� ��
maxvalue 9999 --�ִ� ��
nocache 
nocycle;

select sequence_name, min_value, max_value, increment_by
from user_sequences; --������ ������ ��ȸ

select * from emp;

insert into emp
values( emp_seq.nextval, '�ܱ�', '�λ�', '', sysdate, 2500, 300, 40);
select empno from emp where empno = 101;

select emp_seq.currval from dual;

alter sequence emp_seq -- ������ ����
increment by 2
maxvalue 10000
nocache
nocycle;

drop sequence emp_seq;

create sequence dept_deptno_seq
    start with 10
    increment by 10
    maxvalue 100
    minvalue 5
    cycle
    nocache;
select * from dept;

delete from dept where deptno = 90;

select dept_deptno_seq.nextval,
    dept_deptno_seq.currval
    from dual; --������ �� ����

insert into dept 
values(dept_deptno_seq.nextval, '�λ�', 'SEOUL');

select * from emp where ename = 'SMITH';

create index emp_ename_idx
on emp(ename);

select * from emp
where ename='SMITH';

drop index emp_ename_idx;
