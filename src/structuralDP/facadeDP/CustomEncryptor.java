package structuralDP.facadeDP;

public class CustomEncryptor {
    public static void main(String[] args) {
        //text which should be encrypted

        String text = "Content";

        System.out.println("*********Bad Scenario*******");
        //


        AESEncryptor aesEncryptor = new AESEncryptor();
        aesEncryptor.encrypt(text);

        MD5Encryptor md5Encryptor = new MD5Encryptor();
        md5Encryptor.encrypt(text, "securityKey");

        SHAEncryptor shaEncryptor = new SHAEncryptor();
        shaEncryptor.encrypt(text, "SecurityKey", true);


        System.out.println("*********Good Scenario (With Facade) DP*******");

        FacadeEncryptor facadeEncryptor = new FacadeEncryptor();
        facadeEncryptor.encryptor(text, FacadeEncryptor.EncrypType.SHA);
        facadeEncryptor.encryptor(text, FacadeEncryptor.EncrypType.AES);
        facadeEncryptor.encryptor(text, FacadeEncryptor.EncrypType.MD5);
    }
}