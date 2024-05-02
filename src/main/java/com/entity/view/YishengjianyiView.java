package com.entity.view;

import com.entity.YishengjianyiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 医生建议
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-21 18:56:45
 */
@TableName("yishengjianyi")
public class YishengjianyiView  extends YishengjianyiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YishengjianyiView(){
	}
 
 	public YishengjianyiView(YishengjianyiEntity yishengjianyiEntity){
 	try {
			BeanUtils.copyProperties(this, yishengjianyiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
