package top.fblue.banana;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.fblue.banana.domain.oss.entity.Oss;
import top.fblue.banana.domain.oss.repository.OssRepository;
import top.fblue.banana.domain.user.entity.User;
import top.fblue.banana.domain.user.repository.UserRepository;

import java.util.List;

@SpringBootTest
class RpcTests {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OssRepository ossRepository;
    @Test
    void getOss() {
        Long ossId = 1L;
        Oss oss = ossRepository.findById(ossId);
        System.out.println("findById => " + oss);
    }
    @Test
    void getUse() {
        Long userId = 1L;

        User user = userRepository.findById(userId);
        System.out.println("findById => " + user);
    }

    @Test
    void getUserList() {
        List<User> users = userRepository.findByIds(List.of(1L, 2L));
        System.out.println("findByIds => " + users);
    }
}
