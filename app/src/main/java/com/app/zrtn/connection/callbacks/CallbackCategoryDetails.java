package com.app.zrtn.connection.callbacks;

import java.util.ArrayList;
import java.util.List;

import com.app.zrtn.model.Category;
import com.app.zrtn.model.Post;

public class CallbackCategoryDetails {

    public String status = "";
    public int count = -1;
    public int pages = -1;
    public Category category = null;
    public List<Post> posts = new ArrayList<>();
}
