package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import vo.PostVO;
import vo.UserVO;

public class UserDAO {
   
   public static Long session;
   
//   ����
   private Connection connection;
//   ���� �ۼ� --> statement�� ���� ���� ��ζ�� �����ϸ� ��
   private PreparedStatement preparedStatement;
//   ��� --> ������� ����� ȭ�鿡 �����ְ� ���� �� ���
   private ResultSet resultSet;
   
//   ���̵� �ߺ��˻�
   public boolean checkId(String userId) { //�켱 ����ڿ��� ���̵� �޾ƾ��ϴϱ� �Ű����� �����ϱ�
//     check���� true�� ������ ���̵� �����Ѵٴ� �ǹ��̹Ƿ�, �ߺ��Ǿ��ٰ� ��
//	   false�� ������ �ߺ��� ���̵� �������� �ʴٴ� �ǹ�
	   boolean check = false;
//     ���� �ۼ� --> select
	   String query = "SELECT USER_ID FROM TBL_USER WHERE USER_ID = ?";
//      ����
      connection = DBConnecter.getConnection();
	      try {
	//       ���� ���� : �׷� �̰� connection�� �ִ� prepareStatement��� �޼ҵ带 ���� query�� �����Ѵٴ� �ǹ�
	         preparedStatement = connection.prepareStatement(query);
	//       ���� �ϼ� --> ?�� ���� �ִ� �κ��� �ϼ���Ų�ٰ� �����ϸ� ��.
	         preparedStatement.setString(1, userId);
	//       ���� ������
	//       1. SELECT : executeQuery()
	//       2. �� �� : executeUpdate()
//	         ���� ���� �κ� �ڵ尡 ���� �Ȱ�. check �κ��� true, false�� ���޹޾Ƽ� ���� Ȥ�� ������ �˷��ֱ� ���ؼ� ������ �ǰ�?
	         resultSet = preparedStatement.executeQuery();
	         check = resultSet.next();
	         
	      } catch (SQLException e) {
	         System.out.println("checkId(String) SQL�� ����");
	         e.printStackTrace();
	      } finally {
	         try {
//	        	 �������� �ݾ��ֱ�
//	        	 ����κп��� null�� �ƴϴٶ�� �� �ڵ嵵 �� ���ذ� �Ȱ�.
	            if(resultSet != null) {
	               resultSet.close();
	            }
	            if(preparedStatement != null) {
	               preparedStatement.close();
	            }
	            if(connection != null) {
	               connection.close();
	            }
	         } catch (SQLException e) {
	            throw new RuntimeException(e.getMessage());
	         }
	      }
	      return check;
   }
   
//   ȸ������
   public void join(UserVO user) {
      String query = "INSERT INTO TBL_USER "
            + "(ID, USER_ID, USER_PASSWORD, USER_NAME, USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_BIRTH, USER_RECOMMENDER_ID) "
            + "VALUES(SEQ_USER.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?)";
     // �����ϱ�
      connection = DBConnecter.getConnection();
      
      try {
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, user.getUserId());
        preparedStatement.setString(2, user.getUserPassword());
        preparedStatement.setString(3, user.getUserName());
        preparedStatement.setString(4, user.getUserPhone());
        preparedStatement.setString(5, user.getUserNickname());
        preparedStatement.setString(6, user.getUserEmail());
        preparedStatement.setString(7, user.getUserBirth());
        preparedStatement.setString(8, user.getUserRecommenderId());
        
		preparedStatement.executeUpdate();
		
	} catch (SQLException e) {
		 System.out.println("join(UserVO) SQL�� ����");
         e.printStackTrace();
      } finally {
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
         }
      }
   }
      
//   �α���
   public boolean login(String userId, String userPassword) {
      String query = "SELECT ID FROM TBL_USER WHERE USER_ID = ? AND USER_PASSWORD = ?";
      boolean check = false;
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, userId);
         preparedStatement.setString(2, userPassword);
         resultSet = preparedStatement.executeQuery();
         check = resultSet.next();
         
         if(check) {
            session = resultSet.getLong(1);
         }
      } catch (SQLException e) {
         System.out.println("login(String, String) SQL ����");
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
         }
      }
      
      return check;
   }
   
//   �α׾ƿ�
   public void logout() {
      session = null;
   }
   
//   ���� ������
   public UserVO select() {
      String query = "SELECT ID, USER_ID, USER_PASSWORD, USER_NAME, USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_BIRTH, USER_RECOMMENDER_ID, USER_STATUS "
            + "FROM TBL_USER WHERE ID = ?";
      UserVO userVO = null;
      try {
         connection = DBConnecter.getConnection();
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, session); //������������ ��ȣ�� ����� ���¿��� ��ȸ�ϴ� ���̴ϱ�
         resultSet = preparedStatement.executeQuery();
         userVO = new UserVO();
         if(resultSet.next()) {
            userVO.setId(resultSet.getLong(1));
            userVO.setUserId(resultSet.getString(2));
            userVO.setUserPassword(resultSet.getString(3));
            userVO.setUserName(resultSet.getString(4));
            userVO.setUserPhone(resultSet.getString(5));
            userVO.setUserNickname(resultSet.getString(6));
            userVO.setUserEmail(resultSet.getString(7));
            userVO.setUserBirth(resultSet.getString(8));
            userVO.setUserRecommenderId(resultSet.getString(9));
            userVO.setUserStatus(resultSet.getString(10));
         }
      } catch (SQLException e) {
         System.out.println("select() SQL ����");
         e.printStackTrace();
         
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
         }
      }
      return userVO;
   }
   
