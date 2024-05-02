package com.dao;

import com.entity.YishengjianyiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YishengjianyiVO;
import com.entity.view.YishengjianyiView;


/**
 * 医生建议
 * 
 * @author 
 * @email 
 * @date 2021-04-21 18:56:45
 */
public interface YishengjianyiDao extends BaseMapper<YishengjianyiEntity> {
	
	List<YishengjianyiVO> selectListVO(@Param("ew") Wrapper<YishengjianyiEntity> wrapper);
	
	YishengjianyiVO selectVO(@Param("ew") Wrapper<YishengjianyiEntity> wrapper);
	
	List<YishengjianyiView> selectListView(@Param("ew") Wrapper<YishengjianyiEntity> wrapper);

	List<YishengjianyiView> selectListView(Pagination page,@Param("ew") Wrapper<YishengjianyiEntity> wrapper);
	
	YishengjianyiView selectView(@Param("ew") Wrapper<YishengjianyiEntity> wrapper);
	
}
