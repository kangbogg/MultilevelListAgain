package com.example.day0927.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.day0927.R;
import com.example.day0927.bean.MyChildBean;
import com.example.day0927.bean.MyGroupBean;
import com.hgdendi.expandablerecycleradapter.BaseExpandableRecyclerViewAdapter;

import java.util.List;

public class MyAdapter extends BaseExpandableRecyclerViewAdapter<MyGroupBean, MyChildBean, MyAdapter.MyGroupViewHolder, MyAdapter.MyChildViewHolder> {

    //数据
    private List<MyGroupBean> groupBeans;

    public MyAdapter(List<MyGroupBean> groupBeans) {
        this.groupBeans = groupBeans;
    }

    /***
     *
     * @return 一级列表的数量
     */
    @Override
    public int getGroupCount() {
        return groupBeans.size();
    }


    /***
     *
     * @param groupIndex
     * @return 一级列表的对应的数据
     */
    @Override
    public MyGroupBean getGroupItem(int groupIndex) {
        return groupBeans.get(groupIndex);
    }


    /***
     * 创建一级列表的viewholder
     * @param parent
     * @param groupViewType
     * @return
     */
    @Override
    public MyGroupViewHolder onCreateGroupViewHolder(ViewGroup parent, int groupViewType) {
        View group_root = LayoutInflater.from(parent.getContext()).inflate(R.layout.group_layout, null);
        return new MyGroupViewHolder(group_root);
    }


    /***
     * 设置一级列表的数据
     * @param holder
     * @param groupBean
     * @param isExpand
     */
    @Override
    public void onBindGroupViewHolder(MyGroupViewHolder holder, MyGroupBean groupBean, boolean isExpand) {
        holder.tv_group.setText(groupBean.getTitle());
    }


    /***
     * 创建二级列表的viewholder
     * @param parent
     * @param childViewType
     * @return
     */
    @Override
    public MyChildViewHolder onCreateChildViewHolder(ViewGroup parent, int childViewType) {
        View childRoot = LayoutInflater.from(parent.getContext()).inflate(R.layout.child_layout, null);
        return new MyChildViewHolder(childRoot);
    }


    /***
     * 设置二级列表的数据
     * @param myChildViewHolder
     * @param groupBean
     * @param myChildBean
     */
    @Override
    public void onBindChildViewHolder(MyChildViewHolder myChildViewHolder, MyGroupBean groupBean, MyChildBean myChildBean) {
        myChildViewHolder.tv_child.setText(myChildBean.getSong_name());
    }

    /***
     * 一级列表的viewholder
     */
    static class MyGroupViewHolder extends BaseExpandableRecyclerViewAdapter.BaseGroupViewHolder {

        public TextView tv_group;

        public MyGroupViewHolder(View itemView) {
            super(itemView);
            tv_group = itemView.findViewById(R.id.tv_group);
        }

        @Override
        protected void onExpandStatusChanged(RecyclerView.Adapter adapter, boolean b) {

        }
    }

    /***
     * 二级列表的viewholder
     */
    static class MyChildViewHolder extends RecyclerView.ViewHolder {

        //二级列表中的控件
        public TextView tv_child;

        public MyChildViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_child = itemView.findViewById(R.id.tv_child);
        }
    }
}
