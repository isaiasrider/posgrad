from selenium import webdriver
from webdriver_manager.chrome import ChromeDriverManager
from getpass import getpass

login = input('Digite seu e-mail Amazon: ')
pwd = getpass(prompt='Digite sua senha Amazon: ')
try:
    driver = webdriver.Chrome(ChromeDriverManager().install())
    # driver = webdriver.Firefox(executable_path="./drivers/geckodriver")
    driver.get('https://www.amazon.com.br/ap/signin?_encoding=UTF8&openid.assoc_handle=brflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com.br%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dgno_signin')
    driver.implicitly_wait(15)

    loginField = driver.find_element_by_id('ap_email')
    loginField.send_keys(login)

    nextButton = driver.find_element_by_id('continue')
    nextButton.click()

    passwordField = driver.find_element_by_id('ap_password')
    passwordField.send_keys(pwd)

    nextButton = driver.find_element_by_id('signInSubmit')
    nextButton.click()

    print('Logado na sua conta Amazon com sucesso.')
except:
    print('Falha ao logar na conta Amazon.')