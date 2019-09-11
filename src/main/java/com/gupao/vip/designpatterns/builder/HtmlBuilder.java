package com.gupao.vip.designpatterns.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 4:32 2019/7/20
 **/
public class HtmlBuilder implements Builder {

    private String filename;
    private PrintWriter writer;

    @Override
    public void makeTitle(String title) {
        filename = "E:\\" + title + ".html";
        try {
            writer = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>");

        writer.println("<h1>" + title + "</h1>");
    }

    @Override
    public void makeString(String str) {
        writer.println("<p>" + str + "</p>");
    }

    @Override
    public void makeItems(String[] items) {
        writer.println("<url>");
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</url>");
    }

    @Override
    public void close() {
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult() {
        return filename;
    }
}
