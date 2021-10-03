package demo.dao;

import com.cn.wdy.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginDao {

    public User getUser(User user);

}
