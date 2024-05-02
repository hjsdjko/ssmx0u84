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
 * 心理健康
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-21 18:56:45
 */
@TableName("xinlijiankang")
public class XinlijiankangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XinlijiankangEntity() {
		
	}
	
	public XinlijiankangEntity(T t) {
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
	 * 情绪变化
	 */
					
	private String qingxubianhua;
	
	/**
	 * 异常行动
	 */
					
	private String yichangxingdong;
	
	/**
	 * 心智水平
	 */
					
	private String xinzhishuiping;
	
	/**
	 * 人格完整
	 */
					
	private String rengewanzheng;
	
	/**
	 * 自我评价
	 */
					
	private String ziwopingjia;
	
	/**
	 * 人际关系
	 */
					
	private String renjiguanxi;
	
	/**
	 * 社会适应
	 */
					
	private String shehuishiying;
	
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
	 * 设置：情绪变化
	 */
	public void setQingxubianhua(String qingxubianhua) {
		this.qingxubianhua = qingxubianhua;
	}
	/**
	 * 获取：情绪变化
	 */
	public String getQingxubianhua() {
		return qingxubianhua;
	}
	/**
	 * 设置：异常行动
	 */
	public void setYichangxingdong(String yichangxingdong) {
		this.yichangxingdong = yichangxingdong;
	}
	/**
	 * 获取：异常行动
	 */
	public String getYichangxingdong() {
		return yichangxingdong;
	}
	/**
	 * 设置：心智水平
	 */
	public void setXinzhishuiping(String xinzhishuiping) {
		this.xinzhishuiping = xinzhishuiping;
	}
	/**
	 * 获取：心智水平
	 */
	public String getXinzhishuiping() {
		return xinzhishuiping;
	}
	/**
	 * 设置：人格完整
	 */
	public void setRengewanzheng(String rengewanzheng) {
		this.rengewanzheng = rengewanzheng;
	}
	/**
	 * 获取：人格完整
	 */
	public String getRengewanzheng() {
		return rengewanzheng;
	}
	/**
	 * 设置：自我评价
	 */
	public void setZiwopingjia(String ziwopingjia) {
		this.ziwopingjia = ziwopingjia;
	}
	/**
	 * 获取：自我评价
	 */
	public String getZiwopingjia() {
		return ziwopingjia;
	}
	/**
	 * 设置：人际关系
	 */
	public void setRenjiguanxi(String renjiguanxi) {
		this.renjiguanxi = renjiguanxi;
	}
	/**
	 * 获取：人际关系
	 */
	public String getRenjiguanxi() {
		return renjiguanxi;
	}
	/**
	 * 设置：社会适应
	 */
	public void setShehuishiying(String shehuishiying) {
		this.shehuishiying = shehuishiying;
	}
	/**
	 * 获取：社会适应
	 */
	public String getShehuishiying() {
		return shehuishiying;
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
