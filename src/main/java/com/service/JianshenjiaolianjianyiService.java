package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianshenjiaolianjianyiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianshenjiaolianjianyiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianshenjiaolianjianyiView;


/**
 * 健身教练建议
 *
 * @author 
 * @email 
 * @date 2021-04-21 18:56:45
 */
public interface JianshenjiaolianjianyiService extends IService<JianshenjiaolianjianyiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianshenjiaolianjianyiVO> selectListVO(Wrapper<JianshenjiaolianjianyiEntity> wrapper);
   	
   	JianshenjiaolianjianyiVO selectVO(@Param("ew") Wrapper<JianshenjiaolianjianyiEntity> wrapper);
   	
   	List<JianshenjiaolianjianyiView> selectListView(Wrapper<JianshenjiaolianjianyiEntity> wrapper);
   	
   	JianshenjiaolianjianyiView selectView(@Param("ew") Wrapper<JianshenjiaolianjianyiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianshenjiaolianjianyiEntity> wrapper);
   	
}

