package com.dl7.mvp.module.news.article;

import com.dl7.mvp.api.bean.NewsDetailInfo;
import com.dl7.mvp.module.base.IBaseView;

/**
 * Created by long on 2017/2/3.
 */

public interface INewsArticleView extends IBaseView {

    /**
     * 显示数据
     * @param htmlContent 新闻详情
     */
    void loadData(String htmlContent);

    void loadRelatedNews(NewsDetailInfo newsDetailBean);
}

