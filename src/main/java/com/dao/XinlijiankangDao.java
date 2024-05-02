package com.dao;

import com.entity.XinlijiankangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinlijiankangVO;
import com.entity.view.XinlijiankangView;


/**
 * 心理健康
 * 
 * @author 
 * @email 
 * @date 2021-04-21 18:56:45
 */
public interface XinlijiankangDao extends BaseMapper<XinlijiankangEntity> {
	
	List<XinlijiankangVO> selectListVO(@Param("ew") Wrapper<XinlijiankangEntity> wrapper);
	
	XinlijiankangVO selectVO(@Param("ew") Wrapper<XinlijiankangEntity> wrapper);
	
	List<XinlijiankangView> selectListView(@Param("ew") Wrapper<XinlijiankangEntity> wrapper);

	List<XinlijiankangView> selectListView(Pagination page,@Param("ew") Wrapper<XinlijiankangEntity> wrapper);
	
	XinlijiankangView selectView(@Param("ew") Wrapper<XinlijiankangEntity> wrapper);
	
}
