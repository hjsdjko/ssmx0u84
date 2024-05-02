package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TiyuyundongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TiyuyundongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TiyuyundongView;


/**
 * 体育运动
 *
 * @author 
 * @email 
 * @date 2021-04-21 18:56:45
 */
public interface TiyuyundongService extends IService<TiyuyundongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TiyuyundongVO> selectListVO(Wrapper<TiyuyundongEntity> wrapper);
   	
   	TiyuyundongVO selectVO(@Param("ew") Wrapper<TiyuyundongEntity> wrapper);
   	
   	List<TiyuyundongView> selectListView(Wrapper<TiyuyundongEntity> wrapper);
   	
   	TiyuyundongView selectView(@Param("ew") Wrapper<TiyuyundongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TiyuyundongEntity> wrapper);
   	
}

