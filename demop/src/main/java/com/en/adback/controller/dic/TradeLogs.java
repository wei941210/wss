package com.en.adback.controller.dic;

import com.en.adback.entity.Logs;
import com.en.adback.entity.dic.Trade;
import com.en.adback.mapper.LogsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/1/8.
 */
@Service
public class TradeLogs {

    @Autowired
    private LogsMapper mapper;

    @Async
    public void postTradeLogs(Trade trade,String ip,String logContent){
        Logs log = new Logs();
        log.setUserId(trade.getLoginUserId());
        log.setGroupRoleId(trade.getLoginGroupRoleId());
        log.setLogContent(logContent);
        log.setIp(ip);
        log.setRoleId(trade.getLoginRoleId());
        mapper.insertLogs(log);
    }
}
