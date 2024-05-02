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
 * 生活习惯
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-21 18:56:45
 */
@TableName("shenghuoxiguan")
public class ShenghuoxiguanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShenghuoxiguanEntity() {
		
	}
	
	public ShenghuoxiguanEntity(T t) {
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
	 * 熬夜
	 */
					
	private String aoye;
	
	/**
	 * 按时早餐
	 */
					
	private String anshizaocan;
	
	/**
	 * 久坐
	 */
					
	private String jiuzuo;
	
	/**
	 * 定期运动
	 */
					
	private String dingqiyundong;
	
	/**
	 * 沉迷手机
	 */
					
	private String chenmishouji;
	
	/**
	 * 早睡
	 */
					
	private String zaoshui;
	
	/**
	 * 挑食
	 */
					
	private String tiaoshi;
	
	/**
	 * 作息习惯
	 */
					
	private String zuoxixiguan;
	
	/**
	 * 饮食习惯
	 */
					
	private String yinshixiguan;
	
	/**
	 * 医生账号
	 */
					
	private String yishengzhanghao;
	
	/**
	 * 医生姓名
	 */
					
	private String yishengxingming;
	
	
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
	 * 设置：熬夜
	 */
	public void setAoye(String aoye) {
		this.aoye = aoye;
	}
	/**
	 * 获取：熬夜
	 */
	public String getAoye() {
		return aoye;
	}
	/**
	 * 设置：按时早餐
	 */
	public void setAnshizaocan(String anshizaocan) {
		this.anshizaocan = anshizaocan;
	}
	/**
	 * 获取：按时早餐
	 */
	public String getAnshizaocan() {
		return anshizaocan;
	}
	/**
	 * 设置：久坐
	 */
	public void setJiuzuo(String jiuzuo) {
		this.jiuzuo = jiuzuo;
	}
	/**
	 * 获取：久坐
	 */
	public String getJiuzuo() {
		return jiuzuo;
	}
	/**
	 * 设置：定期运动
	 */
	public void setDingqiyundong(String dingqiyundong) {
		this.dingqiyundong = dingqiyundong;
	}
	/**
	 * 获取：定期运动
	 */
	public String getDingqiyundong() {
		return dingqiyundong;
	}
	/**
	 * 设置：沉迷手机
	 */
	public void setChenmishouji(String chenmishouji) {
		this.chenmishouji = chenmishouji;
	}
	/**
	 * 获取：沉迷手机
	 */
	public String getChenmishouji() {
		return chenmishouji;
	}
	/**
	 * 设置：早睡
	 */
	public void setZaoshui(String zaoshui) {
		this.zaoshui = zaoshui;
	}
	/**
	 * 获取：早睡
	 */
	public String getZaoshui() {
		return zaoshui;
	}
	/**
	 * 设置：挑食
	 */
	public void setTiaoshi(String tiaoshi) {
		this.tiaoshi = tiaoshi;
	}
	/**
	 * 获取：挑食
	 */
	public String getTiaoshi() {
		return tiaoshi;
	}
	/**
	 * 设置：作息习惯
	 */
	public void setZuoxixiguan(String zuoxixiguan) {
		this.zuoxixiguan = zuoxixiguan;
	}
	/**
	 * 获取：作息习惯
	 */
	public String getZuoxixiguan() {
		return zuoxixiguan;
	}
	/**
	 * 设置：饮食习惯
	 */
	public void setYinshixiguan(String yinshixiguan) {
		this.yinshixiguan = yinshixiguan;
	}
	/**
	 * 获取：饮食习惯
	 */
	public String getYinshixiguan() {
		return yinshixiguan;
	}
	/**
	 * 设置：医生账号
	 */
	public void setYishengzhanghao(String yishengzhanghao) {
		this.yishengzhanghao = yishengzhanghao;
	}
	/**
	 * 获取：医生账号
	 */
	public String getYishengzhanghao() {
		return yishengzhanghao;
	}
	/**
	 * 设置：医生姓名
	 */
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}

}
