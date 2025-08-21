package com.example.yunpicture.model.dto.space;

import lombok.Data;

import java.io.Serializable;

/**
 * 编辑空间请求（用户自己），仅允许修改空间名称
 */
@Data
public class SpaceEditRequest implements Serializable {

    /**
     * 空间 id
     */
    private Long id;

    /**
     * 空间名称
     */
    private String spaceName;

    private static final long serialVersionUID = 1L;
}
