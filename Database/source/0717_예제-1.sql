-- 1. �μ� ���̺�� ������̺��� ���, �����, �μ��ڵ�, �μ��� �˻�(����� ��������)

--Oracle Join
select e.empno, e.ename, d.deptno, d.dname
from emp e, dept d
where e.deptno = d.deptno
order by e.ename;

--ANSI Join
select empno, ename, deptno, dname
from emp
natural join dept;

-- 2. �μ� ���̺�� ������̺��� ���, �����, �޿�, �μ��� �˻� 
--    ��, �޿��� 2000�̻��� ����� ���Ͽ� �޿��������� �������� 

--Oracle Join
select e.empno, e.ename, e.sal, d.dname
from emp e, dept d
where e.deptno = d.deptno and e.sal >= 2000
order by sal desc;

--ANSI Join
select empno, ename, sal, dname
from emp
natural join dept
where sal >= 2000
order by sal desc;

-- 3. �μ� ���̺�� ��� ���̺��� ���, �����, ����, �޿�, �μ����� �˻��Ͻÿ�. 
-- ��, ������ Manager�̸� �޿��� 2500 �̻��� ����� ���Ͽ� ����� �������� ��������

--Oracle Join
select e.empno, e.ename, e.job, e.sal, d.dname
from emp e, dept d
where e.deptno = d.deptno 
and e.job = 'MANAGER' and e.sal>= 2500
order by e.empno;

--ANSI Join
select empno, ename, job, sal, dname
from emp 
natural join dept  
where job = 'MANAGER' and sal>= 2500
order by empno;

-- 4. ��� ���̺�� �޿� ��� ���̺��� ���, �����, �޿�, ����� �˻�
--    ��, ����� �޿��� ���Ѱ�,���Ѱ� ������ ����, ����� 4�̸� �޿��� �������� ��������

--Oracle Join
select e.empno, e.ename, e.sal, s.grade
from emp e, salgrade s
where e.sal between losal and hisal 
and s.grade = 4
order by e.sal desc;

--ANSI Join
select e.empno, e.ename, e.sal, s.grade
from emp e
join salgrade s
on e.sal between s.losal and s.hisal 
where s.grade = 4
order by e.sal desc;

-- 5. �μ� ���̺�, ��� ���̺�, �޿���� ���̺��� ���, �����,�μ���, �޿�, ��� �˻�
--    ��, ����� �޿��� ���Ѱ��� ���Ѱ� ������ ���ԵǸ� ����� �������� ��������

--Oracle Join
select e.empno, e.ename, d.dname, e.sal, s.grade
from emp e, dept d, salgrade s 
where e.deptno = d.deptno and e.sal between losal and hisal
order by s.grade desc;

--ANSI Join
select empno, ename, dname, sal, grade
from emp e
join dept d  
on e.deptno = d.deptno 
join salgrade s
on e.sal between losal and hisal
order by s.grade desc;
-- 6. ��� ���̺��� ������ �ش� ����� �����ڸ��� �˻�

--Oracle Join
select e1.ename, e2.ename
from emp e1, emp e2
where e1.mgr = e2.empno;

--ANSI Join
select e1.ename, e2.ename
from emp e1
join emp e2
on e1.mgr = e2.empno;
-- 7. ������̺��� �����, �ش� ����� �����ڸ�, �ش� ����� �������� �����ڸ��� �˻�

--Oracle Join
select e1.ename, e2.ename, e3.ename
from emp e1, emp e2, emp e3
where e1.mgr = e2.empno and e2.mgr = e3.empno;

--ANSI Join
select e1.ename, e2.ename, e3.ename
from emp e1
join emp e2
on e1.mgr = e2.empno 
join emp e3
on e2.mgr = e3.empno;
-- 8. 7�� ������� ���� �����ڰ� ���� ��� ����� �̸��� ����� ��µǵ��� ����

