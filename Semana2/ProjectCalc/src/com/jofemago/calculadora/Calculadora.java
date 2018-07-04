/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jofemago.calculadora;

/**
 *
 * @author Pipe
 */
public class Calculadora {
    
    private char esHexadecimalValido(String cadena) {

        String validos = "0123456789ABCDEFabcdef";
        for (char c : cadena.toCharArray()) {
            if (validos.indexOf(c) == -1) {
                return c;
            }
        }
        return '\0';
    }
    
    private char esBinarioValido(String cadena){
        
        String validos  = "01";
        for (char c : cadena.toCharArray()) {
            if (validos.indexOf(c) == -1) {
                return c;
            }
        }
        return '\0';
    }
    
    private char esOctalValido(String cadena){
        
        String validos  = "01234567";
        for (char c : cadena.toCharArray()) {
            if (validos.indexOf(c) == -1) {
                return c;
            }
        }
        return '\0';
    }
    
    private char esDecimalValido(String cadena){
        
        String validos  = "0123456789";
        for (char c : cadena.toCharArray()) {
            if (validos.indexOf(c) == -1) {
                return c;
            }
        }
        
        return '\0';
    }
    

    public String decimalToBinario(String num) throws BadConversionException {
        
        char validacion = this.esDecimalValido(num);
        
        if(validacion != '\0' ){
            throw new BadConversionException("Número decimal invalido");
        }
        
        Long n = Long.parseLong(num, 10);
        return Long.toString(n, 2);
        
    }
    
    public String decimalToHexa(String num) throws BadConversionException {
        
        char validacion = this.esDecimalValido(num);
        
        if(validacion != '\0' ){
            throw new BadConversionException("Número decimal invalido");
        }
        
        Long n = Long.parseLong(num, 10);
        return Long.toString(n, 16);
        
    }
    
    public String decimalToOctal(String num) throws BadConversionException {
        
        char validacion = this.esDecimalValido(num);
        
        if(validacion != '\0' ){
            throw new BadConversionException("Número decimal invalido");
        }
        
        Long n = Long.parseLong(num, 10);
        return Long.toString(n, 8);
        
    }
    
    public String binarioToDecimal(String num) throws BadConversionException {
        
        char validacion = this.esBinarioValido(num);
        
        if(validacion != '\0' ){
            throw new BadConversionException("Número binario invalido");
        }
        
        Long n = Long.parseLong(num, 2);
        return Long.toString(n, 10);
        
    }
    
    public String binarioToHexa(String num) throws BadConversionException {
        
        char validacion = this.esBinarioValido(num);
        
        if(validacion != '\0' ){
            throw new BadConversionException("Número binario invalido");
        }
        
        Long n = Long.parseLong(num, 2);
        return Long.toString(n, 16);
        
    }
    
    public String binarioToOctal(String num) throws BadConversionException {
        
        char validacion = this.esBinarioValido(num);
        
        if(validacion != '\0' ){
            throw new BadConversionException("Número binario invalido");
        }
        
        Long n = Long.parseLong(num, 2);
        return Long.toString(n, 8);
        
    }
    
    public String hexaToDecimal(String num) throws BadConversionException {
        
        char validacion = this.esHexadecimalValido(num);
        
        if(validacion != '\0' ){
            throw new BadConversionException("Número hexadecimal invalido");
        }
        
        Long n = Long.parseLong(num, 16);
        return Long.toString(n, 10);
        
    }
    
    public String hexaToBinario(String num) throws BadConversionException {
        
        char validacion = this.esHexadecimalValido(num);
        
        if(validacion != '\0' ){
            throw new BadConversionException("Número hexadecimal invalido");
        }
        
        Long n = Long.parseLong(num, 16);
        return Long.toString(n, 2);
        
    }
    
    public String hexaToOctal(String num) throws BadConversionException {
        
        char validacion = this.esHexadecimalValido(num);
        
        if(validacion != '\0' ){
            throw new BadConversionException("Número hexadecimal invalido");
        }
        
        Long n = Long.parseLong(num, 16);
        return Long.toString(n, 8);
        
    }
    
    
    
