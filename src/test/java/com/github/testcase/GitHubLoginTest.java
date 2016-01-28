package com.github.testcase;

import static com.github.util.Main.getDriver;
import static org.junit.Assert.*;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.github.ProjectObjectModel.GitHubHomePage;
import com.github.ProjectObjectModel.GitHubLoginPage;

public class GitHubLoginTest {

	@AfterClass
	public static void tearDown() {
		getDriver().close();
	}

	@Test
	public void login_failed() {
		//given
		GitHubLoginPage loginPage = new GitHubHomePage().open().goToLoginPage();
		//when
		loginPage.login("user", "password");
		//then
		assertTrue(loginPage.isLoginError());
	}
}
