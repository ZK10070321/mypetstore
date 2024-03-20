package org.csu.mypetstore01;

import org.csu.mypetstore01.entity.Category;
import org.csu.mypetstore01.persistence.CategoryMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Mypetstore01ApplicationTests {

    @Autowired
    private CategoryMapper categoryMapper;
    @Test
    void contextLoads() {
        Category category = categoryMapper.selectById("CATS");
        System.out.println(category );
    }

}
