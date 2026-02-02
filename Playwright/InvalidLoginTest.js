const { Builder, By, until } = require('selenium-webdriver');
const assert = require('assert');

class LoginTest {
  constructor() {
    this.driver = null;
  }

  async setUp() {
    this.driver = await new Builder().forBrowser('chrome').build();
  }

  async tearDown() {
    if (this.driver) {
      await this.driver.quit();
    }
  }

  async testInvalidLogin() {
    try {
      // Test data
      const invalidUsername = 'invalidUser';
      const invalidPassword = 'wrongPassword';
      
      // Navigate to the login page
      await this.driver.get('https://your-application-url.com/login');
      
      // Wait for page to load
      await this.driver.wait(until.titleContains('Login'), 10000);
      
      // Find username field and enter invalid username
      const usernameField = await this.driver.wait(
        until.elementLocated(By.id('username')), 10000
      );
      await usernameField.clear();
      await usernameField.sendKeys(invalidUsername);
      
      // Find password field and enter invalid password
      const passwordField = await this.driver.wait(
        until.elementLocated(By.id('password')), 10000
      );
      await passwordField.clear();
      await passwordField.sendKeys(invalidPassword);
      
      // Click on the login button
      const loginButton = await this.driver.wait(
        until.elementLocated(By.id('loginButton')), 10000
      );
      await loginButton.click();
      
      // Wait for error message to appear
      const errorMessage = await this.driver.wait(
        until.elementLocated(By.className('error-message')), 10000
      );
      
      // Verify error message is displayed
      const isErrorDisplayed = await errorMessage.isDisplayed();
      assert.strictEqual(isErrorDisplayed, true, 'Error message should be displayed');
      
      // Verify error message content
      const errorText = await errorMessage.getText();
      const expectedErrorMessages = [
        'Invalid login credentials',
        'Invalid username or password',
        'Login failed',
        'Incorrect credentials'
      ];
      
      const isValidErrorMessage = expectedErrorMessages.some(msg => 
        errorText.toLowerCase().includes(msg.toLowerCase())
      );
      
      assert.strictEqual(
        isValidErrorMessage, 
        true, 
        `Expected error message for invalid credentials, but got: ${errorText}`
      );
      
      // Verify user is not logged in (still on login page)
      const currentUrl = await this.driver.getCurrentUrl();
      assert.strictEqual(
        currentUrl.includes('login'), 
        true, 
        'User should remain on login page after invalid login attempt'
      );
      
      console.log('✓ Test passed: Application correctly rejected invalid login credentials');
      
    } catch (error) {
      console.error('✗ Test failed:', error.message);
      throw error;
    }
  }

  async runTest() {
    await this.setUp();
    try {
      await this.testInvalidLogin();
    } finally {
      await this.tearDown();
    }
  }
}

// Export for use in test suites
module.exports = LoginTest;

// Run test if this file is executed directly
if (require.main === module) {
  const loginTest = new LoginTest();
  loginTest.runTest().catch(console.error);
}