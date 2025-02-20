package com.dao;

import com.entity.RenshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.RenshiView;

/**
 * 人事信息 Dao 接口
 *
 * @author 
 * @since 2021-04-23
 */
public interface RenshiDao extends BaseMapper<RenshiEntity> {

   List<RenshiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
