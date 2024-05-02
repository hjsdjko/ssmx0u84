package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YishengjianyiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YishengjianyiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YishengjianyiView;


/**
 * 医生建议
 *
 * @author 
 * @email 
 * @date 2021-04-21 18:56:45
 */
public interface YishengjianyiService extends IService<YishengjianyiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YishengjianyiVO> selectListVO(Wrapper<YishengjianyiEntity> wrapper);
   	
   	YishengjianyiVO selectVO(@Param("ew") Wrapper<YishengjianyiEntity> wrapper);
   	
   	List<YishengjianyiView> selectListView(Wrapper<YishengjianyiEntity> wrapper);
   	
   	YishengjianyiView selectView(@Param("ew") Wrapper<YishengjianyiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YishengjianyiEntity> wrapper);
   	
}

