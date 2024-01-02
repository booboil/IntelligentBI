package com.booboil.intelligentbi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.booboil.intelligentbi.model.domain.Chart;
import com.booboil.intelligentbi.service.ChartService;
import com.booboil.intelligentbi.mapper.ChartMapper;
import org.springframework.stereotype.Service;

/**
* @author xinrong3.zhang
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
* @createDate 2024-01-02 15:38:52
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService{

}




