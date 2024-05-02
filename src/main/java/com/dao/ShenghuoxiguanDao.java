package com.dao;

import com.entity.ShenghuoxiguanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShenghuoxiguanVO;
import com.entity.view.ShenghuoxiguanView;


/**
 * 生活习惯
 * 
 * @author 
 * @email 
 * @date 2021-04-21 18:56:45
 */
public interface ShenghuoxiguanDao extends BaseMapper<ShenghuoxiguanEntity> {
	
	List<ShenghuoxiguanVO> selectListVO(@Param("ew") Wrapper<ShenghuoxiguanEntity> wrapper);
	
	ShenghuoxiguanVO selectVO(@Param("ew") Wrapper<ShenghuoxiguanEntity> wrapper);
	
	List<ShenghuoxiguanView> selectListView(@Param("ew") Wrapper<ShenghuoxiguanEntity> wrapper);

	List<ShenghuoxiguanView> selectListView(Pagination page,@Param("ew") Wrapper<ShenghuoxiguanEntity> wrapper);
	
	ShenghuoxiguanView selectView(@Param("ew") Wrapper<ShenghuoxiguanEntity> wrapper);
	
}
