package ltd.fyeco.soms;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import ltd.fyeco.soms.common.enums.Deleted;
import ltd.fyeco.soms.common.enums.UserStatus;
import ltd.fyeco.soms.domain.entity.SysUser;
import ltd.fyeco.soms.service.ISysUserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
	
	@Autowired
	private ISysUserService userService;
	
	private static final String USER_PREFIX = "u_";
	private static final String EMAIL_SUFFIX = "@example.com";
	
	@Test
	public void contextLoads() {
	}

    // 新增一条新记录
    @Test
    public void insertOne() {
    	
        SysUser user = new SysUser();
        
        String username= USER_PREFIX + Math.random() * 10000000;
        Date currentTime = new Date();
        
        user.setUsername(username);
        user.setPassword("pass");
        user.setEmail(username +EMAIL_SUFFIX);
        user.setNickname(username);
        user.setStatus(UserStatus.ACTIVED.getKey());
        user.setCreateTime(currentTime);
        user.setUpdateTime(currentTime);
        user.setDeleteTime(currentTime);
        user.setDeleted(Deleted.DELETED.getKey());
        
        userService.insert(user);
        
        System.out.println("插入成功");
    }

//    // 批量插入记录
//    @Test
//    public void insertMore() {
//        List<User> recordList = new ArrayList<User>();
//        for (int i = 0; i < 2; i++) {
//            User newUser = new User();
//            int cardNo = (int) (Math.random() * 10000000);
//            newUser.setAge(26);
//            newUser.setBirthday(new Date());
//            newUser.setName(cardNo + "批量插入用户");
//            newUser.setCardNo(cardNo);
//            recordList.add(newUser);
//        }
//        mapper.insertList(recordList);
//        System.out.println("批量插入成功");
//    }
//
//    // 根据唯一编号查询用户(通用Mapper查询)
//    @Test
//    public void selectByCardNo() {
//        User paramBean = new User();
//        paramBean.setCardNo(6647403);
//        User dbUser = mapper.selectOne(paramBean);
//        if (dbUser != null) {
//            System.out.println("数据库用户(通用Mapper查询)：" + dbUser.getName());
//            return;
//        }
//        System.out.println("查无此用户");
//    }
//
//    // 根据唯一编号查询用户(XML查询)
//    @Test
//    public void selectByCardNoByXml() {
//        User dbUser = mapper.selectByCardNo(6105967);
//        if (dbUser != null) {
//            System.out.println("数据库用户(XML查询)：" + dbUser.getName());
//            return;
//        }
//        System.out.println("查无此用户");
//    }
//
//    // 根据年龄查询一组用户
//    @Test
//    public void selectByAge() {
//        User paramBean = new User();
//        paramBean.setAge(24);
//        List<User> dbUserList = mapper.select(paramBean);
//        System.out.println("总共查询数：" + dbUserList.size());
//    }
//
//    // 分页查询用户
//    @Test
//    public void selectByPage() {
//        PageHelper.offsetPage(1, 5);
//        List<User> dbUserList = mapper.select(null);
//        for (User item : dbUserList) {
//            System.out.println("分页用户：" + item.getName());
//        }
//    }
//
//    // 更新用户信息
//    @Test
//    public void updateOneInfo() {
//        User paramBean = new User();
//        paramBean.setId(1);
//        paramBean.setAge(26);
//        mapper.updateByPrimaryKeySelective(paramBean);
//        System.out.println("更新成功");
//    }
}
