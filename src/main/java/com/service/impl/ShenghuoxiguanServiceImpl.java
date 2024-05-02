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


import com.dao.ShenghuoxiguanDao;
import com.entity.ShenghuoxiguanEntity;
import com.service.ShenghuoxiguanService;
import com.entity.vo.ShenghuoxiguanVO;
import com.entity.view.ShenghuoxiguanView;

@Service("shenghuoxiguanService")
public class ShenghuoxiguanServiceImpl extends ServiceImpl<ShenghuoxiguanDao, ShenghuoxiguanEntity> implements ShenghuoxiguanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenghuoxiguanEntity> page = this.selectPage(
                new Query<ShenghuoxiguanEntity>(params).getPage(),
                new EntityWrapper<ShenghuoxiguanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenghuoxiguanEntity> wrapper) {
		  Page<ShenghuoxiguanView> page =new Query<ShenghuoxiguanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShenghuoxiguanVO> selectListVO(Wrapper<ShenghuoxiguanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenghuoxiguanVO selectVO(Wrapper<ShenghuoxiguanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenghuoxiguanView> selectListView(Wrapper<ShenghuoxiguanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenghuoxiguanView selectView(Wrapper<ShenghuoxiguanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
