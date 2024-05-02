package com.entity.view;

import com.entity.JianshenjiaolianjianyiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健身教练建议
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-21 18:56:45
 */
@TableName("jianshenjiaolianjianyi")
public class JianshenjiaolianjianyiView  extends JianshenjiaolianjianyiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JianshenjiaolianjianyiView(){
	}
 
 	public JianshenjiaolianjianyiView(JianshenjiaolianjianyiEntity jianshenjiaolianjianyiEntity){
 	try {
			BeanUtils.copyProperties(this, jianshenjiaolianjianyiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
