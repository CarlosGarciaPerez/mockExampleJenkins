package com.testUnitarios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MethosExamplesTest {

    private MethosExamples example;

    @BeforeEach
    public void Init() {
        System.out.println("Before each test");
        this.example = new MethosExamples();
    }

    @Test
    public void testSumar() {
        //Given
        int numberA = 3;
        int numberB = 3;
        // When
        int result = example.sumar(numberA, numberB);

        //Then
        assertEquals(6, result);
        assertNotNull(result);
        assertInstanceOf(Integer.class, result);
    }

    @Test
    public void testCheckPositivo() {
        //Given
        int number = 4;
        //When
        Boolean result = example.checkPositivo(number);
        //Then
        assertTrue(result);
    }

    @Test
    public void testCheckPositivoErrot() {
        //Given
        int number = -4;
        //Then
        assertThrows(IllegalArgumentException.class, () -> {
            example.checkPositivo(number);
        });


    }

    @Test
    public void testcontarLetrasA() {
        //Given
        String cadena = "holacomohasestado?";

        //When
        int resul = example.contarLetrasA(cadena);
        //Then
        assertNotNull(resul);
        assertEquals(3, resul);
    }

    @Test
    public void testcontarLetrasAError() {
        //Given
        List<String> countries = List.of("Colombia", "Mexico", "Peru");
        String country  = "Colombia";
        //When
        boolean result = this.example.contieneElemento(countries, country);
        //Then
        assertTrue(result);

    }

    @Test
    public void testRevertirCadena(){
        //Given
        String cadena = "aloh";
        //When
        String result = example.revertirCadena(cadena);
        //Then
        assertNotNull(result);
        assertEquals("hola", result);
    }

    @Test
    public void  testFactorial(){
        //Given
        int number = 6;
        //When
        long result = this.example.factorial(number);
        //Then
        assertEquals(720, result);
    }

    @Test
    public void testfactorialError(){
        //Given
        int number = -6;
        //Then
        assertThrows(IllegalArgumentException.class, () -> {
            this.example.factorial(number);
        });
    }

    @Test
    public void testEsprimo(){
        //Given
        int number = 3;
        //When
        boolean result = this.example.esPrimo(number);
        //Then
        assertTrue(result);

    }

    @Test
    public void testEsprimoMayorCuatro(){
        //Given
        int number = 7;
        //When
        boolean result = this.example.esPrimo(number);
        //Then
        assertTrue(result);

    }

    @Test
    public void testEsprimoLessThanOne() {
        //Given
        int number = 1;
        //When
        boolean result = this.example.esPrimo(number);
        //Then
        assertFalse(result);
    }

    @Test
    public void tesNotEsprimo(){
        //Given
        int number = 8;
        //When
        boolean result = this.example.esPrimo(number);
        //Then
        assertFalse(result);
    }

    @Test
    public void testMensajeConRetraso() throws InterruptedException {
        //Given

        //When
        String result =this.example.mensajeConRetraso();
        //Then
        assertEquals("Listo después de retraso", result);

    }

    @Test
    public void testConvertirAString() {
        // Given
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // When
        List<String> result = this.example.convertirAString(numbers);

        // Then
        assertEquals(List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10"), result);
    }

    @Test
    public void testCalcularMedia() {
        // Given
        List<Integer> numbers = List.of(1, 2, 3);
        // When
        double result = this.example.calcularMedia(numbers);
        // Then
        assertEquals(2, result);
    }

    @Test
    public void testCalcularMediaNull() {
        // Given
        List<Integer> numbers = null;

        // When - Then
        assertThrows(IllegalArgumentException.class, () -> {
            this.example.calcularMedia(numbers);
        });
    }

    @Test
    public void testCalcularMediaEmpty() {
        // Given
        List<Integer> numbers = Collections.emptyList();

        // When - Then
        assertThrows(IllegalArgumentException.class, () -> {
            this.example.calcularMedia(numbers);
        });
    }



}
