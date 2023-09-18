package com.techgeeknext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.techgeeknext.controller.UserController;
import com.techgeeknext.model.UserDevice;
import com.techgeeknext.repository.UserDeviceDetailsRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@ExtendWith(MockitoExtension.class)
public class UserControllerTest {

    @InjectMocks
    private UserController userController;

    @Mock
    private UserDeviceDetailsRepository userDeviceDetailsRepository;

    @BeforeEach
    public void setUp() {

    }

    @Test
    public void testGetIdReturnsListOfDeviceIds() {

        List<String> expectedDeviceIds = Arrays.asList("device1", "device2");
        when(userDeviceDetailsRepository.getDeviceId()).thenReturn(expectedDeviceIds);
        List<String> result = userController.getId();
        assertEquals(expectedDeviceIds, result);
    }

    @Test
    public void testGetIdReturnsEmptyListWhenNoDevices() {

        when(userDeviceDetailsRepository.getDeviceId()).thenReturn(Collections.emptyList());
        List<String> result = userController.getId();
        assertEquals(Collections.emptyList(), result);
    }


}
