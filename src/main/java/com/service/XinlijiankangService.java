package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinlijiankangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinlijiankangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinlijiankangView;


/**
 * 心理健康
 *
 * @author 
 * @email 
 * @date 2021-04-21 18:56:45
 */
public interface XinlijiankangService extends IService<XinlijiankangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinlijiankangVO> selectListVO(Wrapper<XinlijiankangEntity> wrapper);
   	
   	XinlijiankangVO selectVO(@Param("ew") Wrapper<XinlijiankangEntity> wrapper);
   	
   	List<XinlijiankangView> selectListView(Wrapper<XinlijiankangEntity> wrapper);
   	
   	XinlijiankangView selectView(@Param("ew") Wrapper<XinlijiankangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinlijiankangEntity> wrapper);
   	
}

