#encoding:utf-8--##
import pytest
import cartao
import sys


def test_zona_a_unica_vez_debito_6():
    expected = 6
    result = cartao.debito("A","unico")
    assert expected == result

def test_zona_b_unica_vez_debito_7():
    expected = 7
    result = cartao.debito("B","unico")
    assert expected == result

def test_zona_a_dia_debito():
    expected = 10
    result = cartao.debito("A","dia")
    assert expected == result