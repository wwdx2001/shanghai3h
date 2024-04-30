package com.sh3h.meterreading.aliyun;

import com.aliyun.svideo.sdk.external.struct.common.VideoQuality;
import com.aliyun.svideo.sdk.external.struct.recorder.FlashType;

/**
 * @author zsy_18 data:2018/7/31
 */
public interface ControlViewListener {
    /**
     * 返回事件
     */
    void onBackClick();

    /**
     * 下一个事件
     */
    void onNextClick();

    /**
     * 显示美颜选择view
     */
    void onBeautyFaceClick();

    void onMusicClick();

    /**
     * 摄像头转换事件
     */
    void onCameraSwitch();

    /**
     * 闪光灯模式
     *
     * @param flashType
     */
    void onLightSwitch(FlashType flashType);

    /**
     * 播放速率选择
     *
     * @param rate
     */
    void onRateSelect(float rate);

    /**
     * 现实动图效果选择view
     */
    void onGifEffectClick();

    /**
     * 准备录制视频事件
     *
     * @param isCancel true 取消准备，false开始准备
     */
    void onReadyRecordClick(boolean isCancel);

    /**
     * 开始录制视频事件
     */
    void onStartRecordClick();

    /**
     * 停止录制视频事件
     */
    void onStopRecordClick();

    /**
     * 删除点击事件
     */
    void onDeleteClick();

    /**
     * 弹出滤镜选择弹窗
     */
    void onFilterEffectClick();

    /**
     * 切换画幅比例
     */
    void onChangeAspectRatioClick(int ratio);

    /**
     * 切换画质和质视频质量
     */
    void onChangeQualityResolutioClick(int mResolutionMode, VideoQuality mVideoQuality);
}
