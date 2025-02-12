package me.whiteship.demospringsecurityform.Account;

import org.springframework.security.test.context.support.WithMockUser;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@WithMockUser(username = "mans", roles = "USER")
public @interface WithUser {
}
