package Dao;

import java.util.Map;

public interface loginMapper {
    public String getpassword(String id);

    public Map<String,Object> obtainUserInfo(String id);
}