//   ȸ�� ��ü ��ȸ
   public List<UserVO> selectAll() {
      String query = "SELECT ID, USER_ID, USER_PASSWORD, USER_NAME, USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_BIRTH, USER_RECOMMENDER_ID, USER_STATUS "
            + "FROM TBL_USER";
      List<UserVO> users = new ArrayList<UserVO>();
      UserVO userVO = null;
      try {
         connection = DBConnecter.getConnection();
         preparedStatement = connection.prepareStatement(query);
         resultSet = preparedStatement.executeQuery();
         while(resultSet.next()) {
            userVO = new UserVO();
            userVO.setId(resultSet.getLong(1));
            userVO.setUserId(resultSet.getString(2));
            userVO.setUserPassword(resultSet.getString(3));
            userVO.setUserName(resultSet.getString(4));
            userVO.setUserPhone(resultSet.getString(5));
            userVO.setUserNickname(resultSet.getString(6));
            userVO.setUserEmail(resultSet.getString(7));
            userVO.setUserBirth(resultSet.getString(8));
            userVO.setUserRecommenderId(resultSet.getString(9));
            userVO.setUserStatus(resultSet.getString(10));
            
            users.add(userVO);
         }
      } catch (SQLException e) {
         System.out.println("selectAll() SQL ����");
         e.printStackTrace();
         
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
         }
      }
      return users;
   }
   
//   ȸ�� Ż��
   public void withdraw() {
      String query = "UPDATE TBL_USER SET USER_STATUS = 'Ż��' WHERE ID = ?";
      try {
         connection = DBConnecter.getConnection();
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, session);
         preparedStatement.executeUpdate();
      } catch (SQLException e) {
         System.out.println("withdraw() SQL ����");
         e.printStackTrace();
      } finally {
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
         }
      }
   }
   
//   ȸ�� ����
   public void restore() {
      String query = "UPDATE TBL_USER SET USER_STATUS = '�Ϲ�' WHERE ID = ?";
      try {
         connection = DBConnecter.getConnection();
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, session);
         preparedStatement.executeUpdate();
      } catch (SQLException e) {
         System.out.println("restore() SQL ����");
         e.printStackTrace();
      } finally {
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
         }
      }
   }
   
//   ��õ�� ��ȸ
   public List<UserVO> selectRecommender(){
      String query = "SELECT ID, USER_ID, USER_PASSWORD, USER_NAME, USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_BIRTH, USER_RECOMMENDER_ID, USER_STATUS "
            + "FROM TBL_USER WHERE USER_RECOMMENDER_ID = (SELECT USER_ID FROM TBL_USER WHERE ID = ?)";
      List<UserVO> users = new ArrayList<UserVO>();
      UserVO userVO = null;
      
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, session);
         resultSet = preparedStatement.executeQuery();
         
         while(resultSet.next()) {
            userVO = new UserVO();
            userVO.setId(resultSet.getLong(1));
            userVO.setUserId(resultSet.getString(2));
            userVO.setUserPassword(resultSet.getString(3));
            userVO.setUserName(resultSet.getString(4));
            userVO.setUserPhone(resultSet.getString(5));
            userVO.setUserNickname(resultSet.getString(6));
            userVO.setUserEmail(resultSet.getString(7));
            userVO.setUserBirth(resultSet.getString(8));
            userVO.setUserRecommenderId(resultSet.getString(9));
            userVO.setUserStatus(resultSet.getString(10));
            users.add(userVO);
         }
      } catch (SQLException e) {
         System.out.println("selectRecommender() SQL ����");
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
         }
      }
      return users;
   }
   
   
//   ��õ�� ��ȸ
   public Long selectCountOfRecommender(){
      String query = "SELECT COUNT(ID) "
            + "FROM TBL_USER WHERE USER_RECOMMENDER_ID = (SELECT USER_ID FROM TBL_USER WHERE ID = ?)";
      Long count = 0L;
      List<UserVO> users = new ArrayList<UserVO>();
      UserVO userVO = null;
      
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, session);
         resultSet = preparedStatement.executeQuery();
         
         resultSet.next();
         count = resultSet.getLong(1);
      } catch (SQLException e) {
         System.out.println("selectRecommender() SQL ����");
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
         }
      }
      return count;
   }
   
   
//   ȸ�� ���� ����
   public void update(UserVO userVO) {
      String query = "UPDATE TBL_USER SET USER_PASSWORD = ?, USER_NAME = ?, USER_PHONE = ?, USER_NICKNAME = ?, USER_EMAIL = ? WHERE ID = ?";
      try {
         connection = DBConnecter.getConnection();
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, userVO.getUserPassword());
         preparedStatement.setString(2, userVO.getUserName());
         preparedStatement.setString(3, userVO.getUserPhone());
         preparedStatement.setString(4, userVO.getUserNickname());
         preparedStatement.setString(5, userVO.getUserEmail());
         preparedStatement.setLong(6, session);
         preparedStatement.executeUpdate();
      } catch (SQLException e) {
         System.out.println("update(UserVO) SQL ����");
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
         }
      }
   }
}
























	
	
	
	
	
