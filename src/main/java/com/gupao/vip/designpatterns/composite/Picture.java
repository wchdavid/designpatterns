package com.gupao.vip.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 18:50 2020/3/8
 **/
public class Picture extends Graphical{

    private List<Graphical> graphicals;
    private Integer level;

    public Picture(String name, Integer level) {
        super(name);
        this.level = level;
        this.graphicals = new ArrayList<Graphical>();
    }

    @Override
    public void draw() {
        System.out.println(this.name);
        for (Graphical graphical : this.graphicals) {
            if(this.level != null){
                for(int  i = 0; i < this.level; i ++){
                    System.out.print("  ");
                }
                for(int  i = 0; i < this.level; i ++){
                    if(i == 0){ System.out.print("+"); }
                    System.out.print("-");
                }
            }
            graphical.draw();
        }
    }

    /**
     * 当前节点下内容（不包含子节点以下）
     */
    public void list(){
        for (Graphical graphical : this.graphicals) {
            if(this.level != null){
                for(int  i = 0; i < this.level; i ++){
                    System.out.print("  ");
                }
                for(int  i = 0; i < this.level; i ++){
                    if(i == 0){ System.out.print("+"); }
                    System.out.print("-");
                }
            }
        }
    }

    public boolean add(Graphical g) {
        return this.graphicals.add(g);
    }

    public boolean remove(Graphical g) {
        return this.graphicals.remove(g);
    }
}
