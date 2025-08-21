package com.example.yunpicture.api.imageSearch;

import com.example.yunpicture.api.imageSearch.model.ImageSearchResult;
import com.example.yunpicture.api.imageSearch.sub.GetImageFirstUrlApi;
import com.example.yunpicture.api.imageSearch.sub.GetImageListApi;
import com.example.yunpicture.api.imageSearch.sub.GetImagePageUrlApi;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class ImageSearchApiFacade {

    /**
     * 搜索图片
     *
     * @param imageUrl
     * @return
     */
    public static List<ImageSearchResult> searchImage(String imageUrl) {
        //1、获取以图搜图响应的url
        String imagePageUrl = GetImagePageUrlApi.getImagePageUrl(imageUrl);
        //2、从响应url中提取firstUrl
        String imageFirstUrl = GetImageFirstUrlApi.getImageFirstUrl(imagePageUrl);
        //3、从firstUrl中提取每张图片的url，封装成imageList
        List<ImageSearchResult> imageList = GetImageListApi.getImageList(imageFirstUrl);
        return imageList;
    }

    public static void main(String[] args) {
        // 测试以图搜图功能
        String imageUrl = "https://c-ssl.duitang.com/uploads/blog/202403/05/y9SyWaZmib19M6n.jpg";
        List<ImageSearchResult> resultList = searchImage(imageUrl);
        System.out.println("结果列表" + resultList);
    }
}

