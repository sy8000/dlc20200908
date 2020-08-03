package cn.besbing.Shiro;

import cn.besbing.Dao.SmUserMapper;
import cn.besbing.Entities.DlPermission;
import cn.besbing.Entities.DlRole;
import cn.besbing.Entities.SmUser;
import cn.besbing.Service.ISmuserService;
import cn.besbing.Service.Impl.CustomerSqlServiceImpl;
import cn.besbing.Service.Impl.DlPermissionServiceImpl;
import cn.besbing.Service.Impl.DlRoleServiceImpl;
import cn.besbing.Service.Impl.SmuserServiceImpl;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ContextLoader;

import java.util.ArrayList;
import java.util.List;


public class CustomRealm extends AuthorizingRealm {


    Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 自动注入
     */
    @Autowired
    private SmuserServiceImpl smuserService;

    @Autowired
    private DlPermissionServiceImpl dlPermissionService;

    @Autowired
    private DlRoleServiceImpl dlRoleService;

    @Autowired
    private CustomerSqlServiceImpl customSqlService;



    {
        super.setName("customRealm");
    }


    /**
     * @param principalCollection 传过来的凭证
     * @return add了roles和permissions后的AuthorizationInfo
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        logger.info("开始处理认证");
        logger.info("---------------------{}---------------------------",principalCollection.getPrimaryPrincipal());
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        //SmUser smUser = (SmUser)principalCollection.getPrimaryPrincipal();

        /*dlRoleService.findRoleByUsername("1002437").stream().forEach(
                dlRole -> {
                    authorizationInfo.addRole(dlRole.getRolename());
                    dlPermissionService.findPermissionByRoleId(dlRole.getRoleid()).stream().forEach(
                            dlPermission -> {
                                authorizationInfo.addStringPermission(dlPermission.getPermission());
                            }
                    );
                }
        );*/
        String usercode = customSqlService.selectOne("select user_code from sm_user where user_name = '" + principalCollection.getPrimaryPrincipal() + "'");
        List<DlRole> roleList = new ArrayList<>();
        List<DlPermission> permissionList = new ArrayList<>();
        roleList = dlRoleService.findRoleByUsername(usercode);
        for (DlRole dlRole : roleList){
            authorizationInfo.addRole(dlRole.getRolename());
            try{
                permissionList = dlPermissionService.findPermissionByRoleId(dlRole.getRoleid());
            }catch(Exception e){
                logger.error(e.getStackTrace().toString());
            }
                for (DlPermission dlPermission : permissionList){
                    authorizationInfo.addStringPermission(dlPermission.getPermission());
                }
        }
        return authorizationInfo;
    }

    /**
     *
     * @param authenticationToken   usernameandpasswordtoken
     * @return   传进来的token
     * @throws AuthenticationException   校验不通过的返回
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {



        //获取用户
        String username = (String) authenticationToken.getPrincipal();
        System.out.println("=============="+username);
        SmUser smUser  = smuserService.selectUserPasswordByUserCode(username);

        if(smUser == null || smUser.getUserPassword() == null ){
            logger.info("认证失败，空返回");
            return null;
        }

        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(smUser.getUserName(),smUser.getUserPassword(),"customRealm");
        logger.info("认证完成，顺利返回，不代表验证成功");
        return authenticationInfo;
    }
}
