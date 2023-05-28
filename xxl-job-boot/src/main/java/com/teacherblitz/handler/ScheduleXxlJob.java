package com.teacherblitz.handler;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
* 日程分布式调度处理类
*
* @author zhuyuan
* @since 2023/5/28 16:50
*/
@Slf4j
@Component
public class ScheduleXxlJob {

    @XxlJob("scheduleJobHandler")
    public void scheduleJobHandler() {
        log.info("【日程】我也打印");
        XxlJobHelper.log("【日程】执行中。。。");
    }
}
