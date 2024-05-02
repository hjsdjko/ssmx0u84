package com.dao;

import com.entity.JianshenjiaolianjianyiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianshenjiaolianjianyiVO;
import com.entity.view.JianshenjiaolianjianyiView;


/**
 * 健身教练建议
 * 
 * @author 
 * @email 
 * @date 2021-04-21 18:56:45
 */
public interface JianshenjiaolianjianyiDao extends BaseMapper<JianshenjiaolianjianyiEntity> {
	
	List<JianshenjiaolianjianyiVO> selectListVO(@Param("ew") Wrapper<JianshenjiaolianjianyiEntity> wrapper);
	
	JianshenjiaolianjianyiVO selectVO(@Param("ew") Wrapper<JianshenjiaolianjianyiEntity> wrapper);
	
	List<JianshenjiaolianjianyiView> selectListView(@Param("ew") Wrapper<JianshenjiaolianjianyiEntity> wrapper);

	List<JianshenjiaolianjianyiView> selectListView(Pagination page,@Param("ew") Wrapper<JianshenjiaolianjianyiEntity> wrapper);
	
	JianshenjiaolianjianyiView selectView(@Param("ew") Wrapper<JianshenjiaolianjianyiEntity> wrapper);
	
}