    public String octalToHexa(String num) throws BadConversionException {
        
        char validacion = this.esOctalValido(num);
        
        if(validacion != '\0' ){
            throw new BadConversionException("Número octal invalido");
        }
        
        Long n = Long.parseLong(num, 8);
        return Long.toString(n, 16);
        
    }
    
    public String octalToDecimal(String num) throws BadConversionException {
        
        char validacion = this.esOctalValido(num);
        
        if(validacion != '\0' ){
            throw new BadConversionException("Número octal invalido");
        }
        
        Long n = Long.parseLong(num, 8);
        return Long.toString(n, 10);
        
    }
    
    public String octalToBinario(String num) throws BadConversionException {
        
        char validacion = this.esOctalValido(num);
        
        if(validacion != '\0' ){
            throw new BadConversionException("Número octal invalido");
        }
        
        Long n = Long.parseLong(num, 8);
        return Long.toString(n, 2);
        
    }
    
    private String sumaDecimal(String op1, String op2) throws InvalidOperatorException{
        
        char o1 = this.esDecimalValido(op1);
        char o2 = this.esDecimalValido(op2);
        
        if(o1 != '\0' || o2 != '\0'){
            
            throw new InvalidOperatorException("Un operando esta mal escrito");
        }
        
        Long a = Long.parseLong(op1, 10);
        Long b = Long.parseLong(op2, 10);
        
        Long res  = a + b;
        return Long.toString(res, 10);
        
    }
    private String sumaBinaria(String op1, String op2) throws InvalidOperatorException{
        
        char o1 = this.esBinarioValido(op1);
        char o2 = this.esBinarioValido(op2);
        
        if(o1 != '\0' || o2 != '\0'){
            
            throw new InvalidOperatorException("Un operando esta mal escrito");
        }
        
        Long a = Long.parseLong(op1, 2);
        Long b = Long.parseLong(op2, 2);
        
        Long res  = a + b;
        return Long.toString(res, 2);
        
    }
    private String sumaOctal(String op1, String op2) throws InvalidOperatorException{
        
        char o1 = this.esOctalValido(op1);
        char o2 = this.esOctalValido(op2);
        
        if(o1 != '\0' || o2 != '\0'){
            
            throw new InvalidOperatorException("Un operando esta mal escrito");
        }
        
        Long a = Long.parseLong(op1, 8);
        Long b = Long.parseLong(op2, 8);
        
        Long res  = a + b;
        return Long.toString(res, 8);
        
    }
    private String sumaHexa(String op1, String op2) throws InvalidOperatorException{
        
        char o1 = this.esHexadecimalValido(op1);
        char o2 = this.esHexadecimalValido(op2);
        
        if(o1 != '\0' || o2 != '\0'){
            
            throw new InvalidOperatorException("Un operando esta mal escrito");
        }
        
        Long a = Long.parseLong(op1, 16);
        Long b = Long.parseLong(op2, 16);
        
        Long res  = a + b;
        return Long.toString(res, 16);
        
    }
    
    public String suma(String ope1, String ope2, int radix) throws InvalidOperatorException{
        
        switch (radix) {
            case 2:
                return this.sumaBinaria(ope1, ope2);
                //break;   
            case 8:
                return this.sumaOctal(ope1, ope2);
                //break;
            case 10:
                return this.sumaDecimal(ope1, ope2);
               // break;
            case 16:
                return this.sumaHexa(ope1, ope2);
                //break;
            default:
                throw new AssertionError();
        }
        
    }
    
