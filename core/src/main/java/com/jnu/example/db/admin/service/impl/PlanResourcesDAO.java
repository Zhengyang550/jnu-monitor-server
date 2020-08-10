package com.jnu.example.db.admin.service.impl;

import com.jnu.example.db.admin.entity.PlanResources;
import com.jnu.example.db.admin.mapper.PlanResourcesMapper;
import com.jnu.example.db.admin.service.IPlanResourcesDAO;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zy
 * @since 2020-08-10
 */
@Service
public class PlanResourcesDAO extends ServiceImpl<PlanResourcesMapper, PlanResources> implements IPlanResourcesDAO {

}
