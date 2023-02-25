package com.shopme.admin.user;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoderTest {

	@Test
	public void passwordEncoderTest() {
		String rawString = "nam2020";
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		String encode = bCryptPasswordEncoder.encode(rawString);
		boolean matches = bCryptPasswordEncoder.matches(rawString, encode);
		assertThat(matches).isTrue();
	}
}
