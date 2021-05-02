def debito(zona,plano):
    if zona == "A" and plano == "unico":
      valor_plano_escolhido = 6
    elif zona == "A" and plano == "dia":
      valor_plano_escolhido = 10
    elif zona == "A" and plano == "semana":
        valor_plano_escolhido = 30
    elif zona == "A" and plano == "mes":
        valor_plano_escolhido = 130
    elif zona == "B" and plano == "unico":
      valor_plano_escolhido = 7
    elif zona == "B" and plano == "dia":
        valor_plano_escolhido = 12
    elif zona == "B" and plano == "semana":
        valor_plano_escolhido = 45
    elif zona == "B" and plano == "mes":
        valor_plano_escolhido = 170
    return valor_plano_escolhido