    private String restaDecimal(String op1, String op2) throws InvalidOperatorException{
        
        char o1 = this.esDecimalValido(op1);
        char o2 = this.esDecimalValido(op2);
        
        if(o1 != '\0' || o2 != '\0'){
            
            throw new InvalidOperatorException("Un operando esta mal escrito");
        }
        
        Long a = Long.parseLong(op1, 10);
        Long b = Long.parseLong(op2, 10);
        
        Long res  = a - b;
        return Long.toString(res, 10);
        
    }
    private String restaBinaria(String op1, String op2) throws InvalidOperatorException{
        
        char o1 = this.esBinarioValido(op1);
        char o2 = this.esBinarioValido(op2);
        
        if(o1 != '\0' || o2 != '\0'){
            
            throw new InvalidOperatorException("Un operando esta mal escrito");
        }
        
        Long a = Long.parseLong(op1, 2);
        Long b = Long.parseLong(op2, 2);
        
        Long res  = a - b;
        return Long.toString(res, 2);
        
    }
    private String restaOctal(String op1, String op2) throws InvalidOperatorException{
        
        char o1 = this.esOctalValido(op1);
        char o2 = this.esOctalValido(op2);
        
        if(o1 != '\0' || o2 != '\0'){
            
            throw new InvalidOperatorException("Un operando esta mal escrito");
        }
        
        Long a = Long.parseLong(op1, 8);
        Long b = Long.parseLong(op2, 8);
        
        Long res  = a - b;
        return Long.toString(res, 8);
        
    }
    private String restaHexa(String op1, String op2) throws InvalidOperatorException{
        
        char o1 = this.esHexadecimalValido(op1);
        char o2 = this.esHexadecimalValido(op2);
        
        if(o1 != '\0' || o2 != '\0'){
            
            throw new InvalidOperatorException("Un operando esta mal escrito");
        }
        
        Long a = Long.parseLong(op1, 16);
        Long b = Long.parseLong(op2, 16);
        
        Long res  = a - b;
        return Long.toString(res, 16);
        
    }
    
    
    public String resta(String ope1, String ope2, int radix) throws InvalidOperatorException{
        
        switch (radix) {
            case 2:
                return this.restaBinaria(ope1, ope2);
                //break;   
            case 8:
                return this.restaOctal(ope1, ope2);
                //break;
            case 10:
                return this.restaDecimal(ope1, ope2);
               // break;
            case 16:
                return this.restaHexa(ope1, ope2);
                //break;
            default:
                throw new AssertionError();
        }
    }
    
    private String multDecimal(String op1, String op2) throws InvalidOperatorException{
        
        char o1 = this.esDecimalValido(op1);
        char o2 = this.esDecimalValido(op2);
        
        if(o1 != '\0' || o2 != '\0'){
            
            throw new InvalidOperatorException("Un operando esta mal escrito");
        }
        
        Long a = Long.parseLong(op1, 10);
        Long b = Long.parseLong(op2, 10);
        
        Long res  = a * b;
        return Long.toString(res, 10);
        
    }
    private String multBinaria(String op1, String op2) throws InvalidOperatorException{
        
        char o1 = this.esBinarioValido(op1);
        char o2 = this.esBinarioValido(op2);
        
        if(o1 != '\0' || o2 != '\0'){
            
            throw new InvalidOperatorException("Un operando esta mal escrito");
        }
        
        Long a = Long.parseLong(op1, 2);
        Long b = Long.parseLong(op2, 2);
        
        Long res  = a * b;
        return Long.toString(res, 2);
        
    }
    private String multOctal(String op1, String op2) throws InvalidOperatorException{
        
        char o1 = this.esOctalValido(op1);
        char o2 = this.esOctalValido(op2);
        
        if(o1 != '\0' || o2 != '\0'){
            
            throw new InvalidOperatorException("Un operando esta mal escrito");
        }
        
        Long a = Long.parseLong(op1, 8);
        Long b = Long.parseLong(op2, 8);
        
        Long res  = a * b;
        return Long.toString(res, 8);
        
    }
    private String multHexa(String op1, String op2) throws InvalidOperatorException{
        
        char o1 = this.esHexadecimalValido(op1);
        char o2 = this.esHexadecimalValido(op2);
        
        if(o1 != '\0' || o2 != '\0'){
            
            throw new InvalidOperatorException("Un operando esta mal escrito");
        }
        
        Long a = Long.parseLong(op1, 16);
        Long b = Long.parseLong(op2, 16);
        
        Long res  = a * b;
        return Long.toString(res, 16);
        
    }
    
