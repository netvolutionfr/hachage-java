public class Main {
    // Fonction qui calcule le MD5 d'une chaîne de caractères
    public static String md5(String str) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(str.getBytes());

            // Conversion en hexadécimal
            StringBuilder sb = new StringBuilder();
            for (byte b : array) {
                sb.append(Integer.toHexString((b & 0xFF) | 0x100), 1, 3);
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    // Fonction qui calcule le SHA1 d'une chaîne de caractères
    public static String sha1(String str) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("SHA1");
            byte[] array = md.digest(str.getBytes());

            // Conversion en hexadécimal
            StringBuilder sb = new StringBuilder();
            for (byte b : array) {
                sb.append(Integer.toHexString((b & 0xFF) | 0x100), 1, 3);
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("MD5 de \"Hello world!\" : " + md5("Hello world!"));
        System.out.println("SHA1 de \"Hello world!\" : " + sha1("Hello world!"));
    }
}