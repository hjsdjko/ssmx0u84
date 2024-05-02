package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShishengDao;
import com.entity.ShishengEntity;
import com.service.ShishengService;
import com.entity.vo.ShishengVO;
import com.entity.view.ShishengView;

@Service("shishengService")
public class ShishengServiceImpl extends ServiceImpl<ShishengDao, ShishengEntity> implements ShishengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShishengEntity> page = this.selectPage(
                new Query<ShishengEntity>(params).getPage(),
                new EntityWrapper<ShishengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShishengEntity> wrapper) {
		  Page<ShishengView> page =new Query<ShishengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShishengVO> selectListVO(Wrapper<ShishengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShishengVO selectVO(Wrapper<ShishengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShishengView> selectListView(Wrapper<ShishengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShishengView selectView(Wrapper<ShishengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
