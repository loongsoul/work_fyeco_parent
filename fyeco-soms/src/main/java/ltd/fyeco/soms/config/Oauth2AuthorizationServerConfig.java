package ltd.fyeco.soms.config;

//@Configuration
public class Oauth2AuthorizationServerConfig {//extends AuthorizationServerConfigurerAdapter {
//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    @Override
//    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
//        /* 配置token获取合验证时的策略 */
//        security.tokenKeyAccess("permitAll()").checkTokenAccess("isAuthenticated()");
//    }
//
//    @Override
//    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
//        // 配置oauth2的 client信息
//        // authorizedGrantTypes 有4种，这里只开启2种
//        // secret密码配置从 Spring Security 5.0开始必须以 {bcrypt}+加密后的密码 这种格式填写
//        clients.inMemory()
//                .withClient("testclient")
//                .secret(PasswordEncoderFactories.createDelegatingPasswordEncoder().encode("testclient"))
//                .scopes("test").authorizedGrantTypes("authorization_code", "refresh_token");
//    }
//
//    @Override
//    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
//        // 配置tokenStore
//        endpoints.authenticationManager(authenticationManager).tokenStore(memoryTokenStore());
//    }
//    // 使用最基本的InMemoryTokenStore生成token
//    @Bean
//    public TokenStore memoryTokenStore() {
//        return new InMemoryTokenStore();
//    }

}
