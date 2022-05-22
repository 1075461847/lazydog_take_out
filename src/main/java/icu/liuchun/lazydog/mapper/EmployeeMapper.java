package icu.liuchun.lazydog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import icu.liuchun.lazydog.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author liuchun
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
