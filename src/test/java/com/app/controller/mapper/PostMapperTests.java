package com.app.controller.mapper;

import com.app.controller.domain.PostVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class PostMapperTests {
    @Autowired
    private PostMapper postMapper;

    @Test
    public void selectTest(){
        List<PostVO> posts = postMapper.selectAll();
        posts.stream().map(PostVO::toString).forEach(log::info);
    }
}
