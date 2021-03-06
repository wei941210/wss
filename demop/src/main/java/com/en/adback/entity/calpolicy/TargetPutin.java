package com.en.adback.entity.calpolicy;

import lombok.Data;
import java.util.Map;

//定向投放广告
@Data
public class TargetPutin {
    private Map<String,Object> targetScreen; // 各种播放屏幕集合
    public TargetPutin() {
    }

    public TargetPutin( Map<String,Object> targetScreen) {
        this.targetScreen = targetScreen;
    }
}
