package com.entity.vo;

import com.entity.TiyuyundongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 体育运动
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-21 18:56:45
 */
public class TiyuyundongVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 师生姓名
	 */
	
	private String shishengxingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 出生日期
	 */
	
	private String chushengriqi;
		
	/**
	 * 身份证号
	 */
	
	private String shenfenzhenghao;
		
	/**
	 * 学院
	 */
	
	private String xueyuan;
		
	/**
	 * 远动会记录
	 */
	
	private String yuandonghuijilu;
		
	/**
	 * 体育课成绩
	 */
	
	private String tiyukechengji;
		
	/**
	 * 擅长运动
	 */
	
	private String shanzhangyundong;
		
	/**
	 * 荣誉称号
	 */
	
	private String rongyuchenghao;
		
	/**
	 * 教练账号
	 */
	
	private String jiaolianzhanghao;
		
	/**
	 * 教练姓名
	 */
	
	private String jiaolianxingming;
				
	
	/**
	 * 设置：师生姓名
	 */
	 
	public void setShishengxingming(String shishengxingming) {
		this.shishengxingming = shishengxingming;
	}
	
	/**
	 * 获取：师生姓名
	 */
	public String getShishengxingming() {
		return shishengxingming;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：出生日期
	 */
	 
	public void setChushengriqi(String chushengriqi) {
		this.chushengriqi = chushengriqi;
	}
	
	/**
	 * 获取：出生日期
	 */
	public String getChushengriqi() {
		return chushengriqi;
	}
				
	
	/**
	 * 设置：身份证号
	 */
	 
	public void setShenfenzhenghao(String shenfenzhenghao) {
		this.shenfenzhenghao = shenfenzhenghao;
	}
	
	/**
	 * 获取：身份证号
	 */
	public String getShenfenzhenghao() {
		return shenfenzhenghao;
	}
				
	
	/**
	 * 设置：学院
	 */
	 
	public void setXueyuan(String xueyuan) {
		this.xueyuan = xueyuan;
	}
	
	/**
	 * 获取：学院
	 */
	public String getXueyuan() {
		return xueyuan;
	}
				
	
	/**
	 * 设置：远动会记录
	 */
	 
	public void setYuandonghuijilu(String yuandonghuijilu) {
		this.yuandonghuijilu = yuandonghuijilu;
	}
	
	/**
	 * 获取：远动会记录
	 */
	public String getYuandonghuijilu() {
		return yuandonghuijilu;
	}
				
	
	/**
	 * 设置：体育课成绩
	 */
	 
	public void setTiyukechengji(String tiyukechengji) {
		this.tiyukechengji = tiyukechengji;
	}
	
	/**
	 * 获取：体育课成绩
	 */
	public String getTiyukechengji() {
		return tiyukechengji;
	}
				
	
	/**
	 * 设置：擅长运动
	 */
	 
	public void setShanzhangyundong(String shanzhangyundong) {
		this.shanzhangyundong = shanzhangyundong;
	}
	
	/**
	 * 获取：擅长运动
	 */
	public String getShanzhangyundong() {
		return shanzhangyundong;
	}
				
	
	/**
	 * 设置：荣誉称号
	 */
	 
	public void setRongyuchenghao(String rongyuchenghao) {
		this.rongyuchenghao = rongyuchenghao;
	}
	
	/**
	 * 获取：荣誉称号
	 */
	public String getRongyuchenghao() {
		return rongyuchenghao;
	}
				
	
	/**
	 * 设置：教练账号
	 */
	 
	public void setJiaolianzhanghao(String jiaolianzhanghao) {
		this.jiaolianzhanghao = jiaolianzhanghao;
	}
	
	/**
	 * 获取：教练账号
	 */
	public String getJiaolianzhanghao() {
		return jiaolianzhanghao;
	}
				
	
	/**
	 * 设置：教练姓名
	 */
	 
	public void setJiaolianxingming(String jiaolianxingming) {
		this.jiaolianxingming = jiaolianxingming;
	}
	
	/**
	 * 获取：教练姓名
	 */
	public String getJiaolianxingming() {
		return jiaolianxingming;
	}
			
}
