package com.nareshtech.loginfortesting

import org.junit.Test
import org.junit.Assert.*
class LoginFuncTest {

    @Test
    fun validLogin_returnsTrue(){
        assertTrue(isLoginValid("admin","password123"))
    }

    @Test
    fun InvalidLogin_returnsFalse(){
        assertFalse(isLoginValid("admin", "pass234"))
        assertFalse(isLoginValid("admin3", "pass234"))
    }

    fun isLoginValid(uname:String, pass:String):Boolean{
        return uname == "admin" && pass == "password123"
    }
}