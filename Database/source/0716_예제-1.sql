-- 1. ������̺��� �Ի����� 12���� ����� ���, �����, �Ի��� 
select empno, ename, hiredate
from emp where to_char(hiredate, 'mm') = '12';

-- 2. ������ ���� ����� �˻��� �� �ִ� SQL��
--    (���, �̸�, �޿� 10�ڸ�(�� �ڸ��� '*' ä��)
select empno, ename, lpad(sal, 10, '*') from emp;

-- 3. ������ ���� ����� �˻��� �� �ִ� SQL��
--    (���, �̸�, �Ի���(YYYY-MM-DD)����
select empno, ename, to_char(hiredate, 'yyyy-mm-dd')"�Ի���" 
from emp;

-- 4. ������̺��� ��������� �Ϲݻ�� �����Ͽ� ���
--CASE��
select empno, ename, comm, 
 case when comm is null then '�Ϲݻ��'
      else '�������' end "�������" 
from emp;
--DECODE�� 
select empno, ename, comm, 
 decode(comm, null, '�Ϲݻ��', '�������') "�������"
from emp;

-- 5. �μ� ���̺��� �μ� ��ġ�� �̱��� ����, ����, �ߺη� ����
select * from dept;
--CASE��
select loc
, case loc when 'NEW YORK' then 'EAST'
           when 'BOSTON' then 'EAST' else 'CENTER' end "AREA"
from dept;

--DECODE��
select loc
, decode (loc, 'NEW YORK', 'EAST'
           ,'BOSTON', 'EAST', 'CENTER') "AREA"
from dept;

-- 6. ������̺��� �޿��� 2000�̻��̸� ���ʽ��� 1000, 
--    1000�̻��̸� 500, 1000�̸��̸� 0���� ����Ͽ� ���
--CASE��
select ename, sal
, case when sal>=2000 then 1000
       when sal>=1000 then 500
       else 0 end "BONUS" 
from emp;

-- 7. ��� ���̺��� �޿��� ���� ���, �̸�, �޿�, ����� �˻��ϴ� SQL��
--    (CASE�Լ��� DECODE ���� ����, DECODE ���� SIGN�Լ� ���)
--CASE��
select * from emp;
select empno, ename, sal
, case when sal<=5000 and sal>4000 then 'A'
       when sal<=4000 and sal>3000 then 'B'
       when sal<=3000 and sal>2000 then 'C'
       when sal<=2000 and sal>1000 then 'D'
       else 'E' end "���" 
from emp order by sal desc;

--DECODE�� / �̿ϼ�
select empno, ename, sal
, decode (-1,sign(sal-1001), 'E',
             sign(sal-2001), 'D',
             sign(sal-3001), 'C',
             sign(sal-4001), 'B', 'A')
from emp;