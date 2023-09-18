package com.techgeeknext.repository;

import com.techgeeknext.model.UserDevice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserDeviceDetailsRepository  extends JpaRepository<UserDevice,Long> {

//   @Query(nativeQuery = true , value = "SELECT UserDevice.device_id from UserDevice inner join on UserDao where UserDevice.user_id=UsrDao.user_id;")
    //to check if game_id and device_id combination is unique
    @Query(nativeQuery = true,value = "SELECT user_device.device_id from user_device join user on user_device.user_id=user.user_id;")
    public List<String> getDeviceId();

//    @Query(nativeQuery = true,value = "select CONCAT(user_device.device_id ,' ',user.game_id)from user_device join user on user_device.user_id=user.user_id;")
//    public List<String> getGameIdAndDeviceId();

}
