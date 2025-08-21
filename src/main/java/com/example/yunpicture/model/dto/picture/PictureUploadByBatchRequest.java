package com.example.yunpicture.model.dto.picture;

import lombok.Data;

/**
 * 批量导入图片数量
 */
@Data
public class PictureUploadByBatchRequest {

    /**
     * 搜索词
     */
    private String searchText;

    /**
     * 名称前缀
     */
    private String namePrefix;

    /**
     * 抓取数量
     */
    private Integer count = 10;
}
