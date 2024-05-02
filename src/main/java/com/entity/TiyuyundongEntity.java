package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 体育运动
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-21 18:56:45
 */
@TableName("tiyuyundong")
public class TiyuyundongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TiyuyundongEntity() {
		
	}
	
	public TiyuyundongEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 师生账号
	 */
					
	private String shishengzhanghao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：师生账号
	 */
	public void setShishengzhanghao(String shishengzhanghao) {
		this.shishengzhanghao = shishengzhanghao;
	}
	/**
	 * 获取：师生账号
	 */
	public String getShishengzhanghao() {
		return shishengzhanghao;
	}
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
