package com.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.dto.PageDTO;
import com.dto.StudentDTO;

public class StudentDAO {

	public int totalCount(SqlSession session) {
		// ��ü ��ϼ� ���ϱ� 
	}
	
    public PageDTO selectAllPageStudent(SqlSession session, int curPage){
		
   

		//PageDTO ����
		//�������� �Խù����� curPage �̿� offset ���ϱ� (������)
		//����Ʈ�� �ش� �Խù��� select
		//pDTO��  curpage, perPage, totalpage, list ���� ����

	}
	
}
