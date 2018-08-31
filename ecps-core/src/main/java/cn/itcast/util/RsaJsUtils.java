package cn.itcast.util;
import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wxl on 2018/6/1.
 */
public class RsaJsUtils {
    public static final String KEY_ALGORITHM = "RSA";
    public static final String SIGNATURE_ALGORITHM = "MD5withRSA";

    private static final String PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDMD+xpF7NECyyom8vW1XS77CcgiMyxgHgIixmp\n" +
            "ySYNWGOuSm3H79xrT3LSDm/RGyzzfBBZLYljQSSovjTOfhdinmhYMeHT0jBXZQ9HVC5GjEIpkPHo\n" +
            "OpnraWUfBP6o8fLPUQwD0cJt/HQhuHnISDfw/mzaL7Au9KG0FvlSvIYIEwIDAQAB";
    private static final String PRIVATE_KEY = "MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAMwP7GkXs0QLLKiby9bVdLvsJyCI\n" +
            "zLGAeAiLGanJJg1YY65Kbcfv3GtPctIOb9EbLPN8EFktiWNBJKi+NM5+F2KeaFgx4dPSMFdlD0dU\n" +
            "LkaMQimQ8eg6metpZR8E/qjx8s9RDAPRwm38dCG4echIN/D+bNovsC70obQW+VK8hggTAgMBAAEC\n" +
            "gYA21Dx4TFbtfHcmYp4VfkscRyqIMlmVg+g8m2ts1FA2G77E0NjIdOlrp/A5AooGzF96mKYn3/Vf\n" +
            "Rtybvmef5/9OE84zCUWLXyCz2LqlMaL6sNZx24mrV0i/5EGg2LuL/+xVixU8l82+FPmBIztumh+k\n" +
            "KJVIy0YDDGzAhOpLIyQJ2QJBAPu6fmUtRm/A6ff0NC2GVx/LrYGgXf2NrIjej3CesN/FyF+ODkp5\n" +
            "lV4ngvTM+MKs1o/1EYmN5SLYhpbiG0Ub5KUCQQDPhl4pVUZ5CnJc44L5LbWYFubMWUam4iBcleWf\n" +
            "+HKa6mg5xzxFFovY4QXMlBzp+6cKPIG9KjxouPRBJM8XecRXAkAi9AZQ7jR1mAfk0hfcqma2l4WE\n" +
            "Fkx2xJFMf/rS3HYa3E+yVPtPBArlg/7/FucDwRQZ8SF6RCWo7P/jO4ol0nWxAkAe8K6bRP6Dz13r\n" +
            "oXQGiJ0ZdtikQO86tF4Uz7hzmEwl8qrlamH+/vSMukfuD2scK4vlB85kEKb/CgxIph9GJb5zAkAH\n" +
            "EFR2JxWfkrGVPedSAysXA69yvPeQ+Dp4at37MIwjS7pDGt2Q/XtU1w5PSnvbu8HUQ7MEzXP9Vvzn\n" +
            "0CKrxzKV";

    public static byte[] decryptBASE64(String key) {
        return Base64.decodeBase64(key);
    }

    public static String encryptBASE64(byte[] bytes) {
        return Base64.encodeBase64String(bytes);
    }


    /**
     * 解密
     * @param encodedData
     * @param
     * @return
     * @throws Exception
     */
    public static String decryptByPrivateKeyData(String encodedData)throws Exception {
        byte[] decodedData = decryptByPrivateKey(encodedData, RsaJsUtils.PRIVATE_KEY);
        String jsonStr = new String(decodedData);
        return jsonStr;
    }

