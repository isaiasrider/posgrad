import pytest
import cartao
def test_zona_a_unica_vez_debito_6():
    expected = 6
    result = cartao.debito("A")
    assert expected == result

def test_zona_b_unica_vez_debito_8():
    expected = 8
    result = cartao.debito("B")
    assert expected == result