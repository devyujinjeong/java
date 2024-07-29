package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import vo.PostVO;
import vo.UserVO;

public class PostDAO {
	
//   ����
   private Connection connection;
//   ���� �ۼ�
   private PreparedStatement preparedStatement;
//   ���
   private ResultSet resultSet;
   
//   �Խñ� ��ü ��ȸ
   public List<PostVO> selectAll() {
      String query = "SELECT ID, POST_TITLE, POST_CONTENT, POST_REGISTER_DATE, POST_UPDATE_DATE, USER_ID "
             + "FROM TBL_POST";
      List<PostVO> posts = new ArrayList<PostVO>(); //arraylist�� ��� ȭ�鿡 ������ ����
//    �̰� ����....?
      PostVO postVO = null;
      
      try {
         connection = DBConnecter.getConnection(); 
         preparedStatement = connection.prepareStatement(query);
         resultSet = preparedStatement.executeQuery();
         
//       resultSet���� next()�޼ҵ带 ���캸��
//       �� �������� �ִ� �� �������� �� �� false��
//       �׷��� �̷��� �� ���, ������ ����� ���� �������� �Ǵ� ����.
         while(resultSet.next()) {
            postVO = new PostVO(); // ��ü�� ����°ű� �ѵ�.....��.....?
            postVO.setId(resultSet.getLong(1));
            postVO.setPostTitle(resultSet.getString(2));
            postVO.setPostContent(resultSet.getString(3));
            postVO.setPostRegisterDate(resultSet.getString(4));
            postVO.setPostUpdateDate(resultSet.getString(5));
            postVO.setUserId(resultSet.getLong(6));

            posts.add(postVO);
         }
      } catch (SQLException e) {
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
      return posts;
   }
   
//   �Խñ� ��ȸ
   public PostVO select() {
      String query = "SELECT ID, POST_TITLE, POST_CONTENT, POST_REGISTER_DATE, POST_UPDATE_DATE, USER_ID "
             + "FROM TBL_POST WHERE ID = ?";
      PostVO postVO = null;
      
      try {
         connection = DBConnecter.getConnection();
         preparedStatement = connection.prepareStatement(query);
         resultSet = preparedStatement.executeQuery();
         
         while(resultSet.next()) {
            postVO = new PostVO();
            postVO.setId(resultSet.getLong(1));
               postVO.setPostTitle(resultSet.getString(2));
               postVO.setPostContent(resultSet.getString(3));
               postVO.setPostRegisterDate(resultSet.getString(4));
               postVO.setPostUpdateDate(resultSet.getString(5));
               postVO.setUserId(resultSet.getLong(6));
         }
      } catch (SQLException e) {
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

      return postVO;
      
   }
   
//   �Խñ� �ۼ��� ��ȸ
   public UserVO selectUserByPost(Long id) {
      String query = "SELECT U.ID, U.USER_ID, USER_PASSWORD, USER_NAME, USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_BIRTH, USER_RECOMMENDER_ID, USER_STATUS "
            + "FROM TBL_USER U JOIN TBL_POST P ON U.USER_ID = P.USER_ID AND P.ID = ?";
      UserVO userVO = null;
      try {
         connection = DBConnecter.getConnection();
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, id);
         resultSet = preparedStatement.executeQuery();
         
         if(resultSet.next()) {
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
         }
      } catch (SQLException e) {
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
   
//   �Խñ� �߰�
   public void insert(PostVO postVO) {
      String query = "INSERT INTO TBL_POST "
            + "(ID, POST_TITLE, POST_CONTENT, USER_ID) "
            + "VALUES(SEQ_POST.NEXTVAL, ?, ?, ?)";
      
      try {
         connection = DBConnecter.getConnection();
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, postVO.getPostTitle());
         preparedStatement.setString(2, postVO.getPostContent());
         preparedStatement.setLong(3, UserDAO.session);
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
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
   
//   �Խñ� ����
   public void update(PostVO postVO) {
      String query = "UPDATE TBL_POST SET POST_TITLE = ?, POST_CONTENT = ?, POST_UPDATE_DATE = SYSDATE WHERE ID = ?";
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, postVO.getPostTitle());
         preparedStatement.setString(2, postVO.getPostContent());
         preparedStatement.setLong(3, postVO.getId());
         preparedStatement.executeUpdate();
      } catch (SQLException e) {
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
   
//   �Խñ� ����
   public void delete(Long id) {
      String query = "DELETE FROM TBL_POST WHERE ID = ?";
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, id);
         preparedStatement.executeUpdate();
      } catch (SQLException e) {
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
   
//   ��ȸ�� ����(��ȸ�� �� ����)
   public void updateReadCount(Long id) {
      String query = "UPDATE TBL_POST SET POST_READ_COUNT = POST_READ_COUNT + 1 WHERE ID = ?";
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, id);
         preparedStatement.executeUpdate();
      } catch (SQLException e) {
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
}
