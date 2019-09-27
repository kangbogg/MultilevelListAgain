package com.example.day0927.bean;

import com.hgdendi.expandablerecycleradapter.BaseExpandableRecyclerViewAdapter;

import java.util.List;

/***
 * 一级列表的bean类
 */
public class MyGroupBean implements BaseExpandableRecyclerViewAdapter.BaseGroupBean<MyChildBean> {

    //二级列表的数据
    private List<MyChildBean> sub_list;
    //一级列表的数据
    private String title;

    public MyGroupBean(List<MyChildBean> sub_list, String title) {
        this.sub_list = sub_list;
        this.title = title;
    }

    /***
     *
     * @return 二级列表数据的数量
     */
    @Override
    public int getChildCount() {
        return sub_list.size();
    }

    /***
     *
     * @param childIndex
     * @return
     */
    @Override
    public MyChildBean getChildAt(int childIndex) {
        return sub_list.get(childIndex);
    }

    /***
     *
     * @return
     */
    @Override
    public boolean isExpandable() {
        return true;
    }

    public List<MyChildBean> getSub_list() {
        return sub_list;
    }

    public void setSub_list(List<MyChildBean> sub_list) {
        this.sub_list = sub_list;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
