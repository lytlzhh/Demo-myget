package com.example.llw.demo_myget;

import java.io.Serializable;

/**
 * Created by llw on 2015/11/5.
 */
public class set_string implements Serializable {
    String set_string_text = null;
    String set_string_content = null;

    public void setSet_string_text(String set_string_text) {
        this.set_string_text = set_string_text;
    }

    public String getSet_string_text() {
        return set_string_text;
    }

    public void setSet_string_content(String set_string_content) {
        this.set_string_content = set_string_content;
    }

    public String getSet_string_content() {
        return set_string_content;
    }
}
