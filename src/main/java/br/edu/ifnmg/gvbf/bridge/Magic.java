/*
 * The MIT License
 *
 * Copyright 2022 GahFerreira.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package br.edu.ifnmg.gvbf.bridge;

/**
 * Classe que representa as cartas do jogo Magic.
 *
 * @author GahFerreira
 * @version 1.0, 13/06/2022
 */
public class Magic extends Carta
{
    private String cor;
    private String tipo;

    public Magic(String cor, String tipo, Modelo modelo)
    {
        super(modelo);
        this.cor = cor;
        this.tipo = tipo;
    }
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getCor()
    {
        return cor;
    }

    public void setCor(String cor)
    {
        this.cor = cor;
    }
//</editor-fold>
    
    @Override
    public void produzir()
    {
        System.out.printf("Produziu 1 Carta de Magic " + cor + " do tipo " + tipo + " ");
        modelo.imprimir();
    }
}
