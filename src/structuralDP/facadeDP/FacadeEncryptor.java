package structuralDP.facadeDP;

public class FacadeEncryptor {

    private AESEncryptor aesEncryptor = new AESEncryptor();
    private MD5Encryptor md5Encryptor = new MD5Encryptor();
    private SHAEncryptor shaEncryptor = new SHAEncryptor();

    public void encryptor(String text, EncrypType encrypType){

        switch(encrypType){
            case MD5: md5Encryptor.encrypt(text, "SecretMessage");
            break;
            case SHA: shaEncryptor.encrypt(text, "SecretKey", true);
            break;
            case AES: aesEncryptor.encrypt(text);
            break;
            default: throw new IllegalArgumentException(encrypType.toString());
        }

    }

    public enum EncrypType{
        SHA,
        MD5,
        AES
    }
}
