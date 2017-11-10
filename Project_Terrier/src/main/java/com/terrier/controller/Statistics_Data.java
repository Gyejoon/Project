package com.terrier.controller;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.terrier.domain.Control_count_VO;
import com.terrier.domain.S_mgt_date_con_count_VO;
import com.terrier.domain.S_mgt_dep_date_con_count_VO;
import com.terrier.service.S_mgt_Service;

@RestController
@RequestMapping("terrier/*")
public class Statistics_Data {
	
	@Inject
	S_mgt_Service s_mgt_service;
	
	@RequestMapping(value="statistics_management/dateSerach_on_off",method=RequestMethod.POST)//��¥ ���
	public ResponseEntity<Control_count_VO> dateSerach_on_off(@RequestBody S_mgt_date_con_count_VO vo) throws Exception
	{//�ش� �޼ҵ�� 2�������δ� ajax�� 2���ϱ⋚����measurement_mgt ��ũ��Ʈ Ȯ���غ��� �˼�����
		Control_count_VO on_off=s_mgt_service.date_count_on_off(vo);//on�� ���� ������ �̱����ؼ�			
		ResponseEntity<Control_count_VO> entity=null;
		try 
		{
			entity=new ResponseEntity<Control_count_VO>(on_off,HttpStatus.OK);
		}
		catch (Exception e)
		{
			entity=new ResponseEntity<Control_count_VO>(HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
	
	@RequestMapping(value="statistics_management/fi_dep_dateSerach_on",method=RequestMethod.POST)//��¥ ���
	public ResponseEntity<Control_count_VO> fi_dep_dateSerach_on(@RequestBody S_mgt_dep_date_con_count_VO vo) throws Exception
	{
		System.out.println(vo.getDate());
		System.out.println(vo.getDep());
		System.out.println(vo.getController());
		Control_count_VO on=s_mgt_service.dep_date_conunt(vo);//on�� ���� ������ �̱����ؼ�			
		ResponseEntity<Control_count_VO> entity=null;
		try 
		{
			entity=new ResponseEntity<Control_count_VO>(on,HttpStatus.OK);
		}
		catch (Exception e)
		{
			entity=new ResponseEntity<Control_count_VO>(HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
	
	@RequestMapping(value="statistics_management/dep_dateSerach_on_off",method=RequestMethod.POST)//�μ�,��¥ ���
	public ResponseEntity<Control_count_VO> dep_dateSerach_on_off(@RequestBody S_mgt_dep_date_con_count_VO vo) throws Exception
	{//�ش� �޼ҵ�� 2�������δ� ajax�� 2���ϱ⋚����measurement_mgt ��ũ��Ʈ Ȯ���غ��� �˼�����
		Control_count_VO on_off=s_mgt_service.dep_date_conunt(vo);//on�� ���� ������ �̱����ؼ�			
		ResponseEntity<Control_count_VO> entity=null;
		try 
		{
			entity=new ResponseEntity<Control_count_VO>(on_off,HttpStatus.OK);
		}
		catch (Exception e)
		{
			entity=new ResponseEntity<Control_count_VO>(HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
	
	
	/*		private int wifi;
  	private int bluetooth;
  	private int tethering;
  	private int camera;
  	private int voiceRecord;*/


}
