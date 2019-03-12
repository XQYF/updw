package com.baizhi.service;

import com.baizhi.dao.AlbumMapper;
import com.baizhi.entity.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("updwService")
public class UpdwServiceImpl implements UpdwService{
    @Autowired
    private AlbumMapper albumMapper;

    @Override
    public int upload(Album record) {
        int insert = albumMapper.insert(record);
        return insert;
    }
}
