package com.entity.vo;

import com.entity.TijianbaogaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 体检报告
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-21 18:56:45
 */
public class TijianbaogaoVO  implements Serializable {
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
	 * 身高
	 */
	
	private String shengao;
		
	/**
	 * 体重
	 */
	
	private String tizhong;
		
	/**
	 * 视力
	 */
	
	private String shili;
		
	/**
	 * 皮肤
	 */
	
	private String pifu;
		
	/**
	 * 淋巴
	 */
	
	private String linba;
		
	/**
	 * 甲状腺
	 */
	
	private String jiazhuangxian;
		
	/**
	 * 脊椎
	 */
	
	private String jizhui;
		
	/**
	 * 四肢
	 */
	
	private String sizhi;
		
	/**
	 * 关节
	 */
	
	private String guanjie;
		
	/**
	 * 听力
	 */
	
	private String tingli;
		
	/**
	 * 血压
	 */
	
	private String xueya;
		
	/**
	 * 心率
	 */
	
	private String xinlv;
		
	/**
	 * 蛀牙
	 */
	
	private String zhuya;
		
	/**
	 * 心脏
	 */
	
	private String xinzang;
		
	/**
	 * 胸透
	 */
	
	private String xiongtou;
		
	/**
	 * 病史记录
	 */
	
	private String bingshijilu;
		
	/**
	 * 医生账号
	 */
	
	private String yishengzhanghao;
		
	/**
	 * 医生姓名
	 */
	
	private String yishengxingming;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
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
	 * 设置：身高
	 */
	 
	public void setShengao(String shengao) {
		this.shengao = shengao;
	}
	
	/**
	 * 获取：身高
	 */
	public String getShengao() {
		return shengao;
	}
				
	
	/**
	 * 设置：体重
	 */
	 
	public void setTizhong(String tizhong) {
		this.tizhong = tizhong;
	}
	
	/**
	 * 获取：体重
	 */
	public String getTizhong() {
		return tizhong;
	}
				
	
	/**
	 * 设置：视力
	 */
	 
	public void setShili(String shili) {
		this.shili = shili;
	}
	
	/**
	 * 获取：视力
	 */
	public String getShili() {
		return shili;
	}
				
	
	/**
	 * 设置：皮肤
	 */
	 
	public void setPifu(String pifu) {
		this.pifu = pifu;
	}
	
	/**
	 * 获取：皮肤
	 */
	public String getPifu() {
		return pifu;
	}
				
	
	/**
	 * 设置：淋巴
	 */
	 
	public void setLinba(String linba) {
		this.linba = linba;
	}
	
	/**
	 * 获取：淋巴
	 */
	public String getLinba() {
		return linba;
	}
				
	
	/**
	 * 设置：甲状腺
	 */
	 
	public void setJiazhuangxian(String jiazhuangxian) {
		this.jiazhuangxian = jiazhuangxian;
	}
	
	/**
	 * 获取：甲状腺
	 */
	public String getJiazhuangxian() {
		return jiazhuangxian;
	}
				
	
	/**
	 * 设置：脊椎
	 */
	 
	public void setJizhui(String jizhui) {
		this.jizhui = jizhui;
	}
	
	/**
	 * 获取：脊椎
	 */
	public String getJizhui() {
		return jizhui;
	}
				
	
	/**
	 * 设置：四肢
	 */
	 
	public void setSizhi(String sizhi) {
		this.sizhi = sizhi;
	}
	
	/**
	 * 获取：四肢
	 */
	public String getSizhi() {
		return sizhi;
	}
				
	
	/**
	 * 设置：关节
	 */
	 
	public void setGuanjie(String guanjie) {
		this.guanjie = guanjie;
	}
	
	/**
	 * 获取：关节
	 */
	public String getGuanjie() {
		return guanjie;
	}
				
	
	/**
	 * 设置：听力
	 */
	 
	public void setTingli(String tingli) {
		this.tingli = tingli;
	}
	
	/**
	 * 获取：听力
	 */
	public String getTingli() {
		return tingli;
	}
				
	
	/**
	 * 设置：血压
	 */
	 
	public void setXueya(String xueya) {
		this.xueya = xueya;
	}
	
	/**
	 * 获取：血压
	 */
	public String getXueya() {
		return xueya;
	}
				
	
	/**
	 * 设置：心率
	 */
	 
	public void setXinlv(String xinlv) {
		this.xinlv = xinlv;
	}
	
	/**
	 * 获取：心率
	 */
	public String getXinlv() {
		return xinlv;
	}
				
	
	/**
	 * 设置：蛀牙
	 */
	 
	public void setZhuya(String zhuya) {
		this.zhuya = zhuya;
	}
	
	/**
	 * 获取：蛀牙
	 */
	public String getZhuya() {
		return zhuya;
	}
				
	
	/**
	 * 设置：心脏
	 */
	 
	public void setXinzang(String xinzang) {
		this.xinzang = xinzang;
	}
	
	/**
	 * 获取：心脏
	 */
	public String getXinzang() {
		return xinzang;
	}
				
	
	/**
	 * 设置：胸透
	 */
	 
	public void setXiongtou(String xiongtou) {
		this.xiongtou = xiongtou;
	}
	
	/**
	 * 获取：胸透
	 */
	public String getXiongtou() {
		return xiongtou;
	}
				
	
	/**
	 * 设置：病史记录
	 */
	 
	public void setBingshijilu(String bingshijilu) {
		this.bingshijilu = bingshijilu;
	}
	
	/**
	 * 获取：病史记录
	 */
	public String getBingshijilu() {
		return bingshijilu;
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
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
