package me.chkfung.meizhigank.UI.AdapterCallBack;

import android.support.v7.util.DiffUtil;

import java.util.List;

import me.chkfung.meizhigank.Model.DataInfo;

/**
 * Created by Fung on 23/08/2016.
 */

public class MeizhiDiffUtil extends DiffUtil.Callback {
    private List<DataInfo> oldMeizhi, newMeizhi;

    @Override
    public int getOldListSize() {
        return oldMeizhi.size();
    }

    @Override
    public int getNewListSize() {
        return newMeizhi.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return oldMeizhi.get(oldItemPosition).get_id() == newMeizhi.get(newItemPosition).get_id();
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return oldMeizhi.get(oldItemPosition).getUrl() == newMeizhi.get(newItemPosition).getUrl();
    }
}
