-- 1. ��� ���̺��� BLAKE���� �޿��� ���� ������� ���, �̸�, �޿� 
select empno, ename, sal
from emp 
where sal > (select sal 
             from emp
             where ename ='BLAKE');
-- 2. ��� ���̺��� MILLER���� �ʰ� �Ի��� ������� ���, �̸�, �Ի���         
select empno, ename, hiredate
from emp 
where hiredate > (select hiredate 
             from emp
             where ename ='MILLER');
-- 3. ��� ���̺��� ��� ��ü ��� �޿����� �޿��� ���� ������� ���, �̸�, �޿�              
select empno, ename, sal
from emp 
where sal > (select avg(sal) 
             from emp);
             
-- 4.��� ���̺��� �μ��� �ִ� �޿��� �޴� ������� ���, �̸�, �μ��ڵ�, �޿�
select empno, ename, deptno, sal
from emp 
where sal in (select max(sal)
              from emp
              group by deptno);

-- 5. Salgrade�� 2����� ������� ��� �޿����� ���� �޴� ��� ������ �˻�
select * 
from emp
where sal <= (select avg(sal)
              from emp e join salgrade s
              on e.sal between s.losal and s.hisal
              where s.grade = 2);
            
              
      
             
             