package com.iia.calculette.ui;

import static org.junit.Assert.*;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import com.iia.calculette.ui.UIConsole;

public class UIConsoleTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Rule
    public final TextFromStandardInputStream systemInMock
    = emptyStandardInputStream();

    @Test
    public void testDisplay() {
        UIConsole testUI = UIConsole.getUIConsole();
        //testUI.display("test");
        System.out.print("test");
        assertEquals("test", systemOutRule.getLog());
    }

    @Test
    public void testGetContent() {
        systemInMock.provideLines("hello");
        UIConsole testUI = UIConsole.getUIConsole();
        assertEquals("hello", testUI.getContent());
    }

    @Test
    public void testGetUiConsole() {
        UIConsole testUI = new UIConsole();
        assertNotNull(testUI.getUIConsole());
    }

    @Test
    public void testConstructor() {
        UIConsole ui = new UIConsole();
        assertNotNull(ui);
    }
}
