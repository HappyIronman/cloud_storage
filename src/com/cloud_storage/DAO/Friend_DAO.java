package com.cloud_storage.DAO;

import com.cloud_storage.entity.Friend_apply;
import com.cloud_storage.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by dell on 1/24/2017.
 */
@Repository
public interface Friend_DAO {
    public List<Integer> selectFriendsByUser(User u);
    public int insert_Friend_apply(Friend_apply friend_apply);
    public List<Friend_apply> select_Friend_apply(int target_id);
    public int select_same_apply(Friend_apply friend_apply);
    public int select_friend(@Param("User_id1") int user_id1,@Param("User_id2") int user_id2);
    public int update_friend_apply_to_0(Friend_apply friend_apply);
    public int insert_Friends(@Param("User_id1")int User_id1,@Param("User_id2")int User_id2);
}
