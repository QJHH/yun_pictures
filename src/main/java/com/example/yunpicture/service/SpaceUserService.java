package com.example.yunpicture.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.yunpicture.model.dto.spaceuser.SpaceUserAddRequest;
import com.example.yunpicture.model.dto.spaceuser.SpaceUserQueryRequest;
import com.example.yunpicture.model.entity.SpaceUser;
import com.example.yunpicture.model.entity.User;
import com.example.yunpicture.model.vo.SpaceUserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author adminQu
 * @description 针对表【space_user(空间用户关联)】的数据库操作Service
 * @createDate 2025-08-19 14:31:08
 */
public interface SpaceUserService extends IService<SpaceUser> {
    /**
     * 创建空间成员
     *
     * @param spaceUserAddRequest 创建请求
     * @return 返回空间id
     */
    long addSpaceUser(SpaceUserAddRequest spaceUserAddRequest);

    /**
     * 数据校验
     *
     * @param spaceUser 空间
     * @param add       是否是创建时校验
     */
    void validSpaceUser(SpaceUser spaceUser, boolean add);

    /**
     * 获取单个空间成员的封装
     */
    SpaceUserVO getSpaceUserVO(SpaceUser spaceUser, HttpServletRequest request);

    /**
     * 获取空间成员的封装（列表）
     *
     * @param spaceUserList
     * @return
     */
    List<SpaceUserVO> getSpaceUserVOList(List<SpaceUser> spaceUserList);

    /**
     * 获取查询对象
     *
     * @param spaceUserQueryRequest
     * @return
     */
    QueryWrapper<SpaceUser> getQueryWrapper(SpaceUserQueryRequest spaceUserQueryRequest);

}
