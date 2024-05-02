package com.dao;

import com.entity.TiyuyundongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TiyuyundongVO;
import com.entity.view.TiyuyundongView;


/**
 * 体育运动
 * 
 * @author 
 * @email 
 * @date 2021-04-21 18:56:45
 */
public interface TiyuyundongDao extends BaseMapper<TiyuyundongEntity> {
	
	List<TiyuyundongVO> selectListVO(@Param("ew") Wrapper<TiyuyundongEntity> wrapper);
	
	TiyuyundongVO selectVO(@Param("ew") Wrapper<TiyuyundongEntity> wrapper);
	
	List<TiyuyundongView> selectListView(@Param("ew") Wrapper<TiyuyundongEntity> wrapper);

	List<TiyuyundongView> selectListView(Pagination page,@Param("ew") Wrapper<TiyuyundongEntity> wrapper);
	
	TiyuyundongView selectView(@Param("ew") Wrapper<TiyuyundongEntity> wrapper);
	
}
