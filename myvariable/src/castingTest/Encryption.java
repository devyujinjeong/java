package castingTest;

public class Encryption {
   public static void main(String[] args) {
      String password = "a1b2c3";
      String encryptedPassword = "", decryptedPassword = "";
      final int KEY = 3; //KEY�� 3�̶�� ����� ����!!
      
      for (int i = 0; i < password.length(); i++) { //�н������� ���̸�ŭ �ݺ��� ����
         encryptedPassword += (char)(password.charAt(i) * KEY);
      }
      
      System.out.println(encryptedPassword);
      
      for (int i = 0; i < encryptedPassword.length(); i++) {
         decryptedPassword += (char)(encryptedPassword.charAt(i) / KEY);
      }
      
      System.out.println(decryptedPassword);
   }
}