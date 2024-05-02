package com.entity.vo;

import com.entity.XinlijiankangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 心理健康
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-21 18:56:45
 */
public class XinlijiankangVO  implements Serializable {
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
