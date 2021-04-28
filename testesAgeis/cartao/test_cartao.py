import pytest
import cartao
def test_zona_a_unica_vez_debito_6():
    expected = 6
    result = cartao.debito("A","unico")
    assert expected == result

def test_zona_b_unica_vez_debito_8():
    expected = 8
    result = cartao.debito("B","unico")
    assert expected == result

def test_zona_a_dia_debito():
    expected = 10
    result = cartao.debito("A","dia")
    assert expected == result