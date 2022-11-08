from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By

sreob = Service("C:/Selenium_Data/chromedriver_win32/chromedriver.exe")
#
driver = webdriver.Chrome(service=sreob)
#driver = webdriver.Chrome()
driver.get("https://www.google.co.in/")
driver.find_element(By.NAME, "q").send_keys("Admin")
driver.find_element(By.NAME, "btnK").click()

# driver.quit()

# driver.get("https://opensource-demo.orangehrmlive.com/")
#
# driver.find_element(By.NAME, "username").send_keys("Admin")
# driver.find_element(By.NAME, "password").send_keys("admin123")
# driver.find_element(By.CLASS_NAME,"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button").click()
# driver.__exit__()
print("Test Passed")
# driver = webdriver.Chrome("C:/Selenium_Data/chromedriver_win32/chromedriver.exe")
#
# driver.get("https://opensource-demo.orangehrmlive.com/")
# driver.find_element_by_name("username")
# vegetable = driver.find_element(By.CLASS_NAME, "username")
# driver.find_element(By.NAME, "username").send_keys("Admin")
