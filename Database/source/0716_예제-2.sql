-- 1. ��� ���̺��� �μ��� �ο����� 6�� �̻��� �μ��ڵ�
select deptno, count(empno) 
from emp
group by deptno
having count(empno) >=6;

-- 2. ��� ���̺�κ��� �⵵��, ���� �޿��հ踦 ����ϴ� SQL��
select to_char(hiredate, 'yyyy') "��"
, to_char(hiredate, 'mm') "��", sum(sal) 
from emp
group by to_char(hiredate, 'yyyy'), to_char(hiredate, 'mm')
order by "��";

--3. ��� ���̺��� job�� �ο����� �� �ο���
select job, count(job), count(*)
from emp
group by job;

select decode(job,'CLERK', sum(1), 0) "CLERK" , 
       decode(job,'SALESMAN', sum(1),0) "SALESMAN",
       decode(job,'MANAGER', sum(1),0) "MANAGER",
       decode(job,'ANALYST', sum(1),0) "ANALYST",
       decode(job,'PRESIDENT', sum(1),0) "PRESIDENT",
       count(*)
from emp
group by job;


 


