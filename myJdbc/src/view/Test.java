package view;

import dao.PostDAO;
import dao.UserDAO;
import oracle.net.aso.a;
import vo.PostVO;
import vo.UserVO;

public class Test {
   public static void main(String[] args) {
	   PostDAO postDAO = new PostDAO();
	   PostVO postVO = new PostVO();
	   UserDAO userDAO = new UserDAO();
	   UserVO userVO = new UserVO();
	   
	   
////   �α���
	   if(userDAO.login("jyj1234", "1234")) {
	      System.out.println("�α��� ����, " + UserDAO.session);
	   }else {
	      System.out.println("�α��� ����");
	   }
	   
//	   �Խñ� �߰� --> �α����� �ؾ� userId�� ������ �Ǵϱ�
//	   postVO.setPostTitle("�б�");
//	   postVO.setPostContent("�б��� ����"); 
//	   postVO.setUserId(UserDAO.session); //UserDAO.session�� null�̶�µ�...?
//	   postDAO.insert(postVO);
//	   System.out.println("�Խñ� �߰� ����");

	   
	    
//	   �Խñ� ��ü ��ȸ
//	   System.out.println(postDAO.selectAll());
	   
//	   �Խñ� ��ȸ
//	   System.out.println(postDAO.select().getId());
	   
//	   �Խñ� �ۼ��� ��ȸ
	  	   
//	   �Խñ� ����
//	   postDAO.update(postVO);
	   
//	   �Խñ� ����
//	   postDAO.delete(null);
	   
//	   ��ȸ�� ����
//	   postDAO.selectUserByPost(null);
	   
//      
////      ȸ�� ��ü ���� ��ȸ
////      userDAO.selectAll().forEach(System.out::println);
//      
////      �α���
//      if(userDAO.login("hds1234", "1234")) {
//         System.out.println("�α��� ����, " + UserDAO.session);
////         ����������
//         userVO = userDAO.select();
//         System.out.println(userVO.toString());
//         
////         ȸ��Ż��
//         userDAO.withdraw();
//         userVO = userDAO.select();
//         System.out.println("ȸ��Ż�� ����, " + userVO.getUserStatus());
//         
////         ȸ������
//         userDAO.restore();
//         userVO = userDAO.select();
//         System.out.println("ȸ������ ����, " + userVO.getUserStatus());
//         
////         ȸ�� ���� ����
//         userVO = userDAO.select();
//         userVO.setUserName("ȫ�浿");
//         userDAO.update(userVO);
//         
//         userVO = userDAO.select();
//         System.out.println("ȸ������ ����, " + userVO.toString());
//         
////         ��õ�� ��ȸ
//         userDAO.selectRecommender().forEach(System.out::println);
//         
////         ��õ�� ��ȸ
//         System.out.println("���� ��õ�� ���: " + userDAO.selectCountOfRecommender());
//         
//      }else {
//         System.out.println("�α��� ����");
//      }
//      
////      ���̵� �ߺ��˻�, ȸ������
//	      userVO.setUserId("jyj1234");
//	      userVO.setUserPassword("1234");
//	      userVO.setUserName("������");
//	      userVO.setUserBirth("2001-01-01");
//	      userVO.setUserEmail("jyj1234@naver.com");
//	      userVO.setUserPhone("01043214321");
//	      userVO.setUserRecommenderId("jbg1234");
//	     
//	      if(!userDAO.checkId(userVO.getUserId())){
//	         userDAO.join(userVO);
//	         System.out.println("ȸ������ ����");
//	      }else {	
//	         System.out.println("�ߺ��� ���̵�");
//	      }
//  
   }
}
