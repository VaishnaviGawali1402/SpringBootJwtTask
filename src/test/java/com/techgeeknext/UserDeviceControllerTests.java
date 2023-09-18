package com.techgeeknext;


import com.techgeeknext.controller.UserDeviceController;
import com.techgeeknext.model.UserDevice;
import com.techgeeknext.repository.UserDeviceDetailsRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
@ExtendWith(MockitoExtension.class)
public class UserDeviceControllerTests {
     @InjectMocks
     private UserDeviceController userController;

     @Mock
     private UserDeviceDetailsRepository userDeviceDetailsRepository;

     @BeforeEach
     public void setUp() {
    }

    @Test
    public void testRegisterUserDevice() {

        UserDevice userDevice = new UserDevice(); // Create a UserDevice object as needed

        // Mock the HttpServletRequest and HttpServletResponse
        MockHttpServletRequest request = new MockHttpServletRequest();
        MockHttpServletResponse response = new MockHttpServletResponse();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request, response));

        //userController.registerUserDevice(userDevice);


        Mockito.verify(userDeviceDetailsRepository,Mockito.times(1)).save(userDevice);

    }
}





