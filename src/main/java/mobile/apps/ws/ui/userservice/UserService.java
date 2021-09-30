package mobile.apps.ws.ui.userservice;

import mobile.apps.ws.ui.model.request.UserDetailsRequestModel;
import mobile.apps.ws.ui.model.responses.UserRest;

public interface UserService {

    UserRest createUser(UserDetailsRequestModel userDetails);
}
