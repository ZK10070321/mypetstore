package org.csu.mypetstore01.persistence;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.csu.mypetstore01.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.stream.BaseStream;
@Repository
public interface CategoryMapper extends BaseMapper<Category> {

}
