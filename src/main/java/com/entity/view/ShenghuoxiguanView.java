package com.entity.view;

import com.entity.ShenghuoxiguanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 生活习惯
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-21 18:56:45
 */
@TableName("shenghuoxiguan")
public class ShenghuoxiguanView  extends ShenghuoxiguanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShenghuoxiguanView(){
	}
 
 	public ShenghuoxiguanView(ShenghuoxiguanEntity shenghuoxiguanEntity){
 	try {
			BeanUtils.copyProperties(this, shenghuoxiguanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
