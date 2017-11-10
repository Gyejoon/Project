package com.terrier.persistence;

import java.util.Date;
import java.util.List;

import com.terrier.domain.Control_count_VO;
import com.terrier.domain.Dep_ctl_status_VO;
import com.terrier.domain.S_mgt_date_con_count_VO;
import com.terrier.domain.S_mgt_dep_date_con_count_VO;

public interface S_mgt_DAO {
	public Control_count_VO control_count(String status);
	public int dep_ctl_on_count(String department);
	public Control_count_VO dep_ctl_status(Dep_ctl_status_VO vo);
	public String nowDate()throws Exception;//��¥�� ������ ������ ���糯¥ ���
	public Control_count_VO date_count_on_off(S_mgt_date_con_count_VO vo)throws Exception;//��¥�� �����ָ� ON ī��Ʈ����
	public Control_count_VO dep_date_conunt(S_mgt_dep_date_con_count_VO vo)throws Exception;//�μ� ��¥ �� �������ָ�
}
