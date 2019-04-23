package com.chixing.dao;

import java.util.List;

public interface CommonDao<T> {
    public T selectByPrimarykey(int id);
    public List<T> selectAll();
    public int deleteByPrimaryKey(int id);
    public int updateByPrimaryKey(T t);
    public int insert(T t);
}
