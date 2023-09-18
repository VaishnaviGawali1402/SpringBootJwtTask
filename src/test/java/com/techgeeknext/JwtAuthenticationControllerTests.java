//package com.techgeeknext;
//
//import com.techgeeknext.controller.JwtAuthenticationController;
//import com.techgeeknext.controller.UserController;
//import com.techgeeknext.model.UserDto;
//import com.techgeeknext.service.JwtUserDetailsService;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//
//@ExtendWith(MockitoExtension.class)
//public class JwtAuthenticationControllerTests {
//    @InjectMocks
//    private JwtAuthenticationController userController;
//
//    @Mock
//    private JwtUserDetailsService userDetailsService;
//
//    @BeforeEach
//    public void setUp() {
//        // No need to manually create instances of UserController or UserDetailsService; Mockito does it for you.
//    }
//
//    @Test
//    public void testSaveUser() throws Exception {
//        // Arrange
//        UserDto userDto = new UserDto(); // Create a UserDto object as needed
//        User savedUser = new User(); // Create a User object to represent the saved user
//
//        Mockito.when(userDetailsService.save(userDto)).thenReturn(savedUser);
//
//        // Act
//        ResponseEntity<?> response = userController.(userDto);
//
//        // Assert
//        assertNotNull(response);
//        assertEquals(HttpStatus.OK, response.getStatusCode());
//        assertNotNull(response.getBody());
//        assertSame(savedUser, response.getBody());
//
//        // Verify that userDetailsService.save was called with the userDto
//        verify(userDetailsService, times(1)).save(userDto);
//    }
//}
//
