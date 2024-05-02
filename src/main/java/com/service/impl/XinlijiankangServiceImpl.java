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


import com.dao.XinlijiankangDao;
import com.entity.XinlijiankangEntity;
import com.service.XinlijiankangService;
import com.entity.vo.XinlijiankangVO;
import com.entity.view.XinlijiankangView;

@Service("xinlijiankangService")
public class XinlijiankangServiceImpl extends ServiceImpl<XinlijiankangDao, XinlijiankangEntity> implements XinlijiankangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinlijiankangEntity> page = this.selectPage(
                new Query<XinlijiankangEntity>(params).getPage(),
                new EntityWrapper<XinlijiankangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinlijiankangEntity> wrapper) {
		  Page<XinlijiankangView> page =new Query<XinlijiankangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinlijiankangVO> selectListVO(Wrapper<XinlijiankangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinlijiankangVO selectVO(Wrapper<XinlijiankangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinlijiankangView> selectListView(Wrapper<XinlijiankangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinlijiankangView selectView(Wrapper<XinlijiankangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
