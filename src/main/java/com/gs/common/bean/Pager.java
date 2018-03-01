package com.gs.common.bean;

import java.util.List;

/**
 * Created by Master on 2017/8/2.
 */
public class Pager<T> {

    private int pageNo;//第几页
    private int pageSize;//每页多少个
    private long total;//总个数
    private List<T> results;//集合

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }

    public int getBeginIndex() {
        return (pageNo - 1) * pageSize;
    }

}
