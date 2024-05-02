package com.entity.view;

import com.entity.XinlijiankangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 心理健康
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-21 18:56:45
 */
@TableName("xinlijiankang")
public class XinlijiankangView  extends XinlijiankangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XinlijiankangView(){
	}
 
 	public XinlijiankangView(XinlijiankangEntity xinlijiankangEntity){
 	try {
			BeanUtils.copyProperties(this, xinlijiankangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