    public String multiplicacion(String ope1, String ope2, int radix) throws InvalidOperatorException{
        switch (radix) {
            case 2:
                return this.multBinaria(ope1, ope2);
                //break;   
            case 8:
                return this.multOctal(ope1, ope2);
                //break;
            case 10:
                return this.multDecimal(ope1, ope2);
               // break;
            case 16:
                return this.multHexa(ope1, ope2);
                //break;
            default:
                throw new AssertionError();
        }
    }
    
    private String divDecimal(String op1, String op2) throws InvalidOperatorException{
        
        char o1 = this.esDecimalValido(op1);
        char o2 = this.esDecimalValido(op2);
        
        if(o1 != '\0' || o2 != '\0'){
            
            throw new InvalidOperatorException("Un operando esta mal escrito");
        }
        
        Long a = Long.parseLong(op1, 10);
        Long b = Long.parseLong(op2, 10);
        
        if(b == 0){
            throw new InvalidOperatorException("Invalida division por 0");
        }
        
        Long res  = a / b;
        return Long.toString(res, 10);
        
    }
    private String divBinaria(String op1, String op2) throws InvalidOperatorException{
        
        char o1 = this.esBinarioValido(op1);
        char o2 = this.esBinarioValido(op2);
        
        if(o1 != '\0' || o2 != '\0'){
            
            throw new InvalidOperatorException("Un operando esta mal escrito");
        }
        
        Long a = Long.parseLong(op1, 2);
        Long b = Long.parseLong(op2, 2);
        
        if(b == 0){
            throw new InvalidOperatorException("Invalida division por 0");
        }
        
        Long res  = a / b;
        return Long.toString(res, 2);
        
    }
    private String divOctal(String op1, String op2) throws InvalidOperatorException{
        
        char o1 = this.esOctalValido(op1);
        char o2 = this.esOctalValido(op2);
        
        if(o1 != '\0' || o2 != '\0'){
            
            throw new InvalidOperatorException("Un operando esta mal escrito");
        }
        
        Long a = Long.parseLong(op1, 8);
        Long b = Long.parseLong(op2, 8);
        
        
        if(b == 0){
            throw new InvalidOperatorException("Invalida division por 0");
        }
        Long res  = a / b;
        return Long.toString(res, 8);
        
    }
    private String divHexa(String op1, String op2) throws InvalidOperatorException{
        
        char o1 = this.esHexadecimalValido(op1);
        char o2 = this.esHexadecimalValido(op2);
        
        if(o1 != '\0' || o2 != '\0'){
            
            throw new InvalidOperatorException("Un operando esta mal escrito");
        }
        
        Long a = Long.parseLong(op1, 16);
        Long b = Long.parseLong(op2, 16);
        
        if(b == 0){
            throw new InvalidOperatorException("Invalida division por 0");
        }
        
        Long res  = a / b;
        return Long.toString(res, 16);
        
    }
    
    public String division(String ope1, String ope2, int radix) throws InvalidOperatorException{
        
        switch (radix) {
            case 2:
                return this.divBinaria(ope1, ope2);
                //break;   
            case 8:
                return this.divOctal(ope1, ope2);
                //break;
            case 10:
                return this.divDecimal(ope1, ope2);
               // break;
            case 16:
                return this.divHexa(ope1, ope2);
                //break;
            default:
                throw new AssertionError();
        }
    }
    
    
    public String inverso(String op) throws InvalidOperatorException{
        
        char car = this.esDecimalValido(op);
        if(car != '\0')
            throw new InvalidOperatorException("El numero que quiere invertir no es decimal");
        
        Double n = Double.parseDouble(op);
        
        if(n == 0.0){
            throw new InvalidOperatorException("El numero que quiere invertir  es 0");
        }
        Double res = 1 / n;
        
        return Double.toString(res);
    }
}
