package com.example.jingbin.cloudreader.bean.wanandroid;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.jingbin.cloudreader.BR;

import java.util.List;

/**
 * @author jingbin
 * @data 2018/9/15
 * @description
 */

public class TreeBean extends BaseObservable {

    private int errorCode;
    private String errorMsg;
    private List<TreeItemBean> data;

    @Bindable
    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
        notifyPropertyChanged(BR.errorCode);
    }

    @Bindable
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        notifyPropertyChanged(BR.errorMsg);
    }

    @Bindable
    public List<TreeItemBean> getData() {
        return data;
    }

    public void setData(List<TreeItemBean> data) {
        this.data = data;
        notifyPropertyChanged(BR.data);
    }

}
