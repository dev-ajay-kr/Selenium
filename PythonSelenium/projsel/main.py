from selenium import webdriver

driver = webdriver.Edge()
driver.get("https://google.co.in")

# driver=webdriver.Firefox(executable_path=’C:\Selenium\geckodriver.exe)
driver.get('http://www.google.com')


    id = driver.find_elements_by_xpath("//*[@class]")
for value in id:
    print(value.get_attribute('class'))


# print('TestCase Failed:

driver.close()
