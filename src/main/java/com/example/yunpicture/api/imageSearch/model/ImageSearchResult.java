package com.example.yunpicture.api.imageSearch.model;

import lombok.Data;

/**
 * 以图搜图的结果
 */
@Data
public class ImageSearchResult {

    /**
     * 缩略图地址
     */
    private String thumbUrl;

    /**
     * 来源地址
     */
    private String fromUrl;
}
