package com.heima.article.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.dto.article.ArticleDto;
import com.heima.model.dto.article.ArticleHomeDto;
import com.heima.model.pojo.article.ApArticle;


public interface ApArticleService extends IService<ApArticle> {

    /**
     * 根据参数加载文章列表
     * @param loadType 1为加载更多  2为加载最新
     * @param dto
     * @return
     */
    ResponseResult load(Short loadType, ArticleHomeDto dto);

    /**
     * 保存文章
     * @param articleDto
     */
    ResponseResult saveArticle(ArticleDto articleDto);
}
