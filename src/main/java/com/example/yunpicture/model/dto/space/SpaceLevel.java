package com.example.yunpicture.model.dto.space;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 空间级别响应
 */
@Data
@AllArgsConstructor
public class SpaceLevel {

    private int value;

    private String text;

    private long maxCount;

    private long maxSize;
}
