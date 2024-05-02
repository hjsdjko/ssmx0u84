package com.entity.view;

import com.entity.TiyuyundongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 体育运动
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-21 18:56:45
 */
@TableName("tiyuyundong")
public class TiyuyundongView  extends TiyuyundongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TiyuyundongView(){
	}
 
 	public TiyuyundongView(TiyuyundongEntity tiyuyundongEntity){
 	try {
			BeanUtils.copyProperties(this, tiyuyundongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
