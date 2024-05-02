package com.dao;

import com.entity.ShishengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShishengVO;
import com.entity.view.ShishengView;


/**
 * 师生
 * 
 * @author 
 * @email 
 * @date 2021-04-21 18:56:45
 */
public interface ShishengDao extends BaseMapper<ShishengEntity> {
	
	List<ShishengVO> selectListVO(@Param("ew") Wrapper<ShishengEntity> wrapper);
	
	ShishengVO selectVO(@Param("ew") Wrapper<ShishengEntity> wrapper);
	
	List<ShishengView> selectListView(@Param("ew") Wrapper<ShishengEntity> wrapper);

	List<ShishengView> selectListView(Pagination page,@Param("ew") Wrapper<ShishengEntity> wrapper);
	
	ShishengView selectView(@Param("ew") Wrapper<ShishengEntity> wrapper);
	
}
