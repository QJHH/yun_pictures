package com.example.yunpicture.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.yunpicture.model.dto.space.SpaceAddRequest;
import com.example.yunpicture.model.dto.space.SpaceQueryRequest;
import com.example.yunpicture.model.entity.Space;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.yunpicture.model.entity.User;
import com.example.yunpicture.model.vo.SpaceVO;

import javax.servlet.http.HttpServletRequest;

/**
 * @author adminQu
 * @description 针对表【space(空间)】的数据库操作Service
 * @createDate 2025-08-08 10:57:03
 */
public interface SpaceService extends IService<Space> {

    /**
     * 创建空间
     *
     * @param spaceAddRequest 创建请求
     * @param loginUser       登录用户
     * @return 返回空间id
     */
    long addSpace(SpaceAddRequest spaceAddRequest, User loginUser);

    /**
     * 数据校验
     *
     * @param space 空间
     * @param add   是否是创建时校验
     */
    void validSpace(Space space, boolean add);

    /**
     * 获取单个空间的封装
     */
    SpaceVO getSpaceVO(Space space, HttpServletRequest request);

    /**
     * 获取分页空间的封装
     *
     * @param spacePage
     * @param request
     * @return
     */
    Page<SpaceVO> getSpaceVOPage(Page<Space> spacePage, HttpServletRequest request);

    /**
     * 获取查询对象
     *
     * @param spaceQueryRequest
     * @return
     */
    QueryWrapper<Space> getQueryWrapper(SpaceQueryRequest spaceQueryRequest);

    /**
     * 根据空间级别来填充空间的其他信息
     *
     * @param space
     */
    void fillSpaceBySpaceLevel(Space space);

    /***
     * 校验空间权限
     * @param loginUser
     * @param space
     */
    void checkSpaceAuth(User loginUser, Space space);
}
