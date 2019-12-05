package com.example.myviewmodel2;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class MainViewModelTest {
    private MainViewModel mainViewModel;

    @Before
    public void init() {
        mainViewModel = new MainViewModel();
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void calculate() {
        String lebar = "1";
        String panjang = "2";
        String tinggi = "3";
        mainViewModel.calculate(lebar, panjang, tinggi);
        assertEquals(6, mainViewModel.hasil);
    }

    @Test
    public void doubleInputCalculateTest() {
        String width = "1";
        String length = "2.4";
        String height = "3";

        thrown.expect(NumberFormatException.class);
        thrown.expectMessage("For input string: \"2.4\"");
        mainViewModel.calculate(width, height, length);
    }
    @Test
    public void characterInputCalculateTest() throws NumberFormatException {
        String width = "1";
        String length = "A";
        String height = "3";
        thrown.expect(NumberFormatException.class);
        thrown.expectMessage("For input string: \"A\"");
        mainViewModel.calculate(width, length, height);
    }


    @Test
    public void emptyInputCalculateTest() throws NumberFormatException {
        String width = "1";
        String length = "";
        String height = "3";
        thrown.expect(NumberFormatException.class);
        thrown.expectMessage("For input string: \"\"");
        mainViewModel.calculate(width, height, length);
    }
}