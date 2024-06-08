package com.ChuwenSun.facebookclone.service;

import com.ChuwenSun.facebookclone.model.Post;

import java.util.List;

public interface PostService {
    Post addPost(Post post) throws Exception;

    List<Post> getPost();
}