    /**
     * 用私钥对信息生成数字签名
     *
     * @param data    加密数据
     * @param privateKey 私钥
     * @return
     * @throws Exception
     */
    public static String sign(byte[] data, String privateKey) throws Exception {
        // 解密由base64编码的私钥
        byte[] keyBytes = decryptBASE64(privateKey);
        // 构造PKCS8EncodedKeySpec对象
        PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(keyBytes);
        // KEY_ALGORITHM 指定的加密算法
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
        // 取私钥匙对象
        PrivateKey priKey = keyFactory.generatePrivate(pkcs8KeySpec);
        // 用私钥对信息生成数字签名
        Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);
        signature.initSign(priKey);
        signature.update(data);
        return encryptBASE64(signature.sign());
    }

    /**
     * 校验数字签名
     *
     * @param data   加密数据
     * @param publicKey 公钥
     * @param sign   数字签名
     * @return 校验成功返回true 失败返回false
     * @throws Exception
     */
    public static boolean verify(byte[] data, String publicKey, String sign)
            throws Exception {
        // 解密由base64编码的公钥
        byte[] keyBytes = decryptBASE64(publicKey);
        // 构造X509EncodedKeySpec对象
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);
        // KEY_ALGORITHM 指定的加密算法
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
        // 取公钥匙对象
        PublicKey pubKey = keyFactory.generatePublic(keySpec);
        Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);
        signature.initVerify(pubKey);
        signature.update(data);
        // 验证签名是否正常
        return signature.verify(decryptBASE64(sign));
    }

    public static byte[] decryptByPrivateKey(byte[] data, String key) throws Exception {
        // 对密钥解密
        byte[] keyBytes = decryptBASE64(key);
        // 取得私钥
        PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
        Key privateKey = keyFactory.generatePrivate(pkcs8KeySpec);
        // 对数据解密
        Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        return cipher.doFinal(data);
    }

    /**
     * 解密<br>
     * 用私钥解密
     *
     * @param data
     * @param key
     * @return
     * @throws Exception
     */
    public static byte[] decryptByPrivateKey(String data, String key)
            throws Exception {
        return decryptByPrivateKey(decryptBASE64(data),key);
    }

    /**
     * 解密<br>
     * 用公钥解密
     *
     * @param data
     * @param key
     * @return
     * @throws Exception
     */
    public static byte[] decryptByPublicKey(byte[] data, String key)
            throws Exception {
        // 对密钥解密
        byte[] keyBytes = decryptBASE64(key);
        // 取得公钥
        X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
        Key publicKey = keyFactory.generatePublic(x509KeySpec);
        // 对数据解密
        Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
        cipher.init(Cipher.DECRYPT_MODE, publicKey);
        return cipher.doFinal(data);
    }

    /**
     * 加密<br>
     * 用公钥加密
     *
     * @param data
     * @param key
     * @return
     * @throws Exception
     */
    public static byte[] encryptByPublicKey(String data, String key)
            throws Exception {
        // 对公钥解密
        byte[] keyBytes = decryptBASE64(key);
        // 取得公钥
        X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
        Key publicKey = keyFactory.generatePublic(x509KeySpec);
        // 对数据加密
        Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        return cipher.doFinal(data.getBytes());
    }

    /**
     * 加密<br>
     * 用私钥加密
     *
     * @param data
     * @param key
     * @return
     * @throws Exception
     */
    public static byte[] encryptByPrivateKey(byte[] data, String key)
            throws Exception {
        // 对密钥解密
        byte[] keyBytes = decryptBASE64(key);
        // 取得私钥
        PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
        Key privateKey = keyFactory.generatePrivate(pkcs8KeySpec);
        // 对数据加密
        Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
        cipher.init(Cipher.ENCRYPT_MODE, privateKey);
        return cipher.doFinal(data);
    }

    /**
     * 取得私钥
     *
     * @param keyMap
     * @return
     * @throws Exception
     */
    public static String getPrivateKey(Map<String, Key> keyMap)
            throws Exception {
        Key key = (Key) keyMap.get(PRIVATE_KEY);
        return encryptBASE64(key.getEncoded());
    }

    /**
     * 取得公钥
     *
     * @param keyMap
     * @return
     * @throws Exception
     */
    public static String getPublicKey(Map<String, Key> keyMap)
            throws Exception {
        Key key = keyMap.get(PUBLIC_KEY);
        return encryptBASE64(key.getEncoded());
    }

    /**
     * 初始化密钥
     *
     * @return
     * @throws Exception
     */
    public static Map<String, Key> initKey() throws Exception {
        KeyPairGenerator keyPairGen = KeyPairGenerator
                .getInstance(KEY_ALGORITHM);
        keyPairGen.initialize(1024);
        KeyPair keyPair = keyPairGen.generateKeyPair();
        Map<String, Key> keyMap = new HashMap(2);
        keyMap.put(PUBLIC_KEY, keyPair.getPublic());// 公钥
        keyMap.put(PRIVATE_KEY, keyPair.getPrivate());// 私钥
        return keyMap;
    }

    public static void main(String[] args) throws Exception {
        Map<String, Key> keyMap = RsaJsUtils.initKey();
        //"MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDbQPesw6//kWjGGxwmt1cJWCIHUKIM4QDiOmNyYhtMzOloTunHNHBZTBSSKqXaHT5rGAWLrzSg+UFS9Awbt66ucB3vljMiNGBmdxuDdbBpM75OomXyw0R6zrwif2JUm3kLtJVERyiidqNFyzDLNbqfwRkhx7wl5Ms99+nkRu8liwIDAQAB";//
       String publicKey = RsaJsUtils.getPublicKey(keyMap);
        String privateKey = RsaJsUtils.getPrivateKey(keyMap);
        System.err.println("公钥: \n\r" + publicKey);
        System.err.println("私钥： \n\r" + privateKey);

        System.err.println("公钥加密——私钥解密");
        String inputStr = "nihao-abcd121212";
        byte[] encodedData = encryptByPublicKey(inputStr, publicKey);
        String ee = new String(encodedData);
        byte[] decodedData = decryptByPrivateKey(encodedData,
                privateKey);
        String outputStr = new String(decodedData);
        System.err.println("加密前: " + inputStr + "\n\r" + "解密后: " + outputStr);



     /*   System.err.println("私钥加密——公钥解密");
        String inputStr = "sign";
        byte[] data = inputStr.getBytes();
        byte[] encodedData1 = .encryptByPrivateKey(data, privateKey);
        byte[] decodedData1= .decryptByPublicKey(encodedData, publicKey);
        String outputStr1 = new String(decodedData);
        System.err.println("加密前: " + inputStr + "\n\r" + "解密后: " + outputStr);
        (inputStr, outputStr);
        System.err.println("私钥签名——公钥验证签名");
        // 产生签名
        String sign = .sign(encodedData, privateKey);
        System.err.println("签名:" + sign);
        // 验证签名
        boolean status = RSACoder.verify(encodedData, publicKey, sign);
        System.err.println("状态:" + status);
        assertTrue(status);*/
    }
}
