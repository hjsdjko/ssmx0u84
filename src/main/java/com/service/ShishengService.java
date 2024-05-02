package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShishengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShishengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShishengView;


/**
 * 师生
 *
 * @author 
 * @email 
 * @date 2021-04-21 18:56:45
 */
public interface ShishengService extends IService<ShishengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShishengVO> selectListVO(Wrapper<ShishengEntity> wrapper);
   	
   	ShishengVO selectVO(@Param("ew") Wrapper<ShishengEntity> wrapper);
   	
   	List<ShishengView> selectListView(Wrapper<ShishengEntity> wrapper);
   	
   	ShishengView selectView(@Param("ew") Wrapper<ShishengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShishengEntity> wrapper);
   	
}

