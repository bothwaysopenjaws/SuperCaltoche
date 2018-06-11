package com.iia.calculette.ui;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.iia.calculette.ui.UIConsole;

public class UIConsoleTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    
    @Test
    public void testDisplay() {
        UIConsole testUI = UIConsole.getUIConsole();
        //testUI.display("test");
        System.out.print("test");
        assertEquals("test", outContent.toString());
    }
    
    @Test
    public void testGetContent() {

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
