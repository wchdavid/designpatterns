package com.gupao.vip.designpatterns.factory.absfactory2;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 10:58 2019/7/20
 **/
public abstract class PageFctory {

    public static PageFctory getPageFactory(Class clazz) {
        PageFctory pageFctory = null;

        try {
            pageFctory = (PageFctory) clazz.newInstance ();
        } catch ( InstantiationException e ) {
            e.printStackTrace ();
        } catch ( IllegalAccessException e ) {
            e.printStackTrace ();
        }
        return pageFctory;
    }

    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);
}
