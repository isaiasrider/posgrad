def debito(zona,plano):
    if zona == "A" and plano == "unico":
      valor_plano_escolhido = 6
    elif zona == "A" and plano == "dia":
      valor_plano_escolhido = 10
    elif zona == "B" and plano == "unico":
      valor_plano_escolhido = 7
    return valor_plano_escolhido
