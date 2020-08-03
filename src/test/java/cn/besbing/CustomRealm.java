package cn.besbing;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CustomRealm extends AuthorizingRealm {
    Map<String,String> userMap = new HashMap<>(16);


    {
        userMap.put("sheny","abcdefg");

        super.setName("customRealm");
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        String username = (String) principalCollection.getPrimaryPrincipal();
        Set<String> rolesSet = getRolesByUsername(username);
        Set<String> permissionSet = getPermissionSetsByUsername(username);
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.setRoles(rolesSet);
        simpleAuthorizationInfo.setStringPermissions(permissionSet);
        return simpleAuthorizationInfo;
    }

    private Set<String> getPermissionSetsByUsername(String username) {
        Set<String> permSet = new HashSet<>();
        permSet.add("user:add");
        permSet.add("user:delete");
        return permSet;
    }

    private Set<String> getRolesByUsername(String username) {
        Set<String> userSet = new HashSet<>();
        userSet.add("admin");
        //userSet.add("user");
        return userSet;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        //1、从主体转过来的认证信息中获取用户名
        String username = authenticationToken.getPrincipal().toString();
        //2、通过用户名去数据库中获取凭证
        String password = getPasswordByUsername(username);
        if (password == null){
            return null;
        }

        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo("sheny","abcdefg","customRealm");

        return simpleAuthenticationInfo;
    }

    private String getPasswordByUsername(String username) {
        return userMap.get(username);
    }
}
