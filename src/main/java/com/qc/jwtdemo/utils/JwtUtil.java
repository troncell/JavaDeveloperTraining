package com.qc.jwtdemo.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.qc.jwtdemo.entity.User;

import java.util.Date;
import java.util.Map;

/**
 * @author qiancheng
 * @date 2023/05/30
 */
public class JwtUtil {
    /**
     * 过期5分钟
     * */
    private static final long EXPIRE_TIME = 30 * 1000;

    /**
     * jwt密钥
     * */
    private static final String SECRET = "jwt_secret";


    /**
     * 生成jwt字符串，30分钟后过期
     * @param info
     * @return
     */
    public static String generateToken(Map<String, String> info) {
        try {
            Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME);
            Algorithm algorithm = Algorithm.HMAC256(SECRET);
            return JWT.create()
                    //存放自定义数据
                    .withClaim("info", info)
                    //30分钟后token过期
                    .withExpiresAt(date)
                    //token的密钥
                    .sign(algorithm);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 根据token获取userId
     * @param token
     * @return
     * */
//    public static String getUserId(String token) {
//        try {
//            String userId = JWT.decode(token).getAudience().get(0);
//            return userId;
//        }catch (JWTDecodeException e) {
//            return null;
//        }
//    }

    /**
     * 根据token获取自定义数据info
     * @param token
     * @return
     * */
    public static Map<String, Object> getInfo(String token) {
        try {
            return JWT.decode(token).getClaim("info").asMap();
        }catch (JWTDecodeException e) {
            return null;
        }
    }

    /**
     * 校验token
     * @param token
     * @return
     * */
    public static boolean checkSign(String token) {
        try {
            Algorithm algorithm  = Algorithm.HMAC256(SECRET);
            JWTVerifier verifier = JWT.require(algorithm)
//                    .withClaim("username", username)
                    .build();
            verifier.verify(token);
            return true;
        }catch (JWTVerificationException e) {
            throw new RuntimeException("token 无效，请重新获取");
        }
    }
}
