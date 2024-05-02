package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenghuoxiguanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenghuoxiguanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenghuoxiguanView;


/**
 * 生活习惯
 *
 * @author 
 * @email 
 * @date 2021-04-21 18:56:45
 */
public interface ShenghuoxiguanService extends IService<ShenghuoxiguanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenghuoxiguanVO> selectListVO(Wrapper<ShenghuoxiguanEntity> wrapper);
   	
   	ShenghuoxiguanVO selectVO(@Param("ew") Wrapper<ShenghuoxiguanEntity> wrapper);
   	
   	List<ShenghuoxiguanView> selectListView(Wrapper<ShenghuoxiguanEntity> wrapper);
   	
   	ShenghuoxiguanView selectView(@Param("ew") Wrapper<ShenghuoxiguanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenghuoxiguanEntity> wrapper);
   	
}

