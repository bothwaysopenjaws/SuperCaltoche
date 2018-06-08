package com.iia.ui;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.iia.ui.UIConsole;

public class UIConsoleTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    
    @Test
    public void displayTest() {
        UIConsole testUI = UIConsole.getUIConsole();
        //testUI.display("test");
        System.out.print("test");
        assertEquals("test", outContent.toString());
    }
    
    @Test
    public void getContentTest() {

    }
    
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(System.out);
        System.setErr(System.err);
    }

}