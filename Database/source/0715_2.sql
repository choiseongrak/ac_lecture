SELECT EMPNO, ENAME, JOB FROM EMP WHERE ENAME LIKE 'A%';
SELECT EMPNO, ENAME, JOB FROM EMP WHERE ENAME LIKE '%A';
SELECT EMPNO, ENAME, JOB FROM EMP WHERE ENAME LIKE '%T%';
SELECT EMPNO, ENAME, JOB FROM EMP WHERE ENAME LIKE '_L%';
-- ���ڿ��� ���� ��Ī �����ڰ� ���� �� ���
SELECT EMPNO, ENAME, JOB FROM EMP WHERE ENAME LIKE '%\_%' ESCAPE '\';
-- EMP ���̺����� JOB�� 'CLERK'�̰ų� 'ANALYST'�̰�,
-- COMM�� NULL�̰� SAL�� 1000���� ũ�� 3000���� ���� ��� ����
SELECT * FROM EMP WHERE (JOB = 'CLERK' OR JOB = 'ANALYST') AND
COMM IS NULL AND SAL >= 1000 AND SAL <= 3000 ; 

SELECT EMPNO, ENAME, HIREDATE FROM EMP ORDER BY HIREDATE; -- �⺻�� ASC(��������)
SELECT EMPNO, ENAME, HIREDATE FROM EMP ORDER BY HIREDATE DESC; -- ��������
SELECT EMPNO, ENAME, SAL * 12 "ANNUAL" FROM EMP ORDER BY "ANNUAL";
SELECT EMPNO, ENAME, SAL * 12 "ANNUAL" FROM EMP ORDER BY 3; -- ����° �÷� ����
SELECT EMPNO, ENAME, SAL FROM EMP ORDER BY SAL DESC, EMPNO; -- SAL���� ���� �� EMPNO���� ����