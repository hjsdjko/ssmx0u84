package com.entity.view;

import com.entity.JibingjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 疾病记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-21 18:56:45
 */
@TableName("jibingjilu")
public class JibingjiluView  extends JibingjiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JibingjiluView(){
	}
 
 	public JibingjiluView(JibingjiluEntity jibingjiluEntity){
 	try {
			BeanUtils.copyProperties(this, jibingjiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