--Oracle Join
select e1.ename, e2.ename, e3.ename
from emp e1, emp e2, emp e3
where e1.mgr = e2.empno(+) and e2.mgr = e3.empno(+);

--ANSI Join
select e1.ename, e2.ename, e3.ename
from emp e1 
left outer join emp e2
on e1.mgr = e2.empno
left outer join emp e3
on e2.mgr = e3.empno;
-- 9. 20�� �μ��� �̸��� �� �μ��� �ٹ��ϴ� ����� �̸��� ���

--Oracle Join
select d.dname, e.ename
from emp e, dept d
where e.deptno = d.deptno
and d.deptno = 20 and e.deptno = 20;

--ANSI Join
select d.dname, e.ename
from emp e, dept d
where e.deptno = d.deptno
and d.deptno = 20 and e.deptno = 20;

-- 10. Ŀ�̼��� �޴� ����� �̸�, Ŀ�̼�, �μ��̸� ���

--Oracle Join
select e.ename, e.comm, d.dname
from emp e, dept d
where e.deptno = d.deptno
and e.comm is not null;

--ANSI Join
select e.ename, e.comm, d.dname
from emp e
join dept d
on e.deptno = d.deptno
where e.comm is not null;

-- 11. �̸��� A�� ���� ������� �̸�, �μ��̸� ���

--Oracle Join
select e.ename, d.dname
from emp e, dept d
where e.deptno = d.deptno
and e.ename like '%A%';

--ANSI Join
select e.ename, d.dname
from emp e
join dept d
on e.deptno = d.deptno
where e.ename like '%A%';

-- 12. DALLAS �������� �ٹ��ϴ� ��� �� �޿� 1500�̻��� ����� �̸�, �޿�, �Ի���,
--     ���ʽ�(comm)�� ���

--Oracle Join
select ename, sal, hiredate, comm
from emp e, dept d
where e.deptno = d.deptno
and loc = 'DALLAS' and sal>=1500;

--ANSI Join
select ename, sal, hiredate, comm
from emp e
join dept d
on e.deptno = d.deptno
where loc = 'DALLAS' and sal>=1500;

-- 13. �ڽ��� �����ں��� ����(sal)�� ���� �޴� ����� �̸��� ������ ���

--Oracle Join
select e1.ename, e1.sal
from emp e1, emp e2
where e1.mgr = e2.empno
and e1.sal > e2.sal;

--ANSI Join
select e1.ename, e1.sal
from emp e1
join emp e2
on e1.mgr = e2.empno
where e1.sal > e2.sal;

-- 14. ���� �� ����ð� �������� �ٹ� ���� ���� 30��(12*30)���� ���� ����� �̸�,
--     �޿�, �Ի���, �μ��� ���

--Oracle Join
select e.ename, e.sal, e.hiredate, d.dname
from emp e, dept d
where e.deptno = d.deptno 
and (sysdate-e.hiredate)/365 >= 30;

select e.ename, e.sal, e.hiredate, d.dname
from emp e, dept d
where e.deptno = d.deptno 
and months_between(sysdate, hiredate) > (12*30);

--ANSI Join
select e.ename, e.sal, e.hiredate, d.dname
from emp e
join dept d
on e.deptno = d.deptno 
where (sysdate-e.hiredate)/365 >= 30;

select e.ename, e.sal, e.hiredate, d.dname
from emp e
join dept d
on e.deptno = d.deptno 
where months_between(sysdate, hiredate) > (12*30);

-- 15. �� �μ����� 1982�� ������ �Ի��� �������� �ο����� ���

--Oracle Join
select count(empno)
from emp e, dept d
where e.deptno = d.deptno
and to_char(e.hiredate, 'yyyy') < 1982
group by d.deptno;

--ANSI Join
select count(empno)
from emp e
join dept d
on e.deptno = d.deptno
where to_char(e.hiredate, 'yyyy') < 1982
group by d.deptno;

