package icu.liuchun.lazydog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import icu.liuchun.lazydog.entity.Employee;
import icu.liuchun.lazydog.mapper.EmployeeMapper;
import icu.liuchun.lazydog.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @author liuchun
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
