package com.github.ProjectObjectModel;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GitHubHomePage extends GitHubPage<GitHubHomePage> {

	@Override
	protected ExpectedCondition getPageLoadCondition() {
		return ExpectedConditions.titleContains("Where software is built");
	}

	@Override
	public String getPageUrl() {
		return "";
	}

	public GitHubLoginPage goToLoginPage() {
		return new GitHubLoginPage().openPage(GitHubLoginPage.class);
	}

	public GitHubHomePage open() {
		return new GitHubHomePage().openPage(GitHubHomePage.class);
	}

}
