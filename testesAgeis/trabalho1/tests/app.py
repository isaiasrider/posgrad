from flask import Flask

meu_web_app = Flask("meu_web_app")

@meu_web_app.route('/')
def pagina_inicial():
    return ''

if __name__ == "__main__":
    meu_web_app.run()