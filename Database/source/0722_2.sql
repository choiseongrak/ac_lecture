-- sys -- 
create user tester identified by tester; --���� ����
alter user tester account unlock; -- lock ����
grant connect, resource to tester; -- ���� �ο�
alter user tester identified by tester; -- �н����� ����
-- �� �����ͺ��̽� �����Ͽ� ���� ����

-- user01 --
select * from session_privs;
-- scott --
grant select --dept ���̺� ���� select ���Ѻο�
on dept
to user01;
-- user01 -- 
select * from dept; --����� ���� ���ؼ� ����

select * from scott.dept;
-- scott --
grant update(dname) --dept ���̺� ���� update ���Ѻο�
on dept
to user01;

-- user01 --
update scott.dept -- loc���� ��� ���� ����� ����
set loc = 'AAA'; 

update scott.dept
set dname = '�λ�'
where deptno = 40;


