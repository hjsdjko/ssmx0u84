package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JibingjiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JibingjiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JibingjiluView;


/**
 * 疾病记录
 *
 * @author 
 * @email 
 * @date 2021-04-21 18:56:45
 */
public interface JibingjiluService extends IService<JibingjiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JibingjiluVO> selectListVO(Wrapper<JibingjiluEntity> wrapper);
   	
   	JibingjiluVO selectVO(@Param("ew") Wrapper<JibingjiluEntity> wrapper);
   	
   	List<JibingjiluView> selectListView(Wrapper<JibingjiluEntity> wrapper);
   	
   	JibingjiluView selectView(@Param("ew") Wrapper<JibingjiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JibingjiluEntity> wrapper);
   	
}

